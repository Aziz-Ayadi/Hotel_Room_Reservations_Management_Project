/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

//import com.mysql.cj.xdevapi.Statement;
//import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import java.sql.* ;

/**
 *
 * @author ASUS
 */
public class Tables {
    
    public static void main(String[] args) 
    {
        Connection con=null;
         //con = null;
        Statement st = null ;
        try {
        con=ConnectionProvider.getCon();
       
           // System.out.println(con);
        st=con.createStatement();
 
            
           // st.execute(
			//"create table user(name varchar(20) , email varchar(20) , password varchar(30) , squestion varchar(70) , answer varchar(70) ,status varchar(20)) ");
			
			//st.executeUpdate(
				//	"create table room (roomNo int primary key Auto_Increment, roomtype varchar(15),bed varchar(15) , pricePerDay int , status varchar(20) ) " ) ;
			
			
			
			//st.executeUpdate(
				//	"create table customer (id int primary key Auto_Increment,name varchar(20) , mobileNumber varchar(10) , nationality varchar(20) , gender varchar(10) , email varchar(20),address varchar (50) )");
			
			//st.executeUpdate(
					//"create table hotel ( idHotel int primary key , adress varchar(15) , codePostal varchar(15) ,ville varchar (20), numTel varchar (20) )");
			
			//st.executeUpdate(
					//"create table reservation ( idReservation int primary key Auto_Increment, dateReservation date , dateCheckin date , dateCheckout date)");
			
			//st.executeUpdate(
					//"create table facture (idFacture int primary key Auto_Increment,dateFacture date ,idClient int , foreign key (idClient) references customer(id) )");

			
			st.executeUpdate(
					"create table reserve ( idclient int ,roomNo int ,idReservation int , primary key(idclient ,roomNo ,idReservation), foreign key(idclient) references customer(id) ,foreign key (roomNo) references room(roomNo) ,foreign key (idReservation) references reservation(idReservation) )");
            
            
            
            
        JOptionPane.showMessageDialog(null , "Table created successfully");
        
        }
        catch (Exception e)
        {System.out.println(st);
            System.out.println(con);
        //JOptionPane.showMessageDialog(null, "!!!!!");
        }
       finally {
            try {
                if (st != null) {
                    st.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
            }
}
    }}

       
           //System.out.println("aaaaaaaaaaaaaaaaaaa");
        //st.execute("create table user(name varchar(200) , email varchar(200) , password varchar(50) , squestion varchar(500) , answer varchar(200) ,status varchar(20)) ");
        //st.executeUpdate("create table room (roomNo varchar(10) primary key, roomtype varchar(200),bed varchar(200) , price int , status varchar(20), idHotel int ,  foreign key (idHotel) references hotel (idHotel))");
     //   st.execute("create table customer (id int primary key ,name varchar(200) , mobileNumber varchar(10) , nationality varchar(200) , gender varchar(50) , email varchar(200)  , address varchar (500) , checkin varchar(50) , roomNo varchar(10) , bed varchar(200) , roomtype varchar(200) , pricePerDay int , numberDaysStay int , totalAmount varchar(50))");
       //st.executeUpdate("create table customer (id int primary key Auto_Increment ,name varchar(20) , mobileNumber varchar(10) , nationality varchar(20) , gender varchar(10) , email varchar(20),address varchar (50) )");
       //st.executeUpdate("create table hotel ( idHotel int primary key , adress varchar(10) ,  codePostal varchar(20) ,ville varchar (20), numTel varchar (20) )");
      // st.executeUpdate("create table reservation ( idReservation int primary key , dateReservation date , dateCheckin date , dateCheckout date)");
      // st.executeUpdate("create table facture (idFacture int primary key , dateFacture date ,idClient int , foreign key (idClient) references customer(id)   )");
       // st.executeUpdate("create table reserve (idReservation int , roomNo int , idClient int ,  foreign key (roomNo )references room (roomNo) , foreign key (idReservation) references reservation (idReservation)  , foreign key (idClient) references customer (id))");
       
           // System.out.println(st);
            //System.out.println("project.Tables.main()");
            
            
            