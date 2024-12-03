

import com.mysql.cj.jdbc.Driver;
import java.sql.*;

public class TestAppJDBC{
	public static void main(String[] args) throws SQLException{
		
		// first step -> load and register the driver
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		System.out.println("Driver load successfully");
		
		// stablished the connection b/w java and sql
		// url syntex: <main_protocal>:<sub_protocal>://<subname>
		String url = "jdbc:mysql://localhost:3306/jdbcdb";
		String username = "root";
		String password = "root";
		Connection connection = DriverManager.getConnection(url, username, password);
		
		System.out.println("Connection object is created: "+ connection);
		//System.out.println("Implimentation class name of connection: "+ connection.getClass().getName());
		
		Statement statement = connection.createStatement();
		System.out.println("Statement is created:"+ statement);
		
		String sqlQuery = "Select * From user";
		ResultSet resultset = statement.executeQuery(sqlQuery);
		System.out.println("Resultset object is created"+ resultset);
		
		// result- data
		System.out.println("ID\tUsername\tEmail\tPassword\tTime");
		while(resultset.next()){	
			int id = resultset.getInt(1);
			String name = resultset.getString(2);
			String email = resultset.getString(3);
			String pass = resultset.getString(4);
			String time = resultset.getString(5);
			System.out.println(id+"\t"+name+"\t"+email+"\t"+pass+"\t"+time);
		}
		
		// close the resorses
		connection.close();
		statement.close();
		resultset.close();
		System.out.println("Database Connection Closed");
		
	}
}