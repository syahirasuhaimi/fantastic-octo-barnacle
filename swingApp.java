package projDb_One;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.*;

public class swingApp {
	
    JFrame f;    
    
    swingApp() throws SQLException{
    	
    	f=new JFrame();  
    	String column[]={"ID","NAME","CLASS","PHONE"}; 
    	String data[][]={{"","","",""}};   
    
    	JTable jt=new JTable(data,column);    
    	jt.setBounds(30,40,200,300);          
    	JScrollPane sp=new JScrollPane(jt);    
    	
    	f.add(sp);          
    	f.setSize(300,400);    
    	f.setVisible(true);   
    	
    	ConnectDB con;
		
			con = new ConnectDB();
			String sql_stmt = "SELECT s_id, s_name, s_class, s_phone FROM tbl_student";
	        ResultSet resultSet = con.ReadRecords(sql_stmt);
		
}   

    public static void main(String[] args) throws SQLException {    
    
    	new swingApp();    
}    

}
	
//	JFrame frmStud;
//	JTable tblStudent;
//	
//	frmStud = new JFrame();
//	frmStud.setTitle("Student Management");
//	frmStud.setBounds(100, 100, 485, 300);
//	frmStud.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	frmStud.getContentPane().setLayout(null);
//	
//	JLabel lblStud = new JLabel("Student Management ");
//	lblStud.setBounds(0, 0, 469, 14);
//	lblStud.getContentPane().add(lblStudentManagement);
//	
//	JTable jt;
//	String[] column_headers = {"Id","Name","Class","Phone"};
//	String[][] stud = {{"1","yaya","along","angah"},{"2","umai","abah","mama"}};
//	
//	jt = new JTable(stud,column_headers);
//	table.setBounds(65, 79, 337, 84);
//	JScrollPane js = new JScrollPane(jt);
//	this.add(js);
//	this.setSize(300,400);
//	this.setVisible(true);
//
//	public static void main(String[] args) {
//		
//		new swingApp();
//	}


