package lesson3;

public class DiamondProblem implements First, Second
{

	public static void main(String[] args) 
	{
		
		DiamondProblem obj = new DiamondProblem();
		obj.show();
	}
	
	public void show()
	{
		First.super.show();
		Second.super.show();
	}
}

interface First
{
	default void show()
	{
		System.out.println("Displaying First");
	}
}

interface Second
{
	default void show()
	{
		System.out.println("Displaying Second");
	}
}