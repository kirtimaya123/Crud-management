/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;
import java.sql.*;

public class UpdateService {
    public static String roll1;
    public static boolean update(String name,String address,String phone_no,String roll){
        try {
            Connection cn = Repository.ConnectionDB.getConnectionDB();
            Statement st = cn.createStatement();
            st.executeUpdate("update student set name = '"+name+"', address = '"+address+"', phone_no = '"+phone_no+"' where roll = '"+roll+"'");
            ResultSet rs = st.executeQuery("select * from student");
         while(rs.next())
         {
             roll1 = rs.getString(2);
             return true;
             
        }
    }
catch(Exception e)
     {
         e.printStackTrace();
     }
     return false;
}

}

/**
 *
 * @author hp
 */

