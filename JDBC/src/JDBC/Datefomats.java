package JDBC;

import java.text.SimpleDateFormat;  
import java.util.Date; 

public class Datefomats {
	 
	public static void main(String[] args) { 
		
		
		// Method 1 Using the simple date format... 
		 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date();  
	    System.out.println(" 1) Using the simple date format with time ... "+formatter.format(date));      
	     
		// Method 2 Using java util.date format method 1
	    java.util.Date date1=new java.util.Date();  
	    System.out.println(" 2) Using java util.date format method 1"+date1); 
	    
	    
		// Method 3 Using java util.date format method 2
	    long milliss=System.currentTimeMillis();  
	    java.util.Date date2=new java.util.Date(milliss);  
	    System.out.println(" 3) Using java util.date format method 2 : "+date2);  
	    
		// Method 4 Get Current Date: java.sql.Date
	    long millis=System.currentTimeMillis();  
	    java.sql.Date date3=new java.sql.Date(millis);  
	    System.out.println(" 4) Using java.sql.Date  only date :" +date3); 
	    
	    
	    
/*By printing the instance of java.sql.Date class, you can print current date in java. 
	    It doesn't print time. This date instance is generally used to save current date in database. */
	    
	}  
	}  


