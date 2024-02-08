import java.sql.*;
public class Connectitvity {
    Connection conn;
    Statement s;
    Connectitvity()
    {

        try{
                Class.forName("com.mysql.cj.jdbc.Driver");//this is the first step of JDBC 1: Register the driver
            String url = "jdbc:mysql://localhost:3306/travelmanagementsys";
            String username = "root";
            String password = "isha123";
            conn = DriverManager.getConnection(url, username, password);//establishing the connection with mysql
                s=conn.createStatement();

        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
