package stringDemo;

public class StringExample {
	
	char c='a';//char
	String str="Good Moring";//String declaration without keyword.
	String str2="Good Moring";
	String strr="   ";//false -empty character also count.
	String strr2="";//true -no space
	String str1=new String("Uday");//String declaration with keyword.

	public static void main(String[] args) {
      
		StringExample imp=new StringExample();
	  System.out.println(imp.str.toUpperCase());
	  System.out.println(imp.str.toLowerCase());
	  System.out.println(imp.str.contains("m"));
	  System.out.println(imp.str.contains("M"));
	  System.out.println(imp.strr.isEmpty());
	  System.out.println(imp.strr2.isEmpty());
	  System.out.println(imp.str.endsWith("u"));//end not with u. is "g".
	  System.out.println(imp.str.startsWith("G"));
	  System.out.println(imp.str.substring(6));//you give the value of substring you want.
	  System.out.println(imp.str.concat("  uday"));

}
}//IN JAVA STRING INDEX always start with 0.