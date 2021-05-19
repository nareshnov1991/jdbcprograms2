package JDBC;

import java.sql.*;
import java.util.*;

public class StatementScannerUrlUserPwd {
	
public static void mainf(String[] args)throws Exception {
	

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter url");
	String url = sc.next();
	
	System.out.println("Enter username");
	String user = sc.next();
	
	System.out.println("Enter password");
	String password = sc.next();
	
	Class.forName("com.mysql.jdbc.Driver");
	
	Connection con = DriverManager.getConnection(url, user, password);
	
	Statement st = con.createStatement();
	ResultSet rs=st.executeQuery("select * from the student");
	
	while(rs.next()) {
		
			//System.out.print("passing only columnindex of getxxxx() :");

			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
					}
	con.close();
	
}}
	
			
	

