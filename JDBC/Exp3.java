import java.sql.*;
public class Exp3 {
    public static void main(String[] args) throws Exception {
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
        Statement s=c.createStatement();

        s.executeUpdate("create table if not exists books(id int,title varchar(100),author varchar(50),status varchar(10))");
        s.executeUpdate("insert into books values(1,'Java','XYZ','Available')");
        ResultSet r=s.executeQuery("select * from books where status='Available'");
        while(r.next()) System.out.println(r.getString(2));
        s.executeUpdate("update books set status='Issued' where id=1");
        s.executeUpdate("delete from books where id=1");

        c.close();
    }
}