package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StatementDelete {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		

	Class.forName("com.mysql.jdbc.Driver");   
	
	Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/mysql","root","1234" );  
	
	Statement st=con.createStatement();
	
    Scanner sc = new Scanner(System.in);
    
  
    System.out.println("Enter the sno");
    int sno = sc.nextInt();
   
    int count  = st.executeUpdate(" delete from student where sno ="+sno+" ");
	
	if ( count == 0)
	
	System.out.println("unable to delete the row");
	
	else 
	System.out.println(" records are deleted");
	
	con.close();  


}
}