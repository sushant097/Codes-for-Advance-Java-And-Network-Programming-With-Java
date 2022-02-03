package jdbc.Demo;

import java.sql.*;
import javax.sql.*;
import javax.sql.rowset.*;
	
/*
 *Let's write the code to retrieve the data and perform some additional tasks
 *while cursor is moved, cursor is changed or rowset is changed. 
 * The event handling operation can't be performed using ResultSet
 * so it is preferred now. 
 * 
 */
public class RowSetWithEventHandling {

	public static void main(String[] args) throws Exception {
		
		String url = "jdbc:mysql://localhost:3306/students";
		String uname = "root";
		String pass = "root";
		String query = "SELECT * FROM STUDENTS";
		
		// load and register the driver
		 Class.forName("com.mysql.cj.jdbc.Driver"); // load driver
		  //Creating the RowSet object
	      RowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
	      rowSet.setUrl(url);
	      //Setting the user name
	      rowSet.setUsername(uname);
	      //Setting the password
	      rowSet.setPassword(pass);
	      //Setting the query/command
	      rowSet.setCommand(query);
	      //Execute command
	      rowSet.execute();
	      
	      //Adding Listener and moving RowSet  
	      rowSet.addRowSetListener(new MyListener());  
	      
	      System.out.println("Contents of the table");
	      while(rowSet.next()) {
	         System.out.print("StdID: "+rowSet.getInt(1)+", ");
	         System.out.print("StdName: "+rowSet.getString(2));
	         System.out.println("");
	      }
	}

}

class MyListener implements RowSetListener {  
    public void cursorMoved(RowSetEvent event) {  
              System.out.println("Cursor Moved...");  
    }  
   public void rowChanged(RowSetEvent event) {  
              System.out.println("Cursor Changed...");  
   }  
   public void rowSetChanged(RowSetEvent event) {  
              System.out.println("RowSet changed...");  
   }  
}  
