//This File is set to run the Dog Class from the file Dog.java

import java.io.*;

public class Dogs{

	public static void main(String []args){
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();

		dog1.dogName("Fido");
		dog1.dogAge(8);
		dog1.dogOwner("James");

		dog1.printDog();

		dog2.dogName("Buster");
		dog2.dogAge(6);
		dog2.dogOwner("Jaime");

		dog2.printDog();
	}
}
