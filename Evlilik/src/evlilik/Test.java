package evlilik;

public class Test {

    public static void main(String[] args) {
        User user=new User("Muhammed","Kalabasi","Barbara","Palvin",22,22,"123","456","istanbul","new york","barbarakalabasi@hotmail.com","123");
        System.out.println("E-Posta: "+user.geteMail());
        Reservation rez=new Reservation(user, "İstanbul","Beşiktaş","Bahçe","25.06.2022",true);
        System.out.println("Rezervasyon Tarihi: "+rez.getTime());
        rez.setAccount_id(1999);
        Manager manager=new Founder("Muhammed Kalabaşı","admin","1234");
        manager.setPassword("159753");
        System.out.println("Admin şifresi: "+manager.getPassword());
    }
}
