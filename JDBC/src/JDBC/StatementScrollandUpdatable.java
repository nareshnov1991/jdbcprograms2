package JDBC;

import java.sql.*;
public class StatementScrollandUpdatable {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {

	Class.forName("com.mysql.jdbc.Driver");   
	
	Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/mysql","root","1234" );
	
	//createStatement(int resultSetType, int resultSetConcurrency); is by default value is
	//Statement st=con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
	
	Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
	
	
	//ResultSet rs = st.executeQuery("select * from student");
	ResultSet rs = st.executeQuery("select sno, name, rollno, marks  from student");
	
	// For Update Records: 
	// rs.first();
	
	/*rs.absolute(5);
	rs.updateInt(1, 5);
	rs.updateString(2,"Malesh");
	rs.updateInt( "rollno", 129);
	rs.updateInt(4, 95);
	rs.updateRow();
 
	// To Insert Records. 
	rs.moveToInsertRow();
	rs.updateInt(1,10);
	rs.updateString(2, "NareshBr");
	rs.updateInt( "rollno",130);
	rs.updateInt("Marks",90);
	rs.insertRow();
	
	//To Delete Records.*/
	
	rs.absolute(5);
	rs.deleteRow();


	con.close(); 

}}
