package JDBC;

import java.sql.*;


public class StatementScanner {


		
		public static void main(String[] args) throws SQLException, ClassNotFoundException
		
		{
		   
			Class.forName("com.mysql.jdbc.Driver");   
			
			Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/mysql","root","1234" );  
			
			Statement st=con.createStatement();   

			ResultSet rs= st.executeQuery("select * from  student");
			
			while (	rs.next()) {

			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
			}
			
	         con.close();  	

	}}


