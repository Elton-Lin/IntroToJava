import java.util.Scanner;

public class Inheritance extends OOP{

	public Inheritance()
	{
		super("Inheritance");
		System.out.println("\n" + super.getName() + " provides a logical technique to manage information and functionality across classes in a hierarchical order.");
		if(readEnter())
		{
			System.out.println("\nIt uses the \"extends\" keyword. For example, Sedan(Subclass) extends Vehicle(Superclass)."
					+ "\nThe subclass inherits all states(instance variables),and behaviors(methods) of the "
					+ "superclass.\nIt uses the \"super\" keyword to invoke the constructor or methods of its superclass.\n"
					+ "Therefore, the objects have a Is-A relationship -- Sedan is an Vehicle.");
		}
		
	}
	
	public void feature()
	{
		//call methods from superclass without declaring it in subclass
		System.out.println(super.getName() + " is good for you! ");
		
	}
	
	private boolean readEnter()
	{
		Scanner scanner = new Scanner(System.in);
	    System.out.print("- Press enter to continue...");
	    return scanner.nextLine().equals("");
	}
	
	
}


