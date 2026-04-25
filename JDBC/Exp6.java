import java.sql.*;
public class Exp6 {
    public static void main(String[] args) throws Exception {
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
        Statement s=c.createStatement();

        s.executeUpdate("create table if not exists movies(id int,name varchar(50),seats int)");
        s.executeUpdate("insert into movies values(1,'Avengers',50)");
        ResultSet r=s.executeQuery("select * from movies where seats>0");
        while(r.next()) System.out.println(r.getString(2));
        s.executeUpdate("update movies set seats=seats-1 where id=1");
        s.executeUpdate("delete from movies where id=1");

        c.close();
    }
}