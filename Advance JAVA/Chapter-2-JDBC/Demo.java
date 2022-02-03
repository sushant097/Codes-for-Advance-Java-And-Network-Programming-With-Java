package jdbc.Demo;

/*
 * 1. Import -- java.sql
 * 2. load and register the driver ==> mysql driver
 * 3. Create Connection 
 * 4. Create a statement
 * 5. Execute the query
 * 6. Process the results
 * 7. close
 */

/*
 * TODO - ASSIGNMENT: 
 * Create a table name employee, with two columns emp_id and emp_name. Insert one row of data as you like.
 * Fetch the One data given specific user id and print the result.
 */

import java.sql.*;

public class Demo {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/students";
		String uname = "root";
		String pass = "root";
		String query = "SELECT stdname FROM STUDENTS where stdid=1";
		
		// 1. load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver"); // load driver
		// 2. Create Connection
		Connection con = DriverManager.getConnection(url, uname, pass);
		// 3. Create Statement
		Statement st = con.createStatement();
		
		// 4. Execute query and store the table structure data in ResultSet
		ResultSet rs = st.executeQuery(query);
		
		rs.next(); // take pointer to next record

		// 5. Process the results
		String name = rs.getString("stdname"); // mention colname or colnumber
		
		System.out.println(name);
		
		// 6. Close the connection
		st.close();
		con.close();
	}

}
