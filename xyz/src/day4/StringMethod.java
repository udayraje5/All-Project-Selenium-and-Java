package day4;

public class StringMethod {

	public static void main(String[] args) {
		
		String s="Welcome";
		String s1=" to Java";
		
		System.out.println(s.length());//Length of String 
		
		System.out.println(s.concat(s1));//Joining of string
		
		//trimming the String 
		s="    Welcome   ";
         System.out.println("Before trimming string is:"+s);
         System.out.println("After trimming string is:"+s.trim());
         
         
         //charAt()
         s="Welcome";
         System.out.println(s.charAt(5)); //Returns character based on index number ,index will start from 0.
         
         //contasin()-->Always true 
        
         s="Welcome";
         
         System.out.println(s.contains("Wel"));
         System.out.println(s.contains("wel"));
         System.out.println(s.contains("Welme"));
         
         
         //Comparing string equals()
         
         s="welcome";
         
         
         System.out.println(s.equals("welcome"));
         System.out.println(s.equals("  welcome"));
         System.out.println(s.equals("Welcome"));
         
         
         System.out.println(s.equalsIgnoreCase("Welcome"));
         
         //Replace
         
         s="Welcome to java";
         
         
         System.out.println(s.replace('W', 'M'));
         System.out.println(s.replace("java", "Selenium"));
         
         //Substring 
         
         s="Welcome";
         
         System.out.println(s.substring(3, 7));
         System.out.println(s.substring(4, 7));
         System.out.println(s.substring(0, 7));
         System.out.println(s.substring(4, 5));
         System.out.println(s.substring(3, 5));
         
         // Converting Case --toLowerCase  or UperCase
         
         s="WELCOME";
         System.out.println(s.toLowerCase());
         
         s="udayraje";
         
         System.out.println(s.toUpperCase());
         
          
         
	}

}
