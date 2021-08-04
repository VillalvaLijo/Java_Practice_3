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

	//create a method that reads in the payload type of the weapon
	
	public void setPayloadType(String type){
		// methods have to have the return variable type
		payloadType = type; //in Java there has to be a semicolon after ever statement
		System.out.println("The Payload of the" +weaponName+ ":" +payloadType);
	}

	// create the main program runtime with the static void keyword
	
	public static void main(String []args){
	
		//the object is created
		//Java is case sensitive, make sure you lower case weapon, (You made it upper case before)
		weapon gattlingGun = new weapon("Gattling Gun");

		// you can now call the object gattlingGun which is an instance of the class weapon
		// you can call the method setPayloadType by refering to object.method() as done below

		gattlingGun.setPayloadType("High Explosive Shell");
	
		//java requires the semicolon after every line.
	
	}
}
