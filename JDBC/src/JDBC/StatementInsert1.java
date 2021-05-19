package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementInsert1 {
	
public static void main(String[] args) throws SQLException, ClassNotFoundException
		
		{
		   
			Class.forName("com.mysql.jdbc.Driver");   
			
			Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/mysql","root","1234" );  
			
			Statement st=con.createStatement();   
			
			/*st.executeUpdate(" insert into student values(6, 'suresh', 129, 75)");
			st.executeUpdate(" insert into student values(9, 'Giri', 130, 95)");
			st.executeUpdate(" insert into student values(8, 'NewEntry', 131, 80)");*/
			
			st.addBatch(" insert into student values(6, 'suresh', 129, 75)");
			st.addBatch(" insert into student values(9, 'Giri', 130, 95)");
			st.addBatch(" insert into student values(8, 'NewEntry', 131, 80)");
			
			st.executeBatch();
		

			System.out.print("records are inserted");
			
			con.close();  
			
			} 
		}



