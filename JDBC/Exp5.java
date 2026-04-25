import java.sql.*;
public class Exp5 {
    public static void main(String[] args) throws Exception {
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
        Statement s=c.createStatement();

        s.executeUpdate("create table if not exists accounts(accNo int,name varchar(50),balance double)");
        s.executeUpdate("insert into accounts values(1,'Aman',12000)");
        ResultSet r=s.executeQuery("select * from accounts where balance>10000");
        while(r.next()) System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getDouble(3));
        s.executeUpdate("update accounts set balance=balance+5000 where accNo=1");
        s.executeUpdate("delete from accounts where accNo=1");

        c.close();
    }
}