package castingDemo;

public class DownClass extends Child
{

	public static void main(String[] args) {
		
Parent p=new Child();
p.parent(); //upcasting

Child c=(Child)p; //downcasting
c.showchild();
c.child();


	}

}
