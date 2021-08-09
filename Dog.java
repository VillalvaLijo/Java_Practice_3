import java.io.*;  //this import statement allows us to acceses different files as long as the
			// class is declared in the file and already compiled.

public class Dog{
	int Age;
	String Name;
	String Owner;

	public Dog(){
		System.out.println("You created a new dog, now you have to name it.");
	}

	public void dogName(String Name){
		this.Name = Name;
	}

	public void dogAge(int Age){
		this.Age = Age;	
	}

	public void dogOwner(String Owner){
		this.Owner = Owner;
	}

	public void printDog(){
		System.out.println("Dog: " +Name);
		System.out.println("Age: " +Age);
		System.out.println("Owner: " +Owner);
	}
}
