package JDBC;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

// after sql. all alphabets should start with Caps.  

public class StatementCreate {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//https://www.tutorialspoint.com/jdbc/jdbc-create-tables.htm
		Class.forName("com.mysql.jdbc.Driver");
		// Class.forName("String"); mug up - com.mysql.jdbc.Driver.

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/saibaba", "root", "1234");
		// DriverManager.getConnection("url", "user", "password") url,user and password
		// is provided by the vendor.
				 
		//STEP 4: Execute a query
	     System.out.println("Creating table in given database...");
	     Statement st = con.createStatement();
	     
		// String sql = "create table sai(id INTEGER not NULL, name varchar(255), rollno INTEGER";
	     
	   String sql = "create table sai"
	   		+ "(sno INTEGER not NULL, "
	   		+ "name varchar(255),"
	   		+ " rollno INTEGER,"
			+ " marks INTEGER,"
			+ " PRIMARY KEY ( sno )) ";
		 
	     
//		  String sql = "CREATE TABLE  SAI" +
//                  "(id INTEGER not NULL, " +
//                  " name VARCHAR(255), " + 
//                  " age INTEGER, " + 
//                  " PRIMARY KEY ( id ))"; 
//		
		st.executeUpdate(sql);
		// st.executeUpdate("String");

		System.out.println("table is created");

		con.close();
	}
}
