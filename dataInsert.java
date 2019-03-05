package projDb_One;

import java.util.*;
import java.sql.*;

public class dataInsert {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		//String[] input = new String[2];
		
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?autoReconnect=true&useSSL=false", "root", "rootroot");
			Statement st = connection.createStatement();
			
			System.out.println("Enter Id: ");
			String sid = userInput.nextLine();
			
			System.out.println("Enter Name: ");
			String sname = userInput.nextLine();
			
			System.out.println("Enter Class: ");
			String sclass = userInput.nextLine();
			
			System.out.println("Enter Phone: ");
			String sphone = userInput.nextLine();
			
			st.executeUpdate("INSERT INTO tbl_student values ('"+sid+"','"+sname+"','"+sclass+"','"+sphone+"')");
			
			System.out.println("\nSuccess!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
