package day6;

public class MethodOverloading {
	
	void add (int a,int b) //1
	{
		System.out.println(a+b);
	}
	void add (int a,double b) //2
	{
		System.out.println(a+b);
	}
	void add (double a,double b) //3
	{
		System.out.println(a+b);
	}
	void add (int a,int b,int c) //4
	{
		System.out.println(a+b+c);
	}
	

	public static void main(String[] args) {
		
		MethodOverloading mo=new MethodOverloading();
		
		mo.add(10,20);//1
		mo.add(10 ,20.5); //2
		mo.add(10.25,40.50); //3
		mo.add(200, 260, 300); //4
		

	}

}
