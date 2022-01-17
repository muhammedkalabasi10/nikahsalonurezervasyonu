package evlilik;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

//Bu class kurucu olmayan adminler içindir
public class Admin extends Manager{
    private String adSoyad;
    private String userName;
    private String password;
    
    public Admin(){
    }
    
    public Admin(String adSoyad,String userName, String password) {
        this.adSoyad=adSoyad;
        this.userName = userName;
        this.password = password;
    }
    
    public boolean adminEkle(String ad_soyad, String username, String password, boolean founder){
        //kurucu olmayan adminler admin ekleyemediği için her halükarda false değeri döndürülür - overriding
        return false;
    }
    
    public boolean adminSil(String username, String Password){
        //overriding
        DBConnection db=new DBConnection();
        try{
            int kurucuSayisi=0;
            Connection con=db.ConnDB();
            if(username.equals(this.getUserName()) && Password.equals(this.getPassword())){
                /*Programda kurucu olmayan adminler yalnızca kendi hesabını silmesi gerektiğinden dolayı
                  kendi bilgileriyle textfieldlardan gelen bilginin aynı olup olmadığı kontrol ediliyor
                  eğer aynı ise silme işlemi gerçekleştiriliyor aynı değil ise silme işlemi gerçekleştirilmiyor*/
                PreparedStatement pre=con.prepareStatement("DELETE FROM admins WHERE username='"+username+"' and password='"+Password+"'");
                pre.execute();
                return true;
            }
            else{
                JOptionPane.showMessageDialog(null, "Kurucu Olmayan Adminler Yalnız ve Yalnız Kendi Hesaplarını Silebilirler!");
                return false;
            }
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    
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
