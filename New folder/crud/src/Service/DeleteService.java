/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;
import java.sql.*;


public class DeleteService {

    public static boolean delete(String roll){
        try {
            Connection cn = Repository.ConnectionDB.getConnectionDB();
            Statement st = cn.createStatement();
            String roll2 = "";
            ResultSet rs = st.executeQuery("select * from student");
         while(rs.next())
         {
             roll2 = rs.getString(2);
             if((roll.equals(roll2)))
             {
                 st.executeUpdate("delete from student where roll = '"+roll+"'");
                 
             
             return true;
             
        }
    }
         return false;
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

    

