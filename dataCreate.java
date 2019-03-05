package projDb_One;

import java.sql.SQLException;
import java.util.Scanner;

public class dataCreate {
	
	dataCreate() throws SQLException {
		
        @SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
        System.out.println("You selected option 1: Create database record: ");
        
        System.out.println("Enter Id: ");
		String sid = userInput.nextLine();
		
		System.out.println("Enter Name: ");
		String sname = userInput.nextLine();
		
		System.out.println("Enter Class: ");
		String sclass = userInput.nextLine();
		
		System.out.println("Enter Phone: ");
		String sphone = userInput.nextLine();
		
        ConnectDB dbUtilities = new ConnectDB();
        
        String sql_stmt = "INSERT INTO tbl_student (s_id,s_name,s_class,s_phone) VALUES ('" + sid + "','" + sname + "','" + sclass + "','" + sphone + "')";
        
        dbUtilities.ExecuteSQLStatement(sql_stmt);
        
        
        mainRun.DisplayMenu();
    }

}
