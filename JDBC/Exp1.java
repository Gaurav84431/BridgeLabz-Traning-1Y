import java.sql.*;
public class Exp1 {
    public static void main(String[] args) throws Exception {
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
        Statement s=c.createStatement();

        s.executeUpdate("create table if not exists employee(id int,name varchar(50),salary double)");
        s.executeUpdate("insert into employee values(1,'Aman',35000)");
        ResultSet r=s.executeQuery("select * from employee where salary>30000");
        while(r.next()) System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getDouble(3));
        s.executeUpdate("update employee set salary=salary*1.1 where id=1");
        s.executeUpdate("delete from employee where salary<15000");

        c.close();
    }
}