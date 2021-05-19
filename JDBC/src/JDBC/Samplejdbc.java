package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Samplejdbc
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		// 1) Register the driver with the DriverManager
		

		Class.forName("com.mysql.jdbc.Driver"); // throws ClassNotFoundException.    
		
	
		
		// DriverManager.registerDriver("com.mysql.jdbc.Driver ");//object of the Driver - interface
		
		/*Note: we can not create the object for the Driver interface and vendor will provide the implementation class to Driver Interface.
		the implementation class with respect to the database vendor will be provided in the jar files.
		Mysqldriver class will available in "com.mysql.jdbc.Driver" 
		So download the mysql jar file and set the classpath in pc or add the file in the buildpath in eclipse.
		copy paset the builpath.  
		
		*/
		
		// 2) Establishing the connection with the database server. 

		
		Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/mysql","root","1234" );  // throw SQLException.  
		
		/*  1) public static Connection getConnection(String url)throws SQLException  
			2) public static Connection getConnection(String url,String name,String password)  
				throws SQLException  
				
				Driver Manager have two static method there are 
				1) register.Driver()// will except the object of the Driver Interface. 
				2) getConnection()//
				
		Note :  url, user and password will be given by the vendor and the url with respect to mysql is "jdbc:mysql://localhost:3306/mysql","root","1234" 
		mysql is the option available in the sql work bench.  
		
		copy paste the screen shoot. 
		 */
		
		// Creating a statement object by using the established connection.
		
		/*  we can create the statement object in three statemnts such as 
		 
		 1) Statement - createStatement()
		 2) PreparedStatement - prepareStatement()
		 3) CallableStatement - parepareCall(Sring)
		 
		 */
		
		//3) Creating a statement object by using the established connection. 
		
		Statement st = con.createStatement(); // import java.sql.Statement. 
		
		//  Note: createStatement() will expect the object of the Connection and which we will get from the  getConnection(). 
		// createstatement() is the instance method which is available in the Connection Interface. 
		
		
		
		// 4 Executing the queries by using the statement object.
		
		/*
		  
		 Queries with respect to java language are two types: 
		1) Select Queries - executeQuery() - ResultSet executeQuery(Stringq uery) 
		2) Non -select Queries - executeUpdate() - int executeUpdate(String query) 
		
		*/
		
		
	st.executeUpdate(" create table Sai(srno number(3), sname varchar2(10), smarks number(6,2)");
		
	
	/* closing the connection. 
	st.close();
	con.close(); */
	}

}
