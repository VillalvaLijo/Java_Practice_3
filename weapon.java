//import some buffer stream reader so you can read in input
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import Scanner to read input from terminal
import java.util.Scanner;

public class weapon{
	

	// this is the class constructor
	//these next lines are instance variables
	String weaponName;
	String payloadType;
	String payloadSize;

	//see what happens with payloadSize when you change it too a boolean
	//boolean payloadSize = true;
	int weaponWeight;
	
	// next we call constructors to create objects when the class is called
	
	public weapon(String name){
		weaponName = name;
		
		//output the weaponName to the console so we can verify the program is working.
		
		System.out.println("The name of the weapon is: " +weaponName);
	}

	//create a method that reads in the payload type of the weapon
	
	public void setPayloadType(String type){
		// methods have to have the return variable type
		payloadType = type; //in Java there has to be a semicolon after ever statement
		System.out.println("The Payload of the" +weaponName+ ":" +payloadType);
	}
	
	public void setPayloadSize(){
		//write this method to take user input from the console.
		// System.console() will not work in an IDE only works in interactive enviornments
	
		 //payloadSize = System.console().readline();
		//System.console().readline() error method in console().readline cannot be applied to specific type
		//required: boolean
		//found no arguments
		//reason: actual and formal arguemnts differ in length

		System.out.println(weaponName + " weapon size: " +payloadSize);
		
	}
	// create the main program runtime with the static void keyword
	
	public static void main(String []args)
		throws IOException
		{
		
		//the object is created
		//Java is case sensitive, make sure you lower case weapon, (You made it upper case before)
		weapon gattlingGun = new weapon("Gattling Gun");

		// you can now call the object gattlingGun which is an instance of the class weapon
		// you can call the method setPayloadType by refering to object.method() as done below

		gattlingGun.setPayloadType("High Explosive Shell");
		
	
		//call the method setPayloadSize where you are using the System.console() method to read in input f		   // from the terminal

		//gattlingGun.setPayloadSize();
		//java requires the semicolon after every line.
		
		//attemptiing to use BufferReader
		//instanitate reader object as an instance of BufferedReader class
		
		BufferedReader reader = new BufferedReader(
			new InputStreamReader(System.in));

		System.out.println("Enter the size of the payload");
		
		//payloadSize must be declared here with String identifier because it must create a static version of the variable to be used in the static main program
		String payloadSize = reader.readLine();

		System.out.println(payloadSize);

		System.out.println("Enter the weapon weight as an int in pounds:");

		//create a new instance of the Scanner class with the scanIn object
		Scanner scanIn = new Scanner(System.in);

		//weaponWeight must be declared as a static variable since it is in the static main
		int weaponWeight = scanIn.nextInt(); //you have to include the parenthasis because nextInt is a method of scanIn

		//print the results of weaponWeight with System.out.println
		System.out.println("You entered: " +weaponWeight+ " for weapon weight");
	
	}
}
