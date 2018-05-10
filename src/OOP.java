
public abstract class OOP{
	
	private String name;
	
	public static void main(String[] args)
	{
		System.out.println("Object Oriented Programming is a... in Java.");
		System.out.println("An abstract class is more of a central concept that... ");
		//super class... sub class
	}

	public OOP(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public abstract void feature();

}
