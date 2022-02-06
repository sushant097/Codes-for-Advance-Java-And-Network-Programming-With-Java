package jdbc.Demo;

import java.sql.*;


/*
 * TODO - ASSIGNMENT: 
 * Create a table name employee, with two columns emp_id and emp_name. Insert some data as you like.
 * Fetch the result and print the database values.
 */


public class ExtractAllREsults {

	public static void main(String[] args)  {
		try {
			String url = "jdbc:mysql://localhost:3306/students";
			String uname = "root";
			String pass = "root";
			String query = "SELECT * FROM STUDENTS";
			
			// 1. load and register the driver
			Class.forName("com.mysql.cj.jdbc.Driver"); // load driver
			// 2. Create Connection
			Connection con = DriverManager.getConnection(url, uname, pass);
			// 3. Create Statement
			Statement st = con.createStatement();
			
			// 4. Execute query and store the table structure data in ResultSet
			ResultSet rs = st.executeQuery(query);
			
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2));
			
			st.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
