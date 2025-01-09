package Package1;

public class Arthmetic1 
{
 //((((10*2)-2)+2)-2)/2)
	public int multiply(int a, int b)
	{
		int c;
		c=a*b;
		return c;
	}
	public int sub(int x,int y)
	{
		int z;
		z=x-y;
		return z;	
	}
	public int add (int a1,int b1)
	{
		int c1;
		c1=a1+b1;
		return c1;
	}
	public void div(int x1,int y1)
	{
		int z1;
		z1=x1/y1;	
		System.out.println("Final result is " +z1);
		
	}
	public static void main(String[] args) 
	{
		Arthmetic1 r1=new Arthmetic1();
		int mult=r1.multiply(10, 2);
		int sub=r1.sub(mult, 2);
		int add=r1.add(sub, 2);
		int sub1=r1.sub(add, 2);
		r1.div(sub1, 2);
		//((((10*2)-2)+2)-2)/2)
	}
	
}
