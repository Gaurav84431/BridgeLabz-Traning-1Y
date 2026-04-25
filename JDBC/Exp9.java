import java.sql.*;
public class Exp9 {
    public static void main(String[] args) throws Exception {
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
        Statement s=c.createStatement();

        s.executeUpdate("create table if not exists enrollments(id int,student varchar(50),course varchar(50))");
        s.executeUpdate("insert into enrollments values(1,'Aman','Java')");
        ResultSet r=s.executeQuery("select * from enrollments where course='Java'");
        while(r.next()) System.out.println(r.getString(2));
        s.executeUpdate("update enrollments set course='Python' where id=1");
        s.executeUpdate("delete from enrollments where id=1");

        c.close();
    }
}