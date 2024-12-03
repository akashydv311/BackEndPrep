package com.jdbc;

// rt.jar -> JDK
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// MYSQL JAR -> given by mysql db vender
import com.mysql.cj.jdbc.Driver;



public class JDBCConnection {
	public static void main(String[] args) throws SQLException {
		// 1.load and register driver
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		
		// 2.Establish connection
		String url = "jdbc:mysql://localhost:3306/jdbcdb";
		String user = "root";
		String pass = "root";
		Connection connection = DriverManager.getConnection(url, user, pass);
		
		// 3.creation of statement for execution
		Statement statement = connection.createStatement();
		
		// 4.using statement object to execute the query
		String sqlSelectQueary = "Select * From player";
		ResultSet resultset = statement.executeQuery(sqlSelectQueary);
		
		// 5.process the result to get data
		System.out.println("Id\tName\tTeam");
		while(resultset.next()) {
			int id = resultset.getInt(1);
			String playername = resultset.getString("name");
			String playerteam = resultset.getString("team");
			System.out.println(id+"\t"+playername+"\t"+playerteam);
		}
		
		// 6.close every connection
		resultset.close();
		statement.close();
		connection.close();
		
		
	}
}
