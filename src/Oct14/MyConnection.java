package Oct14;

import java.sql.*;

public class MyConnection {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.jdbc.Driver"); // here we need to give the
													// driver type, the given
													// type is mysql so you need
													// to give based on the
													// database
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "user1", "password1");
			// this is URL for your database port no and database and userid and
			// password
			// here sonoo is database name, root is username and password
			Statement stmt = con.createStatement();
			// here you can write the queries here similar to sql editor
			// you will get the results in resultset where you can iterate
			ResultSet rs = stmt.executeQuery("select * from student");

			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
