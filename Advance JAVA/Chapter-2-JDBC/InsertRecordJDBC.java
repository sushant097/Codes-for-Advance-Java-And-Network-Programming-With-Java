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
 *  
 * 
 */

import java.sql.*;

public class InsertRecordJDBC {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/students";
		String uname = "root";
		String pass = "root";
		String query = "INSERT INTO STUDENTS (stdname) VALUES ('SITA')";

		// 1. load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver"); // load driver
		// 2. Create Connection
		Connection con = DriverManager.getConnection(url, uname, pass);
		// 3. Create Statement
		Statement st = con.createStatement();

		// 4. Execute query
		// executeUpdate() is used for INSERT, UPDATE,
		// DELETE statements.It returns number of rows
		// affected by the execution of the statement
		int result = st.executeUpdate(query);

		// if result is greater than 0, it means values
        // has been added
        if (result > 0)
            System.out.println("successfully inserted");

        else
            System.out.println(
                "unsucessful insertion ");
		

		// 5. Close the connection
		st.close();
		con.close();
	}

}
