// this is a program to read in arguments from the command line when the program is called

class commandLineArgument{
	public static void main(String[] args)
	{
	
		// check if length of args array is 
		// greater then zero 

		if(args.length> 0) {
			System.out.println(
				"The command line arguments are: ");

			// iterating the args array and printing
			// the command line arguments
			for (String val : args)
				System.out.println(val);
		}
		else
			System.out.println("No command line arguments found.");
	}
}
