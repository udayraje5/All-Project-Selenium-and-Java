package constructor;

public class Constructor_Demo1 
{
	  private int a;
	    int b;
      String str;
      Constructor_Demo1(String abc,int call)//call and abc parameter scope is in between this 
                                             // constructor only.
      
      {
    	str=abc;  
    	a=call;
    	System.out.println(str);//10
    	System.out.println(a);		
      }  
      
      Constructor_Demo1(int call,String abc)//
      
      {
    	b=call;
    	str=abc;
    	System.out.println(b);
    	System.out.println(abc);
      
      }
       
      
     String demo()
    {
    	
    	return  "Goog Morning";
    	
    }
      
   
	public static void main(String[] args) 
	{
		Constructor_Demo1 cd=new Constructor_Demo1("Hello",10);
		Constructor_Demo1 pd=new Constructor_Demo1(10,"Hello");
		System.out.println(cd.a);//10
		String st=cd.demo();//Good Morning
		String pt=cd.demo();//Good Morning
		System.out.println(st);
		System.out.println(pt);
		

	}

}

	
	
	
	

