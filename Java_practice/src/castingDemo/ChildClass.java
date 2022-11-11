package castingDemo;

public class ChildClass extends Parentclass
{
	int b=20;
	void childDemo() {
		System.out.println("childDemo");
	}

	public static void main(String[] args) {
		Parentclass parent=new ChildClass();
		System.out.println(parent.a);
		parent.demopc();
	

	}

}
