package Package1;

public class Students
{
	int age;
	int number;
	
	public void display1()
		{
			System.out.println("Welcome to class");
		}
	public void display2()
	{
		System.out.println("Automation is very easy");
	}

	public static void main(String[] args) 
	{
		Students s1=new Students();
		s1.display1();
		s1.display2();
		s1.age=32;
		System.out.println(s1.age);
		s1.number=2345;
		System.out.println(s1.number);
		
		}
}
