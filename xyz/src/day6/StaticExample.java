package day6;

public class StaticExample {
	
	 static int  a=10;  // static variable 
	 
	 int b= 20;  // non -static variable
	 
	 static void m1()//static method
	 {
		 System.out.println("this is m1 - static method ");
	 }
	 
	 void m2()  // non static method
	 {
		 System.out.println("this is m2 - non static method");
	 }
	 
	 void m3()
	 {
		 System.out.println("this is m3 method --non static method");
		 System.out.println(a);
		 System.out.println(b);
		 m1();
		 m2();
		 
	 }
	 
	

	public static void main(String[] args) {
		
		
		//Static method can access only static stuff
		
		System.out.println(a);
		
		m1();
		
	//	System.out.println(StaticExample.a);  // it is used when  main method in different class
	//	StaticExample.m1(); //it is used when  main method in different class
        
	//	System.out.println(b);  incorrect ,bcoz b is non static variable
		
	// m2(); 	incorrect ,bcoz b is non static method
		
		
		StaticExample se =new StaticExample();
		
		System.out.println(se.b);
		se.m2();
		
		se.m3();
	}

}
