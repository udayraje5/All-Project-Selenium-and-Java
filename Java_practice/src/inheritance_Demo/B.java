package inheritance_Demo;

public class B extends A {
	int b=20;
	void multiDemoB()
	{
		System.out.println("multiDemoB");
	}
	
	public static void main(String[] args) 
		
	 { 
		B b=new B();
		System.out.println(b.a);
		b.multiDemoA();
		System.out.println(b.b);
		b.multiDemoB();
	}

}
