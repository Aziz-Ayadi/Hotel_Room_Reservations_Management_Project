/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
  import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Select {
    public static ResultSet getData(String query)
    {
       
        try{
            Connection conn=ConnectionProvider.getCon();
            Statement satt=conn.createStatement();
            ResultSet rs=satt.executeQuery(query);
            return rs ;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null , e);
            return null ;
        }
       
    }

    
            
    
}
