package programs;

public class StringReversejava {

	public static void main(String[] args) 
	{
		String st="Hello";
		String st1="Hello";
		String str=new String("Hello");
		System.out.println(st==st1);//Addresses verify
		System.out.println(st.equals(st1));//Content verify 
		System.out.println(st==str);//Addresses not matches
		System.out.println(st.equals(str));//contents get matches

	}

}
