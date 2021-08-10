//This Program is made to practice copying reference types to each other and practice testing if they are equivalent

import java.util.Scanner;

public class copy_1{
	
	int num1;
	String string1;
	float num2;
	
	public void getInt(){
		System.out.println("Enter an Integer for the first value of the object: ");

		//create a new instance of scaner to readin new line from user input.

		Scanner scanIn = new Scanner(System.in);					
		
		//readin the num1 as an Int from user input.
		num1 = scanIn.nextInt();

		System.out.println("You entered " +num1+ " for the first value of the object.");	
	}

	public static void main(String []args){
	
	copy_1 firstObject = new copy_1();

	firstObject.getInt();


	//atempting to print num1 from first object by calling it as a 
	// value from firstObject object reference.

	System.out.println("num1 from firstObject: " +firstObject.num1);
	} 	
	
} 
