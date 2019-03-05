package projDb_One;

import java.sql.*;

public class dataRead {
	
	public dataRead() throws SQLException {
        System.out.println("You selected option 2: Read database recordn");
        DisplayResults();
    }


	@SuppressWarnings("unused")
	private void DisplayResults() throws SQLException {
        try {
            ConnectDB con = new ConnectDB();

            String sql_stmt = "SELECT s_id, s_name, s_class, s_phone FROM tbl_student";
            ResultSet resultSet = con.ReadRecords(sql_stmt);

            // process query results
            if (resultSet.next()) {

                ResultSetMetaData metaData = resultSet.getMetaData(); //metadata means data about data
                int numberOfColumns = metaData.getColumnCount();
                System.out.print("Database Records Listing\n");

                for (int i = 1; i <= numberOfColumns; i++) {
                    System.out.printf("%-8st", metaData.getColumnName(i));
                }
                System.out.println();

                do {
                    for (int i = 1; i <= numberOfColumns; i++) {
                        System.out.printf("%-8st", resultSet.getObject(i));
                    }
                    System.out.println();
                } while (resultSet.next());
                
                System.out.println();

            } else {
                System.out.println("No database records foundn");
            }

            //close db connection
            con.DisconnectFromDB(); 
        } 
        
        catch (SQLException ex) {
            System.out.println("The following error has occured: " + ex.getMessage());
        } 
        finally {
            mainRun.DisplayMenu();
        }
    }
}
