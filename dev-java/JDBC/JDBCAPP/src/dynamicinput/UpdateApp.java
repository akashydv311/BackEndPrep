package dynamicinput;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateApp {
	public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		Connection connection = null;
		Statement statement = null;
		
		// load and register the driver
		// automatic
		
		// 2.getConnection
		String url = "jdbc:mysql://localhost:3306/jdbcdb";
		String user = null;
		String pass = null;
		try {
			
			System.out.println("Enter DB user name: ");		
			user = sc.next();
			
			System.out.println("Enter DB password: ");
			pass = sc.next();
			
		}catch (Exception e) {
			System.out.println("Please insert data proprely");
		}
		
		
		try {
			
			connection = DriverManager.getConnection(url, user, pass);
			
			if(connection!=null) {
				// 3. Query Statement
				statement = connection.createStatement();
				
				if(statement!=null) {
					// 4. Execute 
					System.out.println("Enter id: ");
					int id = sc.nextInt();
					System.out.println("Enter team name: ");
					String team = sc.next();
					
					String updateQuery = String.format("UPDATE player Set team='%s' where pid=%d",team,id);
					int noOfRow = statement.executeUpdate(updateQuery);
					
					System.out.println("Number of now affected: "+noOfRow);
					
				}
			}
			
		}catch (SQLException ex) {
			ex.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			
			int count = 0;
			
			if(statement!=null) {
				statement.close();
				++count;
			}
			if(connection!=null) {
				connection.close();
				++count;
			}
			if(sc!=null) {
				sc.close();
				++count;
			}
			if(count==3) {
				System.out.println("\n*******All resources close!*******");
			}else {
				System.out.println("\n*******All resourses not closed!******");
			}
	
		}
		
		
		
	}
}
