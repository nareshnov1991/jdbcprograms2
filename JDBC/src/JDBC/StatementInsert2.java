package JDBC;

import java.sql.*;
import java.util.*;

public class StatementInsert2 {
			public static void main(String[] args) throws SQLException, ClassNotFoundException
			
			{
			   
				Class.forName("com.mysql.jdbc.Driver");   
				
				Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/sai", "root","1234" );  
				
				Statement st=con.createStatement();
				
	            Scanner sc = new Scanner(System.in);
	            
	         	System.out.println("Enter the uname");
	            String uname = sc.next();
	            
	            System.out.println("Enter the password");
	            int password= sc.nextInt();
	 
				int count  = st.executeUpdate("insert into userdetails values("+uname+", '"+password+"')");
				
				if ( count == 0)
				
				System.out.println("unable to insert the valuess");
				
				else 
					
				System.out.println(" records are inserted");
				
				con.close();  
				
				} 
			    }





