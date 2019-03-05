package projDb_One;

import java.sql.SQLException;
import java.util.Scanner;

public class mainRun {

	public static void main(String[] args) throws SQLException {
		DisplayMenu();

	}
	
	public static void DisplayMenu() throws SQLException {
        @SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
        String menu;

        // Display menu graphics
        System.out.println("*****************************************");
        System.out.println("|            STUDENT DATA               |");
        System.out.println("*****************************************");
        System.out.println("| Options:                              |");
        System.out.println("|        1. Create Database Records     |");
        System.out.println("|        2. Read Database Records       |");
        System.out.println("|        3. Update Database Records     |");
        System.out.println("|        4. Delete Database Records     |");
        System.out.println("|        5. Exit                        |");
        System.out.println("*****************************************");

        System.out.print("Select option: ");

        menu = userInput.next();

        //display menu based on user selection
        switch (menu) {
            case "1":
            	dataCreate create = new dataCreate();
                break;
            case "2":
                dataRead read = new dataRead();
                break;
            case "3":
                dataUpdate update = new dataUpdate();
                break;
            case "4":
                dataDelete delete = new dataDelete();
                break;
            case "5":
                System.exit(0);
                break;
            default:
                System.out.println("Invalid selection");
                break; 
        }
    }

}
