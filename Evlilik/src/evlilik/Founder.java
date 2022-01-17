package evlilik;
import java.sql.*;
import javax.swing.JOptionPane;
//manager abstract classından kalıtım alınarak oluşturuldu
public class Founder extends Manager{
    Founder(String adSoyad, String userName, String password){
        super(adSoyad, userName, password);
    }
    public boolean adminEkle(String ad_soyad, String username, String password, boolean founder){
        //overriding
        DBConnection db=new DBConnection();
        boolean isthere=false;
        try{
            Connection con=db.ConnDB();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("SELECT * FROM admins WHERE username='"+username+"'");
            while(rs.next()){
                isthere=true;
                //aynı kullanıcı adında admin olup olmadığı kontrol ediliyor
            }
            rs.close();
            st.close();
            if(isthere==false){
                //eğer aynı kullanıcı adında başka bir admin yoksa admin ekleme işlemi devam ediyor
                PreparedStatement pre=con.prepareStatement("INSERT INTO admins "+"(ad_soyad, username, password, founder) VALUES "+"(?,?,?,?)");
                pre.setString(1, ad_soyad);
                pre.setString(2, username);
                pre.setString(3, password);
                pre.setBoolean(4, founder);
                pre.executeUpdate();
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "AYNI ISIMDE BASKA BIR ADMIN EKLEYEMEZSIN!!!");
                return false;
            }
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean adminSil(String username, String Password){
        //overriding
        DBConnection db=new DBConnection();
        boolean isthere=false;
        try{
            int kurucuSayisi=0;
            Connection con=db.ConnDB();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("SELECT * FROM admins WHERE founder='"+(1)+"'");
            while(rs.next()){
                //veritabanında kaç tane kurucu hesabı olduğu sayılıyor
                kurucuSayisi++;
            }
            rs.close();
            ResultSet rs2=st.executeQuery("SELECT * FROM admins WHERE username='"+username+"' and password='"+Password+"'");
            while(rs2.next()){
                //yöneticinin girdiği bilgiler ile veritabanında bu bilgilerde bir adminin olup olmadığı kontrol ediliyor
                isthere=true;
            }
            rs2.close();
            st.close();
            if(isthere==true){
                //eğer yöneticinin girdiği bilgilerde bir admin var ise admin silme işlemi devam ediyor
                if(kurucuSayisi<2 && username.equals(super.getUserName())){
                    //eğer 2'den daha az kurucu admin kalmış ise kurucu admin silinmiyor
                    JOptionPane.showMessageDialog(null, "SON KURUCU HESABINI SİLEMEZSİNİZ!!!");
                    return false;
                }else{
                    PreparedStatement pre=con.prepareStatement("DELETE FROM admins WHERE username='"+username+"' and password='"+Password+"'");
                    pre.execute();
                    return true;
                    
                }
            }else{
                JOptionPane.showMessageDialog(null, "Admin Bulunamadi!!!");
                return false;
            }
            
        }catch(SQLException e){
            return false;
        }
    }
    
}
