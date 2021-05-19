package JDBC;
import java.sql.*;
import java.util.Scanner;

public class UpdateUsingPreparedStatement {
	
public static void main(String[] args)   throws SQLException, ClassNotFoundException {

Class.forName("com.mysql.jdbc.Driver");   

Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/mysql","root","1234" );  


Scanner sc = new Scanner(System.in);

System.out.println("Enter the id : ");	
int id = sc.nextInt();

System.out.println("Enter the name : ");	
String name = sc.next(); 

System.out.println("Enter the amount : ");	
int amount = sc.nextInt(); 



 PreparedStatement pst = con.prepareStatement("INSERT INTO Transaction VALUES(?, ?, ?)");
	 
	            //Inserting 10 records into STUDENT table using PreparedStatement object
	            
	            for (int i = 0; i < 10; i++) 
	            {
	                //Assigning values to place holders(?) using setter methods of PreparedStatement
	                
	                pst.setInt(1, i);    //This will set i to parameter index 1
	                
	                pst.setString(2, "FirstName"+i);   //This will set "FirstName"+i to parameter index 2
	                
	                pst.setString(3, "LastName"+i);    //This will set "LastName"+i to parameter index 3
	                
	                pst.setString(4, "Grade"+i);     //This will set "Grade"+i to parameter index 4
	                
	                //STEP 4 : Executing the query
	                
	                int status = pst.executeUpdate();
	                
	                if(status != 0)
	                {
	                    System.out.println("Record Inserted");
	                }
	                else
	                {
	                    System.out.println("Record Not Inserted");
	                }
	               
	 
	            
	    }}}
	


