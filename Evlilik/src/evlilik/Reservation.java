package evlilik;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class Reservation {
    private String city;
    private String venue;
    private String hall;
    private String time;
    private String cocktail;
    private int account_id;
    private int rez_id=0;
    private boolean ct;
    
    public Reservation(User usr){
        //kullanıcı bilgileri ile rezervasyon nesnesi oluşturmak için bu constructor oluşturuldu - overloading
        DBConnection db=new DBConnection();
        try{
            Connection con=db.ConnDB();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("SELECT * FROM reservations WHERE account_id='"+usr.getAccount_id()+"'");
            if(rs.next()){
                setCt(rs.getBoolean("cocktail"));
                this.city=rs.getString("city");
                this.venue=rs.getString("venue");
                this.hall=rs.getString("hall");
                this.time=rs.getString("time");
                this.account_id=rs.getInt("account_id");
                this.rez_id=rs.getInt("reservation_id");
                st.close();
                con.close();
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        if(isCt()){
            setCocktail("Kokteyl Var");
        }else{
            setCocktail("Kokteyl Yok");
        }
    }
    public Reservation(int reservation_id){
        //rezervasyon id'si ile rezervasyon nesnesi oluşturmak için bu constructor oluşturuldu -overloading
        this.rez_id=reservation_id;
        DBConnection db=new DBConnection();
        try{
            Connection con=db.ConnDB();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("SELECT * FROM reservations WHERE reservation_id='"+reservation_id+"'");
            if(rs.next()){
                setCt(rs.getBoolean("cocktail"));
                this.city=rs.getString("city");
                this.venue=rs.getString("venue");
                this.hall=rs.getString("hall");
                this.time=rs.getString("time");
                this.account_id=rs.getInt("account_id");
                st.close();
                con.close();
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        if(isCt()){
            setCocktail("Kokteyl Var");
        }else{
            setCocktail("Kokteyl Yok");
        }
    }
    
    public Reservation(User usr, String city, String venue, String hall, String time, boolean cocktail){
        this.account_id=usr.getAccount_id();
        this.city=city;
        this.venue=venue;
        this.hall=hall;
        this.time=time;
        this.ct=cocktail;
    }
    
    public String[] getData(){
        //Rezervasyon bilgilerini dizi kullanarak geri döndüren metot
        String data[]={this.city,this.venue,this.hall,this.time,this.cocktail};
        return data;
    }
    public boolean newRez(){
        boolean process=false;
        boolean ctrl;
        try{
            DBConnection db=new DBConnection();
            Connection con=db.ConnDB();
            ctrl=rezControl(city, venue, hall, time);
            Statement st=con.createStatement();
            if(ctrl==true){
                //eğer belirtilen yerde belirtilen tarihte rezervasyon yok ise yeni rezervasyon oluşturuluyor
                PreparedStatement pre=con.prepareStatement("INSERT INTO reservations "+"(account_id, city, venue, hall, time, cocktail) VALUES"+"(?,?,?,?,?,?)");
                pre.setInt(1, account_id);
                pre.setString(2, city);
                pre.setString(3, venue);
                pre.setString(4, hall);
                pre.setString(5, time);
                pre.setBoolean(6, ct);
                pre.executeUpdate();
                st.close();
                pre.close();
                con.close();
                process=true;
            }
            else{
                JOptionPane.showMessageDialog(null, "BU TARİHTE BU YER DOLUDUR!");
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        if(process==true){
            return true;
        }
        else{
            return false;
        }
    }
    public void deleteRez(){
        DBConnection db=new DBConnection();
            try{
                Connection con=db.ConnDB();
                //eğer belirtilen bilgilerde bir rezervasyon var ise rezervasyon siliniyor
                PreparedStatement pre=con.prepareStatement("DELETE FROM reservations WHERE reservation_id='"+this.rez_id+"'");
                pre.execute();
                JOptionPane.showMessageDialog(null, "Rezervasyon SİLİNDİ...");
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Silme İşlemi BAŞARISIZ!!!");
            }
    }
    
    public static boolean rezControl(String city, String venue, String hall, String date){
        try{
            //belirtilen tarih ve yerde rezervasyonun olup olmadığı kontrol ediliyor
            DBConnection db=new DBConnection();
            Connection con=db.ConnDB();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("SELECT * FROM reservations WHERE city='"+city+"'AND venue='"+venue+"'AND hall='"+hall+"'AND time='"+date+"'");
            if(rs.next()){
                return false;
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Kontrol Hatasi");
            return false;
        }
        return true;
    }
    
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getHall() {
        return hall;
    }

    public void setHall(String hall) {
        this.hall = hall;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCocktail() {
        return cocktail;
    }

    public void setCocktail(String cocktail) {
        this.cocktail = cocktail;
    }

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public int getRez_id() {
        return rez_id;
    }

    public void setRez_id(int rez_id) {
        this.rez_id = rez_id;
    }

    public boolean isCt() {
        return ct;
    }

    public void setCt(boolean ct) {
        this.ct = ct;
    }
    
}
