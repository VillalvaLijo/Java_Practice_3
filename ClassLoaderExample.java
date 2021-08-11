//This is an experiement to output the classLoader information,
//I'm building this file just to play around and experiment

public class ClassLoaderExample{


	public static void main(String[] args){
	
		//Print the classloader name of the current class
		Class c = ClassLoaderExample.class;
		System.out.println(c.getClassLoader());

		//if we print the classloader name of String, it will print null because it is 
		//an in-built class which is founf in rt.jar so it is loaded by bootstrap

		System.out.println(String.class.getClassLoader());
		
	}
}
