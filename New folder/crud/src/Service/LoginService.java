package Service;

import java.sql.*;
public class LoginService {
    public static boolean validUser(String name,String password){
        try {
            Connection cn = Repository.ConnectionDB.getConnectionDB();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from admin where name='"+name+"' and password='"+password+"'");
            while(rs.next()) {
                if(rs.getString(1).equals(name) && rs.getString(2).equals(password)) {
                    return true;
                } else {
                    return false;
                }
               
            }
        }catch(Exception ee){
            ee.printStackTrace();
            
        }
        return false;
    }
}