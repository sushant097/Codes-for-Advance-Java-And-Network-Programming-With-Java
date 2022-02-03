package jdbc.Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteRecord 
{
	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/students";
		String uname = "root";
		String pass = "root";
		String query = "DELETE FROM STUDENTS where stdid=5";

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
        // has been deleted
        if (result > 0)
            System.out.println("successfully deleted");

        else
            System.out.println("unsucessful deletion ");
		

		// 5. Close the connection
		st.close();
		con.close();
	}


}
