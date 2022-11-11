package day2;

public class Operators {

	public static void main(String[] args) {
		int a =10;
		int b=20;
		
		//Arithmetic operators --> + - */ %
		
		System.out.println("-----------Arithmetic Operator------------");
		System.out.println("Sum of a and b is:"+(a+b));
		System.out.println("Diff of a and b is:"+(b-a));
		System.out.println("Mul of a and b is:"+(a*b));
		System.out.println("Div of a and b is:"+(a/b));
		System.out.println("Mod div of a and b is:"+(a%b));
		
		//Relational Operators (Comparison Operators)---> == <> <= >= !=
		//Always return boolean value
		
		System.out.println("-----------Relational Operator------------");
		System.out.println(a==b);//false
		System.out.println(a>b);//F
		System.out.println(a<b);//T
		System.out.println(a>=b);//F
		System.out.println(a<=b);//T
		System.out.println(a!=b);//T
		
		// logical Operators &&  ||   !
		//Its Work between two boolean
		
		boolean x=true ;
		boolean y=false;
		System.out.println("-----------Logical Operator------------");
		System.out.println(x && y);//f
		System.out.println(x || y);//t
		System.out.println(!x);//f
		System.out.println(! y);//t
		
		
		//Increment /Decrement operators ++ -----
		 a=10;
		 
		
		 a++; //a=a+1;
		  
			System.out.println("-----------Increment /Decrement  Operator------------");
			System.out.println(a);
			
			b=20;
			b--;//b=b-1;
			System.out.println(b);
					

	}

}
