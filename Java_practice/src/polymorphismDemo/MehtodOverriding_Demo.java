package polymorphismDemo;
	
public class MehtodOverriding_Demo 

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
	

}
