//returns all records from the left table (table1), and the matched records from the right table (table2). 
//The result is NULL from the right side, if there is no match.

package projDb_Two;

import java.sql.*;
public class LeftJoin {

	public static void main(String[] args) {
		try {
			DBConnect connection = new DBConnect();
			
            String sql_stmt = "SELECT tbl_customer.CustomerName, tbl_order.OrderID "
            		+ "FROM tbl_customer LEFT JOIN tbl_order ON tbl_customer.CustomerID = tbl_order.CustomerID "
            		+ "ORDER BY tbl_customer.CustomerName";
           
			ResultSet rs = connection.ReadRecords(sql_stmt);
	         
	         System.out.println("OrderID	CustomerName");
	         
	         while (rs.next()) {
	            int orderId = rs.getInt("OrderID");
	            //int custId = rs.getInt("CustomerID");
	            String custName = rs.getString("CustomerName");
	            //String pName = rs.getString("PName");
	            //String shipID = rs.getString("ShipperID");
	            System.out.println(orderId+"	"+custName);
	         }
	      } 
		catch(SQLException e) {
	         System.out.println("SQL exception occured" + e);
	      }

	}

}
