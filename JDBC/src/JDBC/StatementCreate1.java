package JDBC;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException; 
import java.sql.Statement;

public class StatementCreate1 {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
			
		Class.forName("com.mysql.jdbc.Driver"); 
			
		Connection con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "1234");
			
			
		Statement st = con.createStatement();
		
		 /*  String sql = "CREATE TABLE REGISTRATION " + "(id INTEGER not NULL, " +
          " first VARCHAR(255), " + 
                   " last VARCHAR(255), " + 
                   " age INTEGER, " + 
                   " PRIMARYKEY ( id ))"; */
		
	    /*  String sql = "INSERT INTO Registration " +
                  "VALUES (100, 'Zara', 'Ali', 18)";
     st.executeUpdate(sql);
     
  /*   sql = "INSERT INTO Registration " +
                  "VALUES (101, 'Mahnaz', 'Fatma', 25)";
     st.executeUpdate(sql);
     sql = "INSERT INTO Registration " +
                  "VALUES (102, 'Zaid', 'Khan', 30)";
     st.executeUpdate(sql);
     sql = "INSERT INTO Registration " +
                  "VALUES(103, 'Sumit', 'Mittal', 28)";*/
		
	String sql = "insert into REGISTRATION values(104, 'Boya Regi', 'Naresh', 27)";
     
   int rowcount =  st.executeUpdate(sql);
   
   if(rowcount == 0)
	   System.out.println("values not inserted");
   
   else
     System.out.println(" records inserted into the table...");
	
		   
  //   st.execute("insert into REGISTRATION values(1, 'Boya Regi', 'Naresh', 27");
		
		   
		    
	//st.executeUpdate("create table Sai(sno int(20), name varchar(20), rollno int(20)");
		    
	
	//System.out.println("table is created");
	 
			con.close();  
	}
	}







