package JDBC;
import java.sql.*;


public class PreparedStatementMultipleTimes 
{
    
 public static void main(String[] args)throws SQLException, ClassNotFoundException {
    {
        Connection con = null;
 
        PreparedStatement pstmt = null;
 
        Class.forName("com.mysql.jdbc.Driver");   
        
            //Database Credentials
             
            String URL = "jdbc:mysql://localhost:3306/mysql";
 
            String username = "root";
 
            String password = "1234";
 
            //STEP 2 : Creating The Connection Object
 
            con = DriverManager.getConnection(URL, username, password);
 
            //STEP 3 : Creating The PreparedStatement Object
 
            pstmt = con.prepareStatement("INSERT INTO Transaction VALUES(?, ?, ?)");
 
            //Inserting 10 records into STUDENT table using PreparedStatement object
            
            
            for (int i = 0; i < 10; i++) 
            {
                //Assigning values to place holders(?) using setter methods of PreparedStatement
                
                pstmt.setInt(1, +i);    //This will set i to parameter index 1
                
                pstmt.setString(2, "name"+i);   //This will set "FirstName"+i to parameter index 2
                
                pstmt.setInt(3, i);    //This will set "LastName"+i to parameter index 3
                
                //STEP 4 : Executing the query
                
                
                int status = pstmt.executeUpdate();
                
                if(status != 0)
                {
                    System.out.println("Record Inserted");
                }
                else
                {
                    System.out.println("Record Not Inserted");
                }
            
            try
            {
                if(pstmt!=null)
                {
                    pstmt.close();
                    pstmt=null;
                }
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }
 
            //Closing the Connection object
 
            try
            {
                if(con!=null)
                {
                    con.close();
                    con=null;
                }
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
    }}}
