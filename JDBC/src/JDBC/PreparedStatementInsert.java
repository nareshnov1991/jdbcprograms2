package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;


public class PreparedStatementInsert {
	
public static void main(String[] args) throws SQLException, ClassNotFoundException
			
			{
			   
				Class.forName("com.mysql.jdbc.Driver");   
				
				Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/sai","root","1234" );  
				
				
				//PreparedStatement pst = con.prepareStatement(" insert into sai values(?, ?, ?)");  for 3 column table. 
				//PreparedStatement pst = con.prepareStatement(" insert into sai values(?, ?,);  for  2 column table. 
				
				PreparedStatement pst = con.prepareStatement(" insert into sai values(?, ?, ?, ?)"); 
				// assigning the valuse to possition parameters.
				pst.setInt(1, 10);
				pst.setString(2, "Mahesh"); // only ColumnIndex .. String name is not valid like "name"
				pst.setInt(3, 134);
				pst.setInt(4, 92);
			
				pst.executeUpdate();
		
				System.out.print("records are inserted");
				
				con.close();  
				
				} 
			}


//pst.setNString("name", "NewEntry"); is not valid only index type. 


//PreparedStatement pst = con.prepareStatement(" insert into sai values(?, ?, ?)");  for 3 column table. 
//PreparedStatement pst = con.prepareStatement(" insert into sai values(?, ?,);  for  2 column table. 
