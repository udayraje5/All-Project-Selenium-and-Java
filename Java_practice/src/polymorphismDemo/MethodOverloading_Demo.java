package polymorphismDemo;

public class MethodOverloading_Demo 
{
	int a;
	int b; 
	
	int add(int c, int d)
	{
		 a=c;
		 b=d;
		
		return a+b;
	}
	int add(float f,float e)
	{
		 a= (int) f;
		 b=(int) e;
		return a+b;
	}
	int add (double f,float e)
	{
	    a=(int) f;
	    b=(int) e;
	    return a+b;
	}
	
	
	
	public static void main(String[] args) 
	{
		MethodOverloading_Demo mot=new MethodOverloading_Demo();
		System.out.println(mot .add (10,20));
		int s=mot.add(10,20);
		System.out.println(s);
		System.out.println(mot.add(12.5f,13.5f));
		System.out.println(mot.add(15.5,15.5f));
	

	}

}
