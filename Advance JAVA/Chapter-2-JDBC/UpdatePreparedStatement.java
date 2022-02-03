package jdbc.Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdatePreparedStatement {

	public static void main(String[] args) throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/students";
		String uname = "root";
		String pass = "root";
		String query = "UPDATE STUDENTS set stdname=? where stdid=?";

		// 1. load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver"); // load driver
		// 2. Create Connection
		Connection con = DriverManager.getConnection(url, uname, pass);
		// 3. Create Statement
		PreparedStatement st = con.prepareStatement(query);

		// Set Parameters
		st.setString(1, "SITA2");
		st.setInt(2, 5);

		// 4. Execute query
		// executeUpdate() is used for INSERT, UPDATE,
		// DELETE statements.It returns number of rows
		// affected by the execution of the statement
		// 4. Execute query
		int result = st.executeUpdate(); // query not need to be given as
											// argument. JVM generates query
											// internally.

		// if result is greater than 0, it means values
		// has been added
        if (result > 0)
            System.out.println("successfully Updated");

        else
            System.out.println(
                "unsucessful update ");
		

		// 5. Close the connection
		st.close();
		con.close();
		
		
	}

}
