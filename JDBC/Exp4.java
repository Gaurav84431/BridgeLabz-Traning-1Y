import java.sql.*;
public class Exp4 {
    public static void main(String[] args) throws Exception {
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
        Statement s=c.createStatement();

        s.executeUpdate("create table if not exists customers(id int,name varchar(50),phone varchar(15))");
        s.executeUpdate("insert into customers values(1,'Rahul','9999999999')");
        ResultSet r=s.executeQuery("select * from customers where name like '%Rah%'");
        while(r.next()) System.out.println(r.getString(2));
        s.executeUpdate("update customers set phone='8888888888' where id=1");
        s.executeUpdate("delete from customers where id=1");

        c.close();
    }
}