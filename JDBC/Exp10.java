import java.sql.*;
public class Exp10 {
    public static void main(String[] args) throws Exception {
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
        Statement s=c.createStatement();

        s.executeUpdate("create table if not exists menu(id int,itemName varchar(50),price double)");
        s.executeUpdate("insert into menu values(1,'Burger',150)");
        ResultSet r=s.executeQuery("select * from menu where price<200");
        while(r.next()) System.out.println(r.getString(2));
        s.executeUpdate("update menu set price=180 where id=1");
        s.executeUpdate("delete from menu where id=1");

        c.close();
    }
}