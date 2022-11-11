package Test;
import inheritance_Demo.Multilevel_demo;
public class inherit_call extends Multilevel_demo
{

	public static void main(String[] args) {
		Multilevel_demo abc=new Multilevel_demo();
		System.out.println(abc.a);
		abc.demo();
		System.out.println(abc.b);
		abc.multidemo();

	}

}
