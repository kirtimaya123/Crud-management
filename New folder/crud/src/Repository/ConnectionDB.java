
package Repository;
import java.sql.*;
public class ConnectionDB {
    static Connection cn = null;
    public static Connection getConnectionDB() {
           try {
               Class.forName("com.mysql.cj.jdbc.Driver");
               cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student_ctc","root","root");
               System.out.println("Connected");
           } catch(ClassNotFoundException ee) {
               ee.printStackTrace();
           }
           catch(SQLException ee) {
               ee.printStackTrace();
               
           }
           finally {
               return cn;
           }
    }
}
