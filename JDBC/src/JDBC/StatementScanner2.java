package JDBC;

import java.sql.*; 
import java.util.*; 

public class StatementScanner2 {

	
	
		public static void main(String a[]) throws Exception 
		{ 
			//Creating the connection 
			String url = "jdbc:mysql://localhost:3306/mysql"; 
			String user = "root"; 
			String pass = "1234"; 

			//Entering the data 
			Scanner k = new Scanner(System.in); 
			System.out.println("enter name"); 
			String name = k.next(); 
			System.out.println("enter roll no"); 
			int roll = k.nextInt(); 
			System.out.println("enter class"); 
			String cls = k.next(); 

			//Inserting data using SQL query 
			String sql = "insert into student1 values('"+name+"',"+roll+",'"+cls+"')"; 
			
		    	Class.forName("com.mysql.jdbc.Driver");

				//Reference to connection interface 
				Connection con = DriverManager.getConnection(url,user,pass); 

				Statement st = con.createStatement(); 
				
				int m = st.executeUpdate(sql); 
				
				if (m == 1)// enter the coloumn.  
					
					System.out.println("inserted successfully : "+sql); 
				else
					System.out.println("insertion failed"); 
				con.close(); 
			
		} 
	} 



