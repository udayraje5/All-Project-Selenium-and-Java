package day6;

public class OverloadMainMethod   //IMP for interview purpose
{

	public void main(int x) //1
	{

		System.out.println(x);

	}

	public void main(int x, int y) //2
	{

		System.out.println(x+y);

	}

	public static void main(String[] args) {
		
		 OverloadMainMethod om =new  OverloadMainMethod();
		 om.main(1000);  // 1
		 om.main(100, 200);  //2

	}

}
