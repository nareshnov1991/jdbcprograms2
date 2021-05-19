package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedUpdate {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException
	
	{
	   
		Class.forName("com.mysql.jdbc.Driver");   
		
		Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/sai","root","1234" );  
	
		PreparedStatement pst = con.prepareStatement(" update sai set name = ? where sno = ?"); 
		
		// assigning the valuse to possitioned parameters.

		pst.setString(1, "Mahesh"); // only ColumnIndex .. String name is not valid like "name"
		
		pst.setInt(2, 6); 
		
		// Note : we can update columnindex number any order 1, 2, 3, 4. or 4, 3 , 2. 
		
		pst.executeUpdate();

		System.out.print(" records are updated ");
		
		con.close();  
		
		} 
	}




