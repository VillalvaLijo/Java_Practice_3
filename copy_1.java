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

	public void getString(){
		
		//create an instance of Scanner too read the string input into the variable
		
		Scanner scanIn = new Scanner(System.in);

		System.out.println("Enter a string to be stored in the first object");
		
		//use .nextLine method to read in the new string
	
		string1 = scanIn.nextLine();
		
		System.out.println("You entered: " +string1);	
	}

	public void getFloat(){
		//create a new instance of scanner to read in the float

		Scanner scanIn = new Scanner(System.in);

		System.out.println("Enter a float to be stored in the first object:");

		num2 = scanIn.nextFloat();
		
		//print out the num2 float to make sure it was entered in correctly.
		System.out.println("You entered: " +num2+ " for the float");
	}

		//Object to allow cloning of other objects in this class
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	public static void main(String []args) throws CloneNotSupportedException {
	
		copy_1 firstObject = new copy_1();

		firstObject.getInt();


		//atempting to print num1 from first object by calling it as a 
		// value from firstObject object reference.

		System.out.println("num1 from firstObject: " +firstObject.num1);
	
		firstObject.getString();
		firstObject.getFloat();
		

		//Create a new object, of class copy_1 and copy firstObject into it.

		//copy_1 secondObject = new copy_1();

		//copy_1 secoundObject = firstObject;

		//Attmept to use cloning on firstObject to create a clone called secondObject
		copy_1 secondObject =(copy_1)firstObject.clone();

		//now print all the variables from the secound object to prove the got copied
		System.out.println("Value of num1 in secondObject: "+secondObject.num1);
		System.out.println("Value of string1 in secondObject: "+secondObject.string1);
		System.out.println("Value of num2 in secondObject: "+secondObject.num2);

		if(secondObject==firstObject){
			System.out.println("Fisrt Object and Second Object are equivalent!");
		}else{
			System.out.println("First Object and Second Object are not equivalent!");
		}
	} 
	
} 
