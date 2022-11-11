package day6;

public class ThisKeyword {
	
	int a, b; //instance variables or class variables
	
	void getValues(int a,int b) //method variable or external variable
	 {
		 this.a=a;
		this.b =b;
	 }
	 
	 void printValues()
	 {
		 System.out.println(a);
		 System.out.println(b);
	 }

	public static void main(String[] args) {
		
		ThisKeyword th=new ThisKeyword();
		 th.getValues(10, 20);
		 th.printValues();

	}

}
