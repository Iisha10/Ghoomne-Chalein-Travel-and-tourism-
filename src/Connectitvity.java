import java.sql.*;
public class Connectitvity {
    Connection c;
    Statement s;
    Connectitvity()
    {

        try{
                Class.forName("com.mysql.cj.jdbc.Driver");//this is the first step of JDBC 1: Register the driver
                c=DriverManager.getConnection("jdbc:mysql://localhost:3306/travelmanagementsys", "root", "isha123" );//establishing the connection with mysql
                s=c.createStatement();

        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
