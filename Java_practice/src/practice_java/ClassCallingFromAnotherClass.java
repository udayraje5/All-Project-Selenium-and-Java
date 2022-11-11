package practice_java;

public class ClassCallingFromAnotherClass
{
   static int a=10;
  static String name= "Uday Araolikar";
    
   
  static void display()
   {
	
	System.out.println(a);
	System.out.println(name);
   }
  public static void main(String[] args) {
	  ClassCallingFromAnotherClass demo=new ClassCallingFromAnotherClass();
	System.out.println(a);  //10
	display();//
	
}
}
