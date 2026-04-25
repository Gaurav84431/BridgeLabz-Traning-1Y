import java.sql.*;
public class Exp13 {
    public static void main(String[] args) throws Exception {
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
        Statement s=c.createStatement();

        s.executeUpdate("create table if not exists tasks(id int,title varchar(100),status varchar(20))");
        s.executeUpdate("insert into tasks values(1,'Study','Pending')");
        ResultSet r=s.executeQuery("select * from tasks where status='Pending'");
        while(r.next()) System.out.println(r.getString(2));
        s.executeUpdate("update tasks set status='Completed' where id=1");
        s.executeUpdate("delete from tasks where status='Completed'");

        c.close();
    }
}