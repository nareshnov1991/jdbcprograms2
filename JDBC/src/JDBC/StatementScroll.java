package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.ResultSet;

public class StatementScroll {
	
		public static void main(String[] args) throws SQLException, ClassNotFoundException {
			
		Class.forName("com.mysql.jdbc.Driver");   
		
		Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/mysql","root","1234" );  
		
		//createStatement(int resultSetType, int resultSetConcurrency); is by default value is
		//Statement st=con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
		
		Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		ResultSet rs = st.executeQuery("select * from student");
		
		
		
		/*beforeFirst();
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
		
		afterLast();
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
		getRow();
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
		
		refreshRow();
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));*/
		
		System.out.println(" next(): will get only first row details of ResultObject. ");
		rs.next();
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
		
		System.out.println(" rs.last(): will get last row details of ResultObject. ");
		rs.last();
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
		
		System.out.println(" previous(): Cursor will move to one step back and  will get last row details of ResultObject. ");
		rs.previous();
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
		
		
		System.out.println("rs.absolute(5): Cursor moves at the specific row and will get the details from that ResultObject. ");
		rs.absolute(5);
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
		
		
		System.out.println("rs.relative(-2): Cursor moves at the specific table(back word -2) and will get the details from that ResultObject. ");
		rs.relative(-2);
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));		

		System.out.println("rs.first(): Cursor to the first row from the current location.");
		rs.first();
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
		
	
		System.out.println("rs.relative(5): Cursor moves at the specific table(forward +2) and will get the details from that ResultObject. ");
		rs.relative(5);
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
		
		con.close();  


	}
	}
	
	

