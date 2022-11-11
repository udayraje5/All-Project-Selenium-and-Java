package day5;

public class Student_main {

	public static void main(String[] args) {
		
		Student stu1=new Student(1001,"Don",'A');
		
		//1)Assing values by using reference variable
	/*	stu1.sid=1001;
		stu1.sname="Don";
		stu1.grade='A';  */
		
		//2)  Assing values By using method
	//	stu1.getvalues(1001, "Don", 'A');
		
		
		
		stu1.display();
		
		

	}

}
