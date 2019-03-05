package projDb_One;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

public class dataDelete {

	dataDelete() throws SQLException {
		
        @SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
        System.out.println("You selected option 4: Delete database record: ");

        String sid;
        System.out.println("\nEnter student id to delete: ");
        sid = userInput.next();

        //retrieve record to update
        DisplayRecord(sid);

        String confirm_delete;
        System.out.println("Enter Y to confirm deletion: ");
        confirm_delete = userInput.next();

        if ("Y".equals(confirm_delete)) {
            ConnectDB dbUtilities = new ConnectDB();

            String sql_stmt = "DELETE FROM tbl_student WHERE s_id = " + sid;

            dbUtilities.ExecuteSQLStatement(sql_stmt);
            
            System.out.println("The Record has successfully being deleted");
        }

        mainRun.DisplayMenu();
    }

    private void DisplayRecord(String sid) throws SQLException {
        try {
        	ConnectDB dbUtilities = new ConnectDB();
        	
            String sql_stmt = "SELECT s_id, s_name, s_class, s_phone FROM tbl_student WHERE s_id = " + sid;
            ResultSet resultSet = dbUtilities.ReadRecords(sql_stmt);

            // process query results
            if (resultSet.next()) {

                ResultSetMetaData metaData = resultSet.getMetaData();
                int numberOfColumns = metaData.getColumnCount();
                System.out.print("Database Records Listingn");

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
            dbUtilities.DisconnectFromDB();
        } catch (SQLException ex) {
            System.out.println("The following error has occured: " + ex.getMessage());
        } 
    }
}
