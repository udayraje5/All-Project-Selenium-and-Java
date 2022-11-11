package abstraction;

public class ConcreteClass extends Abstraction_Demo 

{

	@Override
	void dmo()
	{
	super.xyz();
	System.out.println("Good Morning");
	System.out.println(10);
	System.out.println("Darlling");
	}

	public static void main(String[] args) {
		
		
		ConcreteClass cd=new ConcreteClass();
		cd.dmo();
		cd.xyz();
		
	}
	
}

