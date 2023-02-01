package evlilik;
import java.sql.*;
//bu sınıf olası bir veritabanı değişikliği karşısında oluşturuldu
public class DBConnection{
    String url="jdbc:mysql://localhost:3306/wedding";
    String username="root";
    String password="123mysql";
    public DBConnection(){
    }
    public Connection ConnDB() throws SQLException{
        Connection con=DriverManager.getConnection(url,username,password);
        Statement statement=con.createStatement();
        return con;
    }
}
