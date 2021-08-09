//This program is to test wether a constructor can be a different name than the class name

public class constructorFun{
	public constructorFun(String input){
		System.out.println("You Entered: " +input+ " For input");
	}

	
	public static void main(String []args){
		constructorFun funTimes = new constructorFun("Can The Constructor name differ from the class name?");
	}
}
