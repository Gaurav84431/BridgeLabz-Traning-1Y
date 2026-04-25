import java.sql.*;
public class Exp7 {
    public static void main(String[] args) throws Exception {
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
        Statement s=c.createStatement();

        s.executeUpdate("create table if not exists patients(id int,name varchar(50),disease varchar(50))");
        s.executeUpdate("insert into patients values(1,'Rohit','Fever')");
        ResultSet r=s.executeQuery("select * from patients where disease='Fever'");
        while(r.next()) System.out.println(r.getString(2));
        s.executeUpdate("update patients set disease='Cold' where id=1");
        s.executeUpdate("delete from patients where id=1");

        c.close();
    }
}