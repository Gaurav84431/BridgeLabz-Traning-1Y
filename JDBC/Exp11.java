import java.sql.*;
public class Exp11 {
    public static void main(String[] args) throws Exception {
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
        Statement s=c.createStatement();

        s.executeUpdate("create table if not exists members(id int,name varchar(50),type varchar(20),months int)");
        s.executeUpdate("insert into members values(1,'Aman','Premium',6)");
        ResultSet r=s.executeQuery("select * from members where type='Premium'");
        while(r.next()) System.out.println(r.getString(2));
        s.executeUpdate("update members set months=months+3 where id=1");
        s.executeUpdate("delete from members where id=1");

        c.close();
    }
}