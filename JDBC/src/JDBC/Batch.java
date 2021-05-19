package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Batch {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException
	
	{
	   
		Class.forName("com.mysql.jdbc.Driver");   
		
		Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/sai","root","1234" );  
		
		Statement st=con.createStatement();   
		
		/*st.executeUpdate(" insert into student values(6, 'Srinivas', 129, 80)");
		st.executeUpdate(" insert into student values(9, 'Giri', 130, 80)");
		st.executeUpdate(" insert into student values(8, 'NareshBR', 131, 90)");*/
		
	st.addBatch(" insert into sai values(6, 'Srinivas', 129, 90)");
		st.addBatch(" insert into sai values(9, 'Giri', 130, 90)");
		st.addBatch(" insert into sai  values(8, 'NareshBR', 131, 90)");
		
		
		/*st.addBatch(" delete from sai where sno = 6");
		st.addBatch(" delete from sai where sno = 8");
		st.addBatch(" delete from sai where sno = 9");*/
		
		//st.addBatch(" update student set sno =9 where sno =1");
		
		
		
		int[] res=st.executeBatch();
		for (int x: res)
			System.out.println(x);

		System.out.print("records are inserted");
		
		/*others method like -  how to use. 
		void add Batch(String),  - place the specified query in the Batch.  
		int[] executeBatch[],  - will execute all queries available in the Batch
		void clearBatch();  - will remove all queries from the Batch. 
		*/
		
		con.close();  

}}
