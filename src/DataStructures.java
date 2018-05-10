import java.util.*;
//fix other classes menu!!!!
public class DataStructures {

	public DataStructures()
	{
		System.out.println("Data Structures are particular ways of organizing data programs, including storing and manipulating the data"
				+ "\nFor now, there are three kinds: Array(one and two dimensional), ArrayList, and HashMap."
				+ "Each data types has its own advantages and disavantages.");
	}
	
	public void feature()
	{
		int quit = 0;
		while(true)
		{
			System.out.println("\nData Structure: \n0 to quit\n1 for array\n2 for ArrayList\n3 for HashMap");
			System.out.println("- Enter command: ");
			switch(readInputInt())
			{
			case 0:
				quit = -1;
				break;
			case 1:
				System.out.println("An array is a container object that holds a fixed number of values of a single type, thus robust in "
						+ "nature. \ne.g. String is an array of char(s).");
				System.out.println("- Press enter to create a length 5 Integer type array.");
				if(readEnter())
				{
					Integer[] arr = new Integer[] {1, 2, 3, 4, 5};
					System.out.println("The array: " + printAllElements(arr));
				}
				
				System.out.println("Each element can be accessed or altered with arr[] or arr[] = notation");
				System.out.println("arr[row][col] is a 2D array implementation, which provides a table or grid data structure.");
				break;
			case 2:
				System.out.println("An ArrayList is a resizable and contains more functionality implementation of the interface List, providing "
						+ "more flexibility then an array.");
				System.out.println("- Press enter to create an ArrayList");
				if(readEnter())
				{
					ArrayList<Integer> l = new ArrayList<Integer>();
					System.out.println("Unlike arrays, it is able to be lengthened by the add() method until a maximum length of Interger.MAX_VALUE: 2^31 - 1.");
					int innerQuit = 0;
					while(true)
					{
						System.out.println("\n0 to quit\n1 to add()");
						switch(readInputInt())
						{
						case 0: 
							innerQuit = -1;
							break;
						case 1:
							System.out.print("Add an integer to the last index of the ArrayList: ");
							l.add(readInputInt());
							System.out.println("The ArrayList now: " + printAllElements(l));
						}
						if(innerQuit == -1)
						{
							System.out.println("quitting...");
							break;
						}
					}
					
					System.out.println("Other methods for ArrayList include: get(), size(), remove(), clear(), clone(), contains(), indexOf()");
				}
				break;
			case 3:
				System.out.println("HashMap is a implementation of the Map interface. It is a collection of key-value pairs.");
				System.out.println("- Press enter to create a HashMap");
				if(readEnter())
				{
					HashMap<String, Integer> map = new HashMap<String, Integer>();
					System.out.println("HashMap is often used to create a dictionary, where values can be looked up by keys because each key is unique.");
					map.put("Alan's", 7890);
					map.put("Peter's", 4911);
					map.put("Kevin's", 6969);
					System.out.println("e.g. a phonebook can be stored in a HashMap, press enter to see the key value pairs of it.");
					if(readEnter())
					{
						System.out.println("Last four digits of phone numeber of my friedns:");
						printKeyValue(map);
					}
				}
				break;
			}
			if(quit == -1)
			{
				break;
			}
			System.out.println("- Press Enter to continue...");
			readEnter();
		}
		
	}
	
	//elements in array is same type. any type
	//has to be public(same visibility as the interface)
	public String printAllElements(Integer[] arr) 
	{
		return Arrays.toString(arr);
	}

	ArrayList<Integer> a = new ArrayList<Integer>();
	public String printAllElements(List<Integer> l) 
	{
		return l.toString();
	}
	
	public void printKeyValue(HashMap<String, Integer> map) 
	{
		for(String key: map.keySet())
		{
			Integer num = map.get(key);
			System.out.println("Key: " + key + "Value: " + num);
		}
		
	}
	
	private int readInputInt()
	{
		//@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		//System.out.print("- Enter command: ");
	    int num = scanner.nextInt();
		return num;
	}
	
	private static boolean readEnter()
	{
		Scanner scanner = new Scanner(System.in);
	    //System.out.print("- Press enter to continue...");
	    return scanner.nextLine().equals("");
	}
	
	
	
}
