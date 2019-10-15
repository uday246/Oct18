package Oct5th;

interface Test{
	void sum();
}
class A implements Test
{
	public void sum()
	{
		System.out.println("A");
	}
}
class B implements Test
{
	public void sum()
	{
		System.out.println("B");

	}
}

class C implements Test
{
	public void sum()
	{
		System.out.println("C");

	}
}

public class mainclass {
	
public static void main(String ar[]){
	driver.getsum(new C());
}
}
class driver
{
	 static void getsum(Test i)
	{
		i.sum();
	}
}
