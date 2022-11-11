package practice_java;

public class Animal_Demo {
	
	  int age;
	   String name;
	   String colour;
	   void demo (int dogAge,String dogName,String dogColour)
	   {
		   
		  age=dogAge;
		  name=dogName;
		  colour=dogColour;
	   }
	   
	   void display()
	   {
	   
		 System.out.println(name);  
		 System.out.println(age);
		 System.out.println(colour);
		 
	   }
	   public static void main(String[] args) {
		Animal_Demo buzo=new Animal_Demo();
		buzo.demo(10, "Bandu", "Brown");
		 buzo .display();
	}
		   
  
	
	
	
	

}
