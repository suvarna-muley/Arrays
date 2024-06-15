package arraycollection;

import java.util.Scanner;

public class ScannerClsB {//user inputs can be given using scanner class
	public static void main(String[] args) {
			Scanner s = new Scanner(System.in); //input string,u can start to give inputs from keyboard 
			System.out.println("Enter your age:");
			int age = s.nextInt();//it will start to read inputs
			System.out.println("your age is: "+age);//concatenation
		}
	}


