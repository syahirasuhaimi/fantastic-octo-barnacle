//returns all records from the right table (table2), and the matched records from the left table (table1). 
//The result is NULL from the left side, when there is no match.

package projDb_Two;

import java.sql.*;

public class RightJoin {

	public static void main(String[] args) {
		try {
			DBConnect connection = new DBConnect();
			
            String sql_stmt = "SELECT tbl_order.OrderID, tbl_employee.LastName, tbl_employee.FirstName "
            		+ "FROM tbl_order RIGHT JOIN tbl_employee ON tbl_order.EmployeeID = tbl_employee.EmployeeID "
            		+ "ORDER BY tbl_order.OrderID";
           
			ResultSet rs = connection.ReadRecords(sql_stmt);
	         
	         System.out.println("OrderID	CustomerName");
	         
	         while (rs.next()) {
	            int orderId = rs.getInt("OrderID");
	            String lName = rs.getString("LastName");
	            String fName = rs.getString("FirstName");
	            //String pName = rs.getString("PName");
	            //String shipID = rs.getString("ShipperID");
	            System.out.println(orderId+"	"+lName+"	"+fName);
	         }
	      } 
		catch(SQLException e) {
	         System.out.println("SQL exception occured" + e);
	      }

	}

}
