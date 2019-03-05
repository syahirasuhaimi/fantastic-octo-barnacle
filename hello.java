// Datatypes

public class hello {
	//JAVA DATA TYPES
	byte num = -128; //The range of byte is -128 to 127 only
	short num2 = 31000; //The range of 2 byte is -32,768 to 32767
	long num3;//The range of 8 byte is -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.
	double num4 = -42937737.9d; //holding 15 decimal digits, 8 byte size
	float num5 = 19.98f; //holding 6 to 7 decimal digits, 4 byte size
	boolean b = false; //holds either true of false
	char ch = 'Z'; //holds characters, 2 byte size
	String str = "BeginnersBook"; //strings are treated as objects
	
	public String getInfo() { //Method
		return ("byte is: "+num+ " short is: "+num2+ " long is: "+num3); //"byte is:" +num+
		
	}
	
	/*why using main? Ans: must hv it to run code
	 * public : accessible in whole program/ its scope is in complete program 
	 * static: there is no need to create object/instance of this main function to access it. 
	 * void: function can't return value 
	 * main: this is main function where compiler starts the execution first. 
	 * String args[]: args[] is array of all parameters used in program or values passed in program are stored in array.
	 * String : can accept all values.
	 */
	public static void main(String[] args) { 
			System.out.println("Hello World!");
			hello data = new hello();
			System.out.println(data.getInfo());
			
			/* System.out.println(); is efficient for simply printing a line of text
			 * If the line of text needs to be formatted (ex: alignment (left-justified, etc.), etc.), 
			 * then System.out.printf(); would be used. 
			 */
			System.out.println("Normal");
			System.out.printf("%f", +2.156648484561651545646); //%f is for 6 decimal places
			
	}
}
