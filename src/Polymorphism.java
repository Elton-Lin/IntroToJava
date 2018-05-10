import java.util.Scanner;

public class Polymorphism extends OOP{

	public Polymorphism()
	{
		super("Polymorphism");
		System.out.println(super.getName() + " enables objects and methods to take on differnet forms.\n"
				+ "For objects, the type of object can be declared as its own class or its super class.\n"
				+ "For methods, two features are demonstrated: method overriding and method overloading.");
	}
	
	//Method overriding, run time decision, based on the parameters input and choose the right feature() method based on type
	public void feature()
	{
		while(true)
		{
			System.out.println("\nPolymorphism: \n0 to quit\n1 for object polymorphism\n2 for method polymorphism");
			int quit = 0;
			switch(readInputCommand())
			{
			case 0:
				quit = -1;
				break;
			case 1:
				objectPolyDemo();
				break;
			case 2:
				System.out.println("\n1 to demo method overloading\n2 to demo method overriding");
				if(readInputCommand() == 1)
				{
					methodOverloadingDemo();
				}
				else
				{
					methodOverridingDemo();
				}
				break;
			}
			
			if(quit == -1)
			{
				System.out.println("quitting...");
				break;
			}
		}
			
	}
	
	private void objectPolyDemo()
	{
		System.out.println("Polymorphism allows creating objects with same constructors, but different types. Which "
				+ "invokes that specific type's method implementatoin at runtime.");
		if(readEnter())
		{
			System.out.println("\ne.g. you can do: Vehicle AudiA6 = new Sedan() \n\tor: Sedan AudiA6 = new Sedan()");
			System.out.println("The more general type declaraiton provides a more broad scope for the object, but at the same time,"
			+ "it would not be able to access the subclass' own methods:\nthe Vehicle Audi A6 can't invoke Sedan class' own methods.");
		}
		
		
									
		
	}
	
	private void methodOverloadingDemo()
	{
		System.out.println("Overloading a method means that declaring methods with same name, but differnt types or amount of paramenters.");
		if(readEnter())
		{
			System.out.println("\nThe right readInputType() method is invoked during compile time based on the parameters you entered."
					+ "\nThe readInputType() method returns the amount and type of the parameters.");
			
		}
		
		int quit = 0;
		while(true)
		{
			System.out.println("\n0 to quit\n1 to enter an integer\n2 to enter two integers\n3 to enter a string.");
			switch(readInputCommand())
			{
			case 0:
				quit = -1;
				break;
			case 1:
				Scanner scanInt = new Scanner(System.in);
			    System.out.print("Enter an integer: ");
			    readInputType(scanInt.nextInt());
			    break;
			case 2: 
				//enter two integers
				Scanner scanInts = new Scanner(System.in);
			    System.out.print("Enter an integer: ");
			    int one = scanInts.nextInt();
			    System.out.print("Enter another integer: ");
			    int two = scanInts.nextInt();
			    readInputType(one, two);
			    
				break;
			case 3:
				Scanner scanString = new Scanner(System.in);
			    System.out.print("Enter a string: ");
			    readInputType(scanString.nextLine());
				break;
			}
			if(quit == -1)
			{
				System.out.println("quititng...");
				break;
			}
		}
	}
	
	//Add the final key word to make it constant method, which then can not be overridden
	private void methodOverridingDemo()
	{
		//decides durign runtime as well
		//same signature but different implementation
		System.out.println("Overriding a method means that, in a subclass, creating a same method signature, but different "
				+ "implementations from its superclass.\nFor example, the Vehicle(superclass) class have a method: accelerate()"
				+ ", and the Sedan(subclass) overrides that method with its own implementation.\n"
				+ "Thus, making the behavior of subclass more specific");
		System.out.println("\nGuess at what process the correct method is invoked; press 1 for runtime, 2 for compile-time");
		if(readInputCommand() == 1)
		{
			System.out.println("Correct!");
		}
		else if(readInputCommand() == 2)
		{
			System.out.println("It is actually during runtime based on the type of the object, which invokes the proper method.");
		}
		else
		{
			System.out.println("You failed to enter either 1 or 2...");
		}
	}
	
	private boolean readEnter()
	{
		Scanner scanner = new Scanner(System.in);
	    System.out.print("Press enter to continue...");
	    return scanner.nextLine().equals("");
	}
	
	public int readInputCommand()
	{
		Scanner scanner = new Scanner(System.in);
	    System.out.print("- Enter command: ");
	    int num = scanner.nextInt();
		return num;
	}
	
	public void readInputType(int num)
	{
		System.out.println("There is one parameter passed in, which of type is an integer.");
	}
	
	public void readInputType(int numOne, int numSecond)
	{
		System.out.println("There are two parameters passed in, both of types are integers.");
	}
	
	public void readInputType(String str)
	{
		System.out.println("There is one parameter passed in, which of type is string.");
	    
	}
}
