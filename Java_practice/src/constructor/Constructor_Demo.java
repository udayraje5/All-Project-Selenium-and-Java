package constructor;

public class Constructor_Demo 
{
      private int a;
      String str;
      Constructor_Demo(int call)
      {
    	  
    	a=call;
    	System.out.println(a);//10
    			
      }  
     
    String demo()
    {
    	
    	return  "Goog Morning";
    	
    }
      
   
	public static void main(String[] args) 
	{
		Constructor_Demo cd=new Constructor_Demo(10);
		System.out.println(cd.a);//10
		String st=cd.demo();//Good Morning
		System.out.println(st);//Good Morning
		

	}

}
