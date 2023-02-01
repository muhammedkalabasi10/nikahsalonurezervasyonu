package evlilik;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Evlilik {
    public static void main(String[] args) {
        DBConnection db=new DBConnection();
        try{
            Connection con=db.ConnDB();
            Statement st=con.createStatement();
            st.executeUpdate("CREATE TABLE IF NOT EXISTS `wedding`.`admins` (\n" +
                    "  `ad_soyad` varchar(45) NOT NULL,\n" +
                    "  `username` varchar(45) NOT NULL,\n" +
                    "  `password` varchar(45) DEFAULT NULL,\n" +
                    "  `founder` tinyint DEFAULT NULL,\n" +
                    "  PRIMARY KEY (`username`)\n" +
                    ");\n");
            st.executeUpdate("INSERT IGNORE INTO admins (ad_soyad, username, password, founder) VALUES (\"founder\",\"founder\",\"founder\",1)");
            st.executeUpdate("CREATE TABLE IF NOT EXISTS `wedding`.`cities` (\n" +
                    "  `city_id` int NOT NULL AUTO_INCREMENT,\n" +
                    "  `city_name` varchar(45) NOT NULL,\n" +
                    "  PRIMARY KEY (`city_id`)\n" +
                    ");");
            st.executeUpdate("CREATE TABLE IF NOT EXISTS `wedding`.`districts` (\n" +
                    "  `name` varchar(45) NOT NULL,\n" +
                    "  `city_id` int NOT NULL\n" +
                    ");");
            st.executeUpdate("CREATE TABLE IF NOT EXISTS `wedding`.`reservations` (\n" +
                    "  `reservation_id` int NOT NULL AUTO_INCREMENT,\n" +
                    "  `account_id` int NOT NULL,\n" +
                    "  `city` varchar(45) DEFAULT NULL,\n" +
                    "  `venue` varchar(45) DEFAULT NULL,\n" +
                    "  `hall` varchar(45) DEFAULT NULL,\n" +
                    "  `time` varchar(45) DEFAULT NULL,\n" +
                    "  `cocktail` tinyint DEFAULT NULL,\n" +
                    "  PRIMARY KEY (`reservation_id`)\n" +
                    ");");
            st.executeUpdate("CREATE TABLE IF NOT EXISTS `wedding`.`users` (\n" +
                    "  `account_id` int NOT NULL AUTO_INCREMENT,\n" +
                    "  `man_name` varchar(45) DEFAULT NULL,\n" +
                    "  `woman_name` varchar(45) DEFAULT NULL,\n" +
                    "  `man_surname` varchar(45) DEFAULT NULL,\n" +
                    "  `woman_surname` varchar(45) DEFAULT NULL,\n" +
                    "  `man_age` varchar(45) DEFAULT NULL,\n" +
                    "  `woman_age` varchar(45) DEFAULT NULL,\n" +
                    "  `man_city` varchar(45) DEFAULT NULL,\n" +
                    "  `woman_city` varchar(45) DEFAULT NULL,\n" +
                    "  `email` varchar(45) NOT NULL,\n" +
                    "  `password` varchar(45) NOT NULL,\n" +
                    "  `man_id` varchar(45) NOT NULL,\n" +
                    "  `woman_id` varchar(45) NOT NULL,\n" +
                    "  PRIMARY KEY (`account_id`)\n" +
                    ");");

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        new Menu().setVisible(true);
    }
}
