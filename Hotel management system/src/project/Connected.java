/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author ASUS
 */
  import java.sql.*;
import javax.swing.JOptionPane;

public class Connected {

    public static void main(String[] args) {
        String user = "root";
        String password = "malek-2001";
        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelmi2", user, password);

            statement = connection.createStatement();
             statement.executeUpdate("create table user(nom_prenom varchar(200) , email varchar (200), password varchar(200) ,securityq varchar(200) , reponse varchar(200) , adresse varchar (200)   , status varchar (20) )");
              
             //  System.out.println(connection);
                JOptionPane.showMessageDialog(null , "Table created successfully");
            
        } catch (ClassNotFoundException | SQLException e) {
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
            }
        }
    }
}

