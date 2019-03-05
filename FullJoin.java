//return all records when there is a match in either left (table1) or right (table2) table records.

package projDb_Two;

import java.sql.ResultSet;
import java.sql.SQLException;

public class FullJoin {

	public static void main(String[] args) {
		try {
			DBConnect connection = new DBConnect();
			
            String sql_stmt = "SELECT tbl_customer.CustomerName, tbl_order.OrderID "
            		+ "FROM tbl_customer FULL OUTER JOIN tbl_order ON tbl_customer.CustomerID = tbl_order.CustomerID "
            		+ "ORDER BY tbl_customer.CustomerName";
           
			ResultSet rs = connection.ReadRecords(sql_stmt);
	         
	         System.out.println("custName	orderId");
	         
	         while (rs.next()) {
	        	String custName = rs.getString("CustomerName");
//	            String cAddress = rs.getString("Address");
//	            String cCity = rs.getString("City");
	            int orderId = rs.getInt("OrderID");
//	            String oDate = rs.getString("OrderDate");
//	            String PID = rs.getString("ProductID");
	            
	            System.out.println(custName+"	 "+orderId);
	         }
	      } 
		catch(SQLException e) {
	         System.out.println("SQL exception occured" + e);
	      }

	}

}
