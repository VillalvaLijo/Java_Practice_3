public class weapon{
	// this is the class constructor
	//these next lines are instance variables
	String weaponName;
	String payloadType;
	int payloadSize;
	int weaponWeight;
	
	// next we call constructors to create objects when the class is called
	
	public weapon(String name){
		weaponName = name;
		
		//output the weaponName to the console so we can verify the program is working.
		
		System.out.println("The name of the weapon is: " +weaponName);
	}

	// create the main program runtime with the static void keyword
	
	public static void main(String []args){
	
		//the object is created
		//Java is case sensitive, make sure you lower case weapon, (You made it upper case before)
		weapon gattlingGun = new weapon("Gattling Gun");
	
		//java requires the semicolon after every line.
	
	}
}
