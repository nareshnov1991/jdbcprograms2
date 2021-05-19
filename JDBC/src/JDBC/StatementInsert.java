package JDBC;

import java.sql.*;
import java.util.*;

public class StatementInsert {

	public static void main(String[] args) throws SQLException, ClassNotFoundException
		
		{
		   
			Class.forName("com.mysql.jdbc.Driver");   
			
			Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/mysql","root","1234" );  
			
			Statement st=con.createStatement();
			
            Scanner sc = new Scanner(System.in);
            
         	  System.out.println("Enter the sno");
            int sno = sc.nextInt();
            
            System.out.println("Enter the name");
            String name= sc.next ();
            
            System.out.println("Enter the rollno");
            int rollno = sc.nextInt();
            
            System.out.println("Enter the marks");
            int marks = sc.nextInt();
           
 
			int count  = st.executeUpdate("insert into student values("+sno+", '"+name+"', "+rollno+", "+marks+")");
			
			if ( count == 0)
			
			System.out.println("unable to insert the valuess");
			
			else 
			System.out.println(" records are inserted");
			
			con.close();  
			
			} 
		    }



