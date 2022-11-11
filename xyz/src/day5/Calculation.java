package day5;

public class Calculation // 1)Case 1- not taking parameters and also not returned any value.
    {

	int x = 10;
	int y = 20;

/*	void sum() {

		System.out.println(x + y);
	}  */
	
/*	int sum() //2)Case 2- not taking parameters but returning value. 
	{
		return (x+y);
	}  */
	
/*	void sum(int a, int b)  //3)Case 3- taking parameters ,but not returning any value
	{
		System.out.println(a+b);
	}  */
	
	int sum(int a,int b)  //4)Case 4- method is taking parameters and also returning a value. 

	{
		return (a+b);
	}
	
	

	public static void main(String[] args) {

		Calculation cal = new Calculation(); // (Object always create in main method )
//		cal.sum();  //Case 1
		
//		System.out.println(cal.sum()); //Case 2
        
//		cal.sum(100, 200); // Case3
		 
		System.out.println(cal.sum(200, 100)); //Case 4
		
	}

}
