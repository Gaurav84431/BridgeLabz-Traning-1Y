import java.sql.*;
public class Exp12 {
    public static void main(String[] args) throws Exception {
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
        Statement s=c.createStatement();

        s.executeUpdate("create table if not exists sales(id int,bookName varchar(100),quantity int,price double)");
        s.executeUpdate("insert into sales values(1,'Java Book',2,500)");
        ResultSet r=s.executeQuery("select * from sales where quantity>1");
        while(r.next()) System.out.println(r.getString(2));
        s.executeUpdate("update sales set quantity=3 where id=1");
        s.executeUpdate("delete from sales where id=1");

        c.close();
    }
}