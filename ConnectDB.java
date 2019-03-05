package projDb_One;

import java.sql.*;

public class ConnectDB {
	Statement statement = null; 
    ResultSet resultSet = null;
	static Connection connection = null;
	
	//Get Connection
	public ConnectDB() throws SQLException {
        // establish connection to database  
        try {
        	connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?autoReconnect=true&useSSL=false", "root", "rootroot");	
    		
        } catch (SQLException ex) {
            System.out.println("The following error has occured: " + ex.getMessage());
        }
    }

	
	//Read records
	public ResultSet ReadRecords(String sql_stmt) {
        try {

            statement = connection.createStatement();
                                    
            resultSet = statement.executeQuery(sql_stmt);

            return resultSet;

        } 
        catch (SQLException ex) {
            System.out.println("The following error has occured: " + ex.getMessage());
        }                                                    

        return resultSet;
    }
	
	//Disconnect from Db
	public void DisconnectFromDB() {

        try {
            resultSet.close();
            statement.close();
            connection.close();
        } // end try                                               
        catch (Exception ex) {
            System.out.println("The following error has occured: " + ex.getMessage());
        } // end catch  
    }
	
	//Execute statement
	public void ExecuteSQLStatement(String sql_stmt) {
        try {
            statement = connection.createStatement();
                                    
            statement.executeUpdate(sql_stmt);
        } 
        catch (SQLException ex) {
            System.out.println("The following error has occured: " + ex.getMessage());
        }
    }


}
