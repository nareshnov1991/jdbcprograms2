package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.*;

public class PreparedInsert1 {
	

	public static void main(String[] args) throws SQLException, ClassNotFoundException
				
				{
		
				String JdbcURL = "jdbc:mysql://localhost:3306/saibaba?useSSL=false";
				String Username = "root";
	      		String password = "1234";
	      		Connection con = null;
	      		try{ 
					Class.forName("com.mysql.jdbc.Driver");   
					
					 con = DriverManager.getConnection(JdbcURL,Username,password );  
					
					PreparedStatement pst = con.prepareStatement(" insert into sai values(?, ?, ?, ?)"); 
					
					Scanner sc = new Scanner(System.in);
					
					System.out.println("Enter the sno : ");	
					int sno = sc.nextInt();
					
					System.out.println("Enter the  : ");	
					String name = sc.next(); 
					
					System.out.println("Enter the rollno : ");	
					int rollno = sc.nextInt(); 
					
					System.out.println("Enter the marks : ");	
					int marks= sc.nextInt(); 
					
					// assigning the valuse to positioned  parameters.
					
					pst.setInt(1, sno);
					pst.setString(2, name);
					pst.setInt(3, rollno);
					pst.setInt(4, marks);
				
					pst.executeUpdate();
			
					System.out.print("records are inserted");
					
					con.close();  
	      			}catch(Exception e){ System.out.println(e);} 
					
					}}
