package day5;

public class ConstructorDemo 
{
	
	int x;
	int y;
	
/*	ConstructorDemo() //default Constructor 
	{
		x=10;
		y= 20;
	} */
	
	ConstructorDemo( int a,int b) //Parameterized Constructor 
	{
		x=a;
		y= b;
	}
	
	void print()
	{
		System.out.println(x*y);
		System.out.println(x+y);
	}
	

	public static void main(String[] args) {
       
	//	 ConstructorDemo cm=new  ConstructorDemo(); //Invokes default constructor
		 
		 ConstructorDemo cm=new  ConstructorDemo(100,200); //Invokes Parameterized constructor
		  cm.print();
		  
		  
		  
		
	}

}
