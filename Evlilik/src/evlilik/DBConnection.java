package evlilik;
import java.sql.*;
//bu sınıf olası bir veritabanı değişikliği karşısında oluşturuldu
public class DBConnection{
    String url="jdbc:mysql://localhost:3306/wedding";
    String username="root";
    String password="1234";
    public DBConnection(){
    }
    public Connection ConnDB() throws SQLException{
        Connection con=DriverManager.getConnection(url,username,password);
        return con;
    }
}
