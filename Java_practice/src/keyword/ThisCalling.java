package keyword;

public class ThisCalling  extends ThisKeyword //This class
{
int a=20;
void add()
{
	super.add();
	System.out.println( this.a);
	System.out.println("This Class");
	System.out.println(super.a);
}

void sub() 
{
	this.add();
	System.out.println("pillu");
}

	public static void main(String[] args)
	{
		ThisCalling don=new ThisCalling();
	
		
		don.sub();
		
		
	}

}
