package polymorphismDemo;

public class OverrudeClass extends MehtodOverriding_Demo 

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
	OverrudeClass oc=new OverrudeClass();
	System.out.println(oc.add(10, 200));
	System.out.println(oc.add(30.5,40.5f));
	System.out.println(oc.add(013.5f, 012.4f));
	
	MehtodOverriding_Demo tc=new MehtodOverriding_Demo ();
	System.out.println(tc.add(50,40));
	System.out.println(tc.add(50.3, 30.20f));
	System.out.println(tc.add(60.23f, 078.12f));
}
}
