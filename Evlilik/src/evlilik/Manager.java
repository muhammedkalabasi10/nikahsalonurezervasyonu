package evlilik;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
//founder ve admin bu abstract classtan kalıtım alıyor
public abstract class Manager {
    private String adSoyad;
    private String userName;
    private String password;
    
    public Manager() {
    }
    
    public Manager(String adSoyad, String userName, String password) {
        this.adSoyad = adSoyad;
        this.userName = userName;
        this.password = password;
    }
    
    public boolean salonEkle(String sehir, String ilce){
        boolean isSehir=false;
        boolean isIlce=false;
        int sehir_id=0;
        //veritabanında kontrol sağlamak ve eklemek için kullanıcının girdiği bilgilerin baş harfleri büyültülüyor
        sehir=sehir.substring(0,1).toUpperCase()+sehir.substring(1).toLowerCase();
        ilce=ilce.substring(0,1).toUpperCase()+ilce.substring(1).toLowerCase();
        try{
            DBConnection db=new DBConnection();
            Connection con=db.ConnDB();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("SELECT * FROM citys WHERE city_name='"+sehir+"'");
            while(rs.next()){
                isSehir=true;
                //veritabanında kullanıcının girdiği şehrin olup olmadığı kontrol ediliyor eğer var ise şehir id'si çekiliyor
                sehir_id=rs.getInt("city_id");
            }
            rs.close();
            if(isSehir==false){
                //eğer veritabanında daha önce böyle bir şehir bulunamadıysa yeni şehir ekleniyor
                PreparedStatement pre=con.prepareStatement("INSERT INTO citys "+"(city_name) VALUES"+"(?)");
                pre.setString(1, sehir);
                pre.executeUpdate();
                pre.close();
            }
            ResultSet rs2=st.executeQuery("SELECT * FROM citys WHERE city_name='"+sehir+"'");
            while(rs2.next()){
                sehir_id=rs2.getInt("city_id");
            }
            ResultSet rs3=st.executeQuery("SELECT * FROM districts WHERE name='"+ilce+"' and city_id='"+sehir_id+"'");
            while(rs3.next()){
                //girilen isimde bir ilcenin olup olmadığı kontrol ediliyor
                isIlce=true;
            }
            rs3.close();
            if(isIlce==true){
                //eğer aynı şehir ve ilçede daha önce salon var ise bu koşulu gerçekleştiriyor
                JOptionPane.showMessageDialog(null, "AYNI İL VE İLÇEDE BAŞKA BİR SALON EKLEYEMEZSİNİZ!!!");
                return false;
            }else{
                PreparedStatement pre2=con.prepareStatement("INSERT INTO districts "+"(name, city_id) VALUES"+"(?,?)");
                pre2.setString(1, ilce);
                pre2.setInt(2, sehir_id);
                pre2.executeUpdate();
                return true;
            }
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean salonSil(String sehir, String ilce){
        DBConnection db=new DBConnection();
        int sehir_id=0;
        int ctrl=0;
        try{
            Connection con=db.ConnDB();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("SELECT * FROM citys WHERE city_name='"+sehir+"'");
            while(rs.next()){
                sehir_id=rs.getInt("city_id");
            }
            PreparedStatement pre=con.prepareStatement("DELETE FROM districts WHERE name='"+ilce+"' and city_id='"+sehir_id+"'");
            pre.execute();
            ResultSet rs2=st.executeQuery("SELECT * FROM districts WHERE city_id='"+sehir_id+"'");
            while(rs2.next()){
                ctrl++;
            }
            if(ctrl==0){
                //eğer şehirdeki bütün ilçeler yani salonlar silinir ise şehir de siliniyor
                PreparedStatement pre2=con.prepareStatement("DELETE FROM citys WHERE city_id='"+sehir_id+"'");
                pre2.execute();
            }
            return true;
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    
    public ArrayList<User> hesaplariGor(){
        ArrayList<User> usrArr=new ArrayList<>();
        User usr;
        DBConnection db=new DBConnection();
        try{
            Connection con=db.ConnDB();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("SELECT * FROM users");
            while(rs.next()){
                //veritabanından bütün kullanıcılar çekilip arrayliste aktarılıyor
                usrArr.add(usr=new User(rs.getInt("account_id")));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return usrArr;
    }
    
    public ArrayList<Reservation> rezervasyonlariGor(){
        ArrayList<Reservation> rezArr=new ArrayList<>();
        Reservation rez;
        DBConnection db=new DBConnection();
        try{
            Connection con=db.ConnDB();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("SELECT * FROM reservations");
            while(rs.next()){
                //veritabanından bütün rezervasyonlar çekilip arrayliste aktarılıyor
                rezArr.add(rez=new Reservation(rs.getInt("reservation_id")));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return rezArr;
    }
    //founder ve admin yetkileri farklı olduğundan dolayı abstract metotlar oluşturuldu
    public abstract boolean adminEkle(String ad_soyad, String username, String password, boolean founder);
    public abstract boolean adminSil(String username, String password);
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }
}
