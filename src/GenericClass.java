import java.util.Scanner;

public class GenericClass{
	
	//all instances of the class will have a its own copy of the instance variables 
	private String instanceVar = "I am an instacne (string type) variable!";
	private String name;
	
	//Constructor of the class, creating an instance(object) of the class. 
	public GenericClass(String name)
	{
		//super("Inheritance");
		this.name = name;
		
	}
	
	//class method, does not need to call upon by object nor have any created...
	public static void introToClass()
	{
		System.out.println("Class is a template that describes the states(fields) and behaviors(methods) of its type.");
		System.out.println("- Press enter to continue...");
		if(readEnter())
		{
			System.out.println("The blueprint of creating an object is: \nDeclaration of type, object name = instantiation(use \"new\" keyword), constructor of the class"
					+ "\ne.g.\tGenericClass obj = new GenericClass();");
				
		}
	}
	
	public void feature(String location)
	{
		System.out.println("- Press enter to create an object, an instance of the class");
		if(readEnter())
		{
			System.out.println("An object, instance of the class is created, and it is stored in memory location: " + location +
					"\nThe variable is a reference to the object. And all instances of the class will have a copy of instance variables."
					+ "They can be accessed or modified through methods.");
		}
		
	}
	
	
	//use dot notation to call methods(object.method())
	public String genericMethod()
	{
		System.out.println("Method is being invoked by using the dot notation: object.method()(The visibility of the method has to be public)");
		return "The instance variable is returned: " + instanceVar;
	}
	
	private static boolean readEnter()
	{
		Scanner scanner = new Scanner(System.in);
	    //System.out.print("- Press enter to continue...");
	    return scanner.nextLine().equals("");
	}
	
}
