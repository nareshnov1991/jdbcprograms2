package JDBC;

import java.sql.*;

/*
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

 */

public class Statementmethod2 {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException
	
	{
	   
		Class.forName("com.mysql.jdbc.Driver");   
		
		Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/mysql","root","1234" );  
		
		Statement st=con.createStatement();   

		ResultSet rs= st.executeQuery("select * from  student");
		
		while (	rs.next()) {
		
		//System.out.print("passing only columnindex of getxxxx() :");

		//System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
		
		System.out.print("passing only StringColumnname of getxxxx() :");
		
		System.out.println(rs.getInt("sno")+" "+rs.getString("name")+" "+rs.getInt("rollno")+" "+rs.getInt("marks")); 
		
		}
		
con.close();  	

}}
