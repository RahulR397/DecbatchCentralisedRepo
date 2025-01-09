package Package1;

public class Constructor 
{
      public Constructor() 
      {
    	 this(1,2,3);
    	System.out.println("Default paramterized constructor");
			
	  }
      public Constructor(int a)
      {
    	this();
    	System.out.println("One paramterized constructor");
	  }
      public Constructor(int a,int b)
      {
    	  this(3);
		System.out.println("two paramterized constructor");
	  }
      public Constructor(int a,int b, int c)
      {
    	  
		System.out.println("three paramterized constructor");
		 
	  }
      public static void main(String[] args)
      {
		Constructor ref=new Constructor(3,2);
	 }
      
}
