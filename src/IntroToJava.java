import java.util.Scanner;
// TODO fix line indentation stuff for this and GenericClass.java
public class IntroToJava {

	//make a static counter in all classes to count if one concept is run already 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This program gives you a brief understanding of important concepts in Java. Topics including Object-oriented "
				+ "programming and data structures.");
		int quit = 0;
		while(true)
		{
			System.out.println("\nMain Menu: \n0: quit\n1: Class and Object\n2: Inheritance\n3: Polymorphism\n4: Encapsulation\n5: Data Structure");
			
			switch(readInputCommand())
			{
			case 0:
				quit = -1;
				break;
			case 1:
				GenericClass.introToClass();
				GenericClass obj = new GenericClass("Class!");
				obj.feature(obj.toString());
				System.out.println("- Press enter to invoke a method...");
				if(readEnter())
				{
					System.out.println(obj.genericMethod());
				}
				break;
			case 2:
				Inheritance inher = new Inheritance();
				inher.feature();
				break;
			case 3:
				OOP poly = new Polymorphism();
				poly.feature();
				break;
			case 4:
				OOP encapsed = new Encapsulation();
				encapsed.feature();
				break;
			case 5:
				DataStructures data = new DataStructures();
				data.feature();
				break;
			}
			
			if(quit == -1)
			{
				System.out.println("quitting... bye!");
				break;
			}
			System.out.println("- Press Enter to continue...");
			readEnter();
		}
		//maybe at IntroToJava: press enter to enable feature
		//Interfaces 
		//Inheritance, objects and methods
	}
	
	private static int readInputCommand()
	{
		Scanner scanner = new Scanner(System.in);
	    System.out.print("- Enter command: ");
	    int num = scanner.nextInt();
		return num;
	}
	
	private static boolean readEnter()
	{
		Scanner scanner = new Scanner(System.in);
	    //System.out.print("Press enter to continue.");
	    return scanner.nextLine().equals("");
	}
	

}
