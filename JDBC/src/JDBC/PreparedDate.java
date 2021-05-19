package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

//Below two method are required to insert the data in mysql. 

import java.text.SimpleDateFormat; //  will holds only simpledate format method onlys.  
import java.util.Date; // will have util and sql type date formats..  

public class PreparedDate {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException
				
				{
				   
					Class.forName("com.mysql.jdbc.Driver");   
					
					Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/mysql","root","1234" );  
					
					PreparedStatement pst = con.prepareStatement(" insert into Transaction2 values(?, ?, ?, ?)"); 
					
					pst.setInt(1, 1);
					pst.setInt(2, 12345); // only ColumnIndex .. String name is not valid like "name"
					pst.setInt(3, 25800);
			

					// First get the simple date by using the SimpleDateFormat
					Date date=new Date();
					SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd");
					System.out.println("1) SimpleDate format :"+formatter.format(date));  
					
					//Converting the Simpledateformatedate  in to Stringdate.. 
					String stringDate=formatter.format(date);
					System.out.println("2) Converted SimpleDate format in to StringDate format : "+stringDate);
					
					//converting the string date in to sql date.
					java.sql.Date sqlDate=java.sql.Date.valueOf(stringDate);
					System.out.println("3) Converted StringDate to SqlDate which is required to inserted in Table : "+sqlDate);
					
					//Insert the value into sqlDate in mysql.  
					pst.setDate(4, sqlDate);
					
					pst.executeUpdate();
			
					System.out.print("Records are inserted in mysql table");
					
					con.close();  
					
					} 
				}


	

