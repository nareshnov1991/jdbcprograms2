package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementCreate2 {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "1234");
		Statement st = con.createStatement();
		
		String sql = "CREATE TABLE SaiBaba "
		+ "(id INTEGER not NULL," 
		+ " first VARCHAR(255), "
		+ " last VARCHAR(255), " 
		+ " age INTEGER, "
		+ " PRIMARY KEY ( id ))"; 
		
		int row =st.executeUpdate(sql);
   
	   System.out.println("table is created ");
 
			con.close();  
	}

}
