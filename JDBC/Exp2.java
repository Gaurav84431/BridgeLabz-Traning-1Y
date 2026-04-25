import java.sql.*;
public class Exp2 {
    public static void main(String[] args) throws Exception {
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
        Statement s=c.createStatement();

        s.executeUpdate("create table if not exists product(pid int,pname varchar(50),qty int)");
        s.executeUpdate("insert into product values(1,'Pen',5),(2,'Book',20),(3,'Pencil',8)");
        ResultSet r=s.executeQuery("select * from product where qty<10");
        while(r.next()) System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getInt(3));
        s.executeUpdate("update product set qty=qty+10 where pid=1");
        s.executeUpdate("delete from product where pid=3");

        c.close();
    }
}