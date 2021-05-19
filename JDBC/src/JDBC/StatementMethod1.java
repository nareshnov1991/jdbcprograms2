package JDBC;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

// import java.sql.*;

public class StatementMethod1 {


		public static void main(String[] args) throws SQLException, ClassNotFoundException
		
		{
		   
			Class.forName("com.mysql.jdbc.Driver");   
			
			Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/mysql","root","1234" );  
			
			Statement st=con.createStatement();   

			ResultSet rs= st.executeQuery("select * from  student");
			
			rs.next(); // for only one row..  
			
			//getxxxx(String Columnname)
			//getxxxx(int Columnindex)
			
			System.out.print("passing only columnindex of getxxxx() :");

			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
			
			System.out.print("passing only StringColumnname of getxxxx() :");
			
			System.out.println(rs.getInt("sno")+" "+rs.getString("name")+" "+rs.getInt("rollno")+" "+rs.getInt("marks")); 
			// pointer will be by default at fist row. 
			
			//getString(String Columnname)
			//getString(int Columnindex) both methods will convert in to string format. 
			

			System.out.print("passing only StringColumnname of getString() :");
			System.out.println(rs.getString("sno")+" "+rs.getString("name")+" "+rs.getString("rollno")+" "+rs.getString("marks")); 
			
			System.out.print("passing only columnindex of getString() :");
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)); 
			
			con.close();  
			
			} 
		}






