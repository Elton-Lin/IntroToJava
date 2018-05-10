import java.util.Scanner;

public class ControlStructures {
	public static void main(String[] args)
	{
		System.out.println("Control Structure class");
		whileLoop();
	}
	
	private int num;
	
	public ControlStructures(int num)
	{
		this.num = num;
	}
	
	public void execute()
	{
		switch(num)
		{
		case 0:
			whileLoop();
			break;
		case 1:
			forLoop();
			break;
		case 2:
			ifElseStatement();
			break;
		case 3:
			switchCase();
			break;
		case 4:
			breakStatement();
			break;
		case 5:
			returnStatement();
			break;
		}
	}
	
	private static void whileLoop()
	{
		System.out.println("While loop is a generic way of iterating...");
		Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter a number limit");
	    int limit = scanner.nextInt();
		int x = 0;
		
		while(x < limit)
		{
			System.out.println("x is now: " + x + "\nincremented x by 1...");
			x ++;
		}
		/*Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter two integer: ");
	    int number = scanner.nextInt();
	    int number2 = scanner.nextInt();
	    System.out.println("The number is: " + number + " " + number2);*/
	}
	
	private void forLoop()
	{
		
	}
	
	private void ifElseStatement()
	{
		//prob comparing numebrs if(5 > 4) etc...
	}
	
	private void switchCase()
	{
		
	}
	
	private void breakStatement()
	{
		
	}
	
	private String returnStatement()
	{
		return "Returned";
	}
	
}
