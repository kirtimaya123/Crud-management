/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;
import java.sql.*;
public class ViewService {
    public static ResultSet getData() {
        try {
            Connection cn = Repository.ConnectionDB.getConnectionDB();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from student");
            return rs;
        }catch(Exception ee){
            ee.printStackTrace();
            
        }
        return null;
}
}

/**
 *
 * @author hp
 */

