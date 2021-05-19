package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class InjectionMethod {
	
	public static void main(String[] args)throws SQLException, Exception {
		
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sai", "root", "1234");
			
			Scanner sc=new Scanner(System.in);
			
			System.out.print("Enter Username: ");
			String uname=sc.next();
			
			System.out.print("Enter password: ");
			int password = sc.nextInt();
			
			
			String query="select count(*) from userdetails where uname=? and password=?";
			PreparedStatement pst=con.prepareStatement(query); // string type argument.  
			pst.setString(1, uname);
			pst.setInt(2, password);
			ResultSet rs=pst.executeQuery();
			
			
			int count = 0;
			
			
			while(rs.next()) {
				count=rs.getInt(1);// getting the values of first coloumn of all rows(2 rows are specified)Such as column index.  
			}
			
			if(count==1) {
				System.out.println("Valid credentials");
				
			}else {
				System.out.println("Invalid Credentials");
			}
			
			rs.close();
			pst.close();
			con.close();

}}
