package JDBC;


import java.sql.*;
import java.util.*;

public class StatementUpdate {
	

		public static void main(String[] args) throws SQLException, ClassNotFoundException
			
			{
			   
				Class.forName("com.mysql.jdbc.Driver");   
				
				Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/mysql","root","1234" );  
				
				Statement st=con.createStatement();
				
	            Scanner sc = new Scanner(System.in);
	            
	
	            System.out.println("Enter the name");
	            String name= sc.next();
	            
	            System.out.println("Enter the sno");
	            int sno = sc.nextInt();
	           
	            int count  = st.executeUpdate(" update student set name = '"+name+"' where sno = "+sno+" ");
				
				if ( count == 0)
				
				System.out.println("unable to update the valuess");
				
				else 
				System.out.println(" records are updated");
				
				con.close();  
				
				} 
			    }






