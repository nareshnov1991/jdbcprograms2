package JDBC;
import java.sql.*;
import java.util.Scanner;


public class PreapareStatementInsertMarks
{
public static void main(String[] args) throws SQLException, ClassNotFoundException
{
	
	Class.forName("com.mysql.jdbc.Driver");   
	
	Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/mysql","root","1234" );  
	
	PreparedStatement pst = con.prepareStatement(" insert into student2 values(?, ?, ?, ?, ?, ?, ?, ?)"); 
	
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("Enter the sno : ");	
	int sno = sc.nextInt();
	
	System.out.println("Enter the name : ");	
	String name = sc.next(); 
	
	System.out.println("Enter the rollno : ");	
	int rollno = sc.nextInt(); 
	
	System.out.println("Enter the m1 : ");	
	int m1= sc.nextInt();
	
	System.out.println("Enter the m2 : ");	
	int m2= sc.nextInt(); 
	
	System.out.println("Enter the m3 : ");	
	int m3= sc.nextInt(); 
	
	long total = m1 + m2+ m3;
	float  percentage =(total / 300)*100; // need to check the logic here.  
	
	pst.setInt(1, sno);
	pst.setString(2, name);
	pst.setInt(3, rollno);
	pst.setInt(4, m1);
	pst.setInt(5, m2);
	pst.setInt(6, m3);
	pst.setLong(7, total);
	System.out.println("Total : "+total);
	pst.setFloat(8, percentage);
	System.out.println("Percentage :" +percentage);
			
	pst.executeUpdate();

	System.out.print("records are inserted");
	
	con.close();  
	
	}	
}

