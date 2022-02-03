package jdbc.Demo;

import java.sql.*;

public class PreparedStatementDemo {

	public static void main(String[] args) throws Exception{
		String url = "jdbc:mysql://localhost:3306/students";
		String uname = "root";
		String pass = "root";
		String query = "SELECT * FROM STUDENTS where stdid=? or stdname=?";
		
		// 1. load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver"); // load driver
		// 2. Create Connection
		Connection con = DriverManager.getConnection(url, uname, pass);
		// 3. Create Statement
		PreparedStatement st = con.prepareStatement(query);
		
		// 4. Set Parameters
		st.setInt(1, 1);
		st.setString(2, "john");
        
		// 4. Execute query and store the table structure data in ResultSet
		ResultSet rs = st.executeQuery(); // query not need to be given as argument. JVM generates query internally.
		
		while (rs.next())
			System.out.println(rs.getInt(1) + "  " + rs.getString(2));
		
		
		
		// 6. Close the connection
		st.close();
		con.close();
	}

}
