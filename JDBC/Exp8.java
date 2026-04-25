import java.sql.*;
public class Exp8 {
    public static void main(String[] args) throws Exception {
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
        Statement s=c.createStatement();

        s.executeUpdate("create table if not exists vehicles(regNo varchar(20),owner varchar(50),status varchar(20))");
        s.executeUpdate("insert into vehicles values('UP15AB1234','Aman','Pending')");
        ResultSet r=s.executeQuery("select * from vehicles where status='Pending'");
        while(r.next()) System.out.println(r.getString(1));
        s.executeUpdate("update vehicles set status='Completed' where regNo='UP15AB1234'");
        s.executeUpdate("delete from vehicles where regNo='UP15AB1234'");

        c.close();
    }
}