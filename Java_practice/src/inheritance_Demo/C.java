package inheritance_Demo;

public class C extends A {
	int c=30;
	void multiDemoC()
	{
		System.out.println("multiDemoC");
	}
	
	public static void main(String[] args) 
		
	 { 
		C c=new C();
		System.out.println(c.a);
		c.multiDemoA();
		System.out.println(c.c);
		c.multiDemoC();
	}


}
