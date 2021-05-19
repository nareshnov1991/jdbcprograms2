package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

// this is not required..  import java.text.SimpleDateFormat;
import java.util.Date;

public class PreparedDateSqlFormat {
	
		public static void main(String[] args) throws SQLException, ClassNotFoundException
					
					{
					   
						Class.forName("com.mysql.jdbc.Driver");   
						
						Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/mysql","root","1234" );  
						
						PreparedStatement pst = con.prepareStatement(" insert into Transaction2 values(?, ?, ?, ?)"); 
						
						pst.setInt(1, 1);
						pst.setInt(2, 12345); // only ColumnIndex .. String name is not valid like "name"
						pst.setInt(3, 25800);
						
						// Simple Method to Insert the date into mysql.  
					    System.out.println("Using java.sql.Date Method : "); 
						
						//First get the milliseconds of current date.  
						long millis=System.currentTimeMillis();
						System.out.println("First get the milliseconds of current date :" +millis);
						
						//Second Create the object for java.sql.Date and Pass the MilliSeconds as Arugment and get date in SQLDate Format 
						java.sql.Date sqlDate=new java.sql.Date(millis); 
					    System.out.println("Second Pass Millisecond as Arugment on java.sql.Date object to get SqlDateformat :" +sqlDate); 
					
						pst.setDate(4, sqlDate);
						
						pst.executeUpdate();
				
						System.out.print("records are inserted");
						
						con.close();  
						
						} 
					}


		




