package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;

public class Prepareddelete {
	
public static void main(String[] args) throws SQLException, ClassNotFoundException
	
	{
	   
		Class.forName("com.mysql.jdbc.Driver");   
		
		Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/sai","root","1234" );  

		String sql = " delete from sai where sno = ?"; 
		PreparedStatement pst = con.prepareStatement(sql); 

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the value of sno");
		
		int sno = sc.nextInt(); 
		
		// assigning the valuse to possitioned parameters.
		
		pst.setInt(1, sno);  
		
		pst.executeUpdate();

		System.out.print(" records are deleted ");
		
		con.close(); 	

}}
