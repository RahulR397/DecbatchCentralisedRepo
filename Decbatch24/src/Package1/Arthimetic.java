package Package1;

public class Arthimetic 
{

	public int add(int a,int b)	
	{
		int c;
		c=a+b;
		System.out.println("Add result is 	"+c);
		return c;
	} 
	public int sub(int x,int y)
	{
		int z;
		z=x-y;
		System.out.println("Sub result is "+z);
		return z;	
	}
	public int multi(int r,int s)
	{
		int t;
		t=r*s;
		System.out.println("Multi result is "+t);
		return t;
	}
	public void div(int u,int v)
	{
		int w;
		w=u/v;
		System.out.println("So result is "+w);
		
	}
	public static void main(String[] args) 
	{
		Arthimetic A1= new Arthimetic();
		int Sumresult=A1.add(10, 2);
		int Sumresult1=A1.add(Sumresult, 2);
		int Subresult=A1.sub(Sumresult1, 2);	
		int Multiresult=A1.multi(Subresult, 2);
		A1.div(Multiresult, 2);
		//((((10+2)+2)-2)2*2)/2
		
	}
	
}
