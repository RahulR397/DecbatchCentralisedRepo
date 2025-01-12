package Package1;

public class GlobalLocalVariable 
{ 
	int a;//global variable
	int b;
	public void method1()
	{
		a=10;
		System.out.println("here method1 "+ a);//here we declared variable of global 
		//Declared outside the method inside the class,scope within the class, we can use this
		//anywhere in the  class
	}
	public void method2()
	{
		b=a+1; 
		System.out.println("here method 2 " +b);
	}
	public static void main(String[] args) 
	{
		GlobalLocalVariable ref=new GlobalLocalVariable();
		ref.method1();
		ref.method2();
		int c;
		c=30;
		System.out.println("Local vriable decalred "+ c); 
		//local is with in the method //declared within the method 
		
	}
}
