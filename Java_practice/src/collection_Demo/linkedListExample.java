package collection_Demo;

import java.util.LinkedList;

public class linkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll=new LinkedList();
		
        ll.add("Yuvi");
        ll.add("Ravi");
        ll.add("Maddy");
        ll.add("Kapil");
        System.out.println(ll.size());
        System.out.println(ll);
        ll.remove(2);
        System.out.println(ll);
        ll.add(2,"Madhev");
        System.out.println(ll);
        
	
	
	
	
	}

}
