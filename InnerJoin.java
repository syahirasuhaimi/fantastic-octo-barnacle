//selects records that have matching values in both tables.

package projDb_Two;

import java.sql.*;

public class InnerJoin {

	public static void main(String[] args) {
		
		try {
			DBConnect connection = new DBConnect();
			//Joining 2 Table
            //String sql_stmt = "SELECT tbl_order.OrderID, tbl_customer.CustomerName FROM tbl_order INNER JOIN tbl_customer ON tbl_order.CustomerID = tbl_customer.CustomerID";
            
			//Joining 3 Table
			String sql_stmt = "SELECT tbl_order.OrderID, tbl_customer.CustomerName, tbl_product.PName "
					+ "FROM ((tbl_order INNER JOIN tbl_customer ON tbl_order.CustomerID = tbl_customer.CustomerID) "
					+ "INNER JOIN tbl_product ON tbl_order.ProductID = tbl_product.ProductID)";
			
			ResultSet rs = connection.ReadRecords(sql_stmt);
	         
	         System.out.println("OrderID	CustomerName	Product Name");
	         
	         while (rs.next()) {
	            int orderId = rs.getInt("OrderID");
	            //int custId = rs.getInt("CustomerID");
	            String custName = rs.getString("CustomerName");
	            String pName = rs.getString("PName");
	            //String shipID = rs.getString("ShipperID");
	            System.out.println(orderId+"	"+custName+"	"+pName);
	         }
	      } 
		catch(SQLException e) {
	         System.out.println("SQL exception occured" + e);
	      }

	}

}
