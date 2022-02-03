package jdbc.Demo;

import java.sql.*;

import javax.sql.RowSet;
import javax.sql.rowset.RowSetProvider;

public class RowSetExample {

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
	      System.out.println("Contents of the table");
	      while(rowSet.next()) {
	         System.out.print("StdID: "+rowSet.getInt(1)+", ");
	         System.out.print("StdName: "+rowSet.getString(2));
	         System.out.println("");
	      }
		
	}

}
