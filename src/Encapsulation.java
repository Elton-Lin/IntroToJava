import java.util.Scanner;

public class Encapsulation extends OOP{
	
	private String str = "Hidden";
	
	public Encapsulation()
	{
		super("Encapsulation");
		System.out.println("Encapsulation is a mechanism of wrapping code, data and methods into a single unit, also known as"
		+ " data hiding. \nTherefore, fields are only accessible through getter and setter methods, which are public.");
	}
	
	public void feature()
	{
		int quit = 0;
		while(true)
		{	
			System.out.println("\nEncapsulation: \n0 to quit\n1 to get the value of field\n2 to set the value of field");
			switch(readInputCommand())
			{
			case 0: 
				quit = -1;
				break;
			case 1:
				System.out.println("The hidden field: " + getField());
				System.out.println("");
				break;
			case 2:
				System.out.println("The hidden field is a string, you can change it by entering a word.");
				Scanner scanner = new Scanner(System.in);
				System.out.print("Enter string: ");
			    String str = scanner.nextLine();
				setField(str);
				System.out.println("");
				break;
			}
			if(quit == -1)
			{
				System.out.println("quitting...");
				break;
			}
		}	
	}
	
	public String getField()
	{
		return str;
	}
	
	public void setField(String str)
	{
		this.str = str;
		helper();
	}
	
	private void helper()
	{
		System.out.println("The private helper method is called to display the result of calling setter method.");
		System.out.println("Now the field is: " + str);
	}
	
	private int readInputCommand()
	{
		//@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
	    System.out.print("- Enter command: ");
	    int num = scanner.nextInt();
		return num;
	}
	
}




