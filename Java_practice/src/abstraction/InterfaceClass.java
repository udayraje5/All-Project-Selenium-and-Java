package abstraction;

public class InterfaceClass implements  Interface_Demo 
{

	public static void main(String[] args) 
	{
		  InterfaceClass cd=new  InterfaceClass();//try to use IFF method 
		  cd.add();
		  cd.add();
		  cd.abc();
		  cd.demo();

	}

	@Override
	public void demo() {
		System.out.println("good morning");
		
	}

	@Override
	public int add() {
		System.out.println("man");
		
		return 30;
	}

	@Override
	public String abc() {
		System.out.println(20);
		return ("good");
	}

}
