/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;
import java.sql.*;
import java.io.*;
import java.util.*;
 public class AddService {
     public static boolean insert(String name,String roll,String address,String phone_no){
     try 
     {
         String roll2 = "";
         Connection cn = Repository.ConnectionDB.getConnectionDB();
         Statement st = cn.createStatement();
         ResultSet rs = st.executeQuery("select * from student");
         while(rs.next())
         {
             roll2 = rs.getString(2);
             if(roll.equals(roll2))
             {
                 return false;
             }
             
                 
             }
         st.executeUpdate("insert into Student values('"+name+"','"+roll+"','"+address+"','"+Long.parseLong(phone_no)+"')");
                 return true;
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

    

