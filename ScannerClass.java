package arraycollection;
//user inputs can be given using scanner class
import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); //input string,u can start to give inputs from keyboard 
		System.out.println("Enter your name:");
		String name = s.next();//it will start to read inputs
		System.out.println("your name is: "+name);//concatenation
	}
}
//drawbck-reading multiple words next method cannot do