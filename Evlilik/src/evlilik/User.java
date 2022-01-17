package evlilik;

import java.sql.*;

public class User {
    private String manName;
    private String womanName;
    private String manSurname;
    private String womanSurname;
    private int manAge;
    private int womanAge;
    private String manId;
    private String womanId;
    private String manCity;
    private String womanCity;
    private String eMail;
    private String password;
    private int account_id;
    
    public User(){
    }
    
    public User(int account_id){
        //hesap id'si ile giriş sağlanması için constructor oluşturuldu - overloading
        this.account_id=account_id;
        DBConnection db=new DBConnection();
        try{
            Connection con=db.ConnDB();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("SELECT * FROM users WHERE account_id='"+account_id+"'");
            if(rs.next()){
                this.manName=rs.getString("man_name");
                this.manSurname=rs.getString("man_surname");
                this.manAge=rs.getInt("man_age");
                this.manCity=rs.getString("man_city");
                this.manId=rs.getString("man_id");
                this.womanName=rs.getString("woman_name");
                this.womanSurname=rs.getString("woman_surname");
                this.womanAge=rs.getInt("woman_age");
                this.womanCity=rs.getString("woman_city");
                this.womanId=rs.getString("woman_id");
                this.eMail=rs.getString("email");
                st.close();
                con.close();
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public User(String manName, String womanName,String manSurname, String womanSurname, int manAge, int womanAge, String manId, String womanId, String manCity, String womanCity, String eMail, String password) {
        //hesap bilgileri ile yeni bir user nesnesi oluşturmak için constructor oluşturuldu - overloading
        this.manName = manName;
        this.womanName = womanName;
        this.manSurname=manSurname;
        this.womanSurname=womanSurname;
        this.manAge = manAge;
        this.womanAge = womanAge;
        this.manId = manId;
        this.womanId = womanId;
        this.manCity = manCity;
        this.womanCity = womanCity;
        this.eMail=eMail;
        this.password=password;
    }
    
    public boolean deleteAcc(){
        try{ 
            DBConnection db=new DBConnection();
            Connection con=db.ConnDB();
            PreparedStatement pre=con.prepareStatement("DELETE FROM users WHERE account_id='"+account_id+"'");
            pre.execute();
            PreparedStatement pre2=con.prepareStatement("DELETE FROM reservations WHERE account_id='"+account_id+"'");
            pre2.execute();
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    
    public boolean updateAcc(String mName, String mSurname, int mAge, String mCity, String mId, String wName, String wSurname, int wAge, String wCity, String wId){
        
        this.manName=mName;
        this.womanName=wName;
        this.manSurname=mSurname;
        this.womanSurname=wSurname;
        this.manAge=mAge;
        this.womanAge=wAge;
        this.manId=mId;
        this.womanId=wId;
        this.manCity=mCity;
        this.womanCity=wCity;
        DBConnection db=new DBConnection();
        try{
            Connection con=db.ConnDB();
            PreparedStatement pre=con.prepareStatement("UPDATE users SET man_name='"+mName+"', man_surname='"+mSurname+"', man_age='"+mAge+"', man_city='"+mCity+"', man_id='"+mId+"', woman_name='"+wName+"', woman_surname='"+wSurname+"', woman_age='"+wAge+"', woman_city='"+wCity+"', woman_id='"+wId+"' WHERE account_id='"+this.account_id+"'");
            pre.executeUpdate();
            con.close();
            return true;
        }catch(SQLException e){
            return false;
        }
        
    }
    public String getManName() {
        return manName;
    }

    public void setManName(String manName) {
        this.manName = manName;
    }

    public String getWomanName() {
        return womanName;
    }

    public void setWomanName(String womanName) {
        this.womanName = womanName;
    }

    public int getManAge() {
        return manAge;
    }

    public void setManAge(int manAge) {
        this.manAge = manAge;
    }

    public int getWomanAge() {
        return womanAge;
    }

    public void setWomanAge(int womanAge) {
        this.womanAge = womanAge;
    }

    public String getManId() {
        return manId;
    }

    public void setManId(String manId) {
        this.manId = manId;
    }

    public String getWomanId() {
        return womanId;
    }

    public void setWomanId(String womanId) {
        this.womanId = womanId;
    }

    public String getManCity() {
        return manCity;
    }

    public void setManCity(String manCity) {
        this.manCity = manCity;
    }

    public String getWomanCity() {
        return womanCity;
    }

    public void setWomanCity(String womanCity) {
        this.womanCity = womanCity;
    }
    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public String getManSurname() {
        return manSurname;
    }

    public void setManSurname(String manSurname) {
        this.manSurname = manSurname;
    }

    public String getWomanSurname() {
        return womanSurname;
    }

    public void setWomanSurname(String womanSurname) {
        this.womanSurname = womanSurname;
    }
    
}
