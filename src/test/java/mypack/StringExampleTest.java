package mypack;

public class StringExampleTest 
{
	public String greet(String name)
	{
		return "Good Morning !"+ name;
	}
	
	public static void main(String[] args)
	{
		StringExampleTest obj = new StringExampleTest();
		System.out.println(obj.greet("     William       James    "));
		System.out.println(obj.greet("Jack"));
		System.out.println(obj.greet("Mohan"));
		System.out.println(obj.greet("   Pooja   "));
		
	}

}