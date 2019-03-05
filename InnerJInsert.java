package projDb_Two;

import java.sql.*;
import java.util.Scanner;

public class InnerJInsert {
	
	InnerJInsert() throws SQLException {
		
        @SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
    
        System.out.println("Enter order Id: ");
		String orderId = userInput.nextLine();
		
		System.out.println("Enter Customer Id: ");
		String custId = userInput.nextLine();
		
		System.out.println("Enter Employee ID: ");
		String empId = userInput.nextLine();
		
		System.out.println("Enter Product ID: ");
		String proId = userInput.nextLine();
		
		System.out.println("Enter Order Date: ");
		String orderDate = userInput.nextLine();
		
		System.out.println("Enter Shipper ID: ");
		String ship = userInput.nextLine();
		
		try {
			
		DBConnect connection = new DBConnect();
        
        String sql_stmt = "INSERT INTO tbl_order (OrderID,CustomerID,EmployeeID,ProductID,OrderDate,ShipperID) "
        		+ "VALUES ('" + orderId + "','" + custId + "','" + empId + "','" + proId + "','"+ orderDate +"','" + ship +"')";
        
        connection.ExecuteSQLStatement(sql_stmt);
        
        System.out.println("Data Insert!");
	    
		}
		catch(SQLException e) {
	         System.out.println("SQL exception occured" + e);
	      }
        
    }

}
