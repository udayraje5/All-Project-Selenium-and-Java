package day_3;

public class JumpingStatements {

	public static void main(String[] args) {
    
		//Break command
		
	/*	for (int i = 1; i <= 10; i++) 
		{

			if (i == 5) 
			{
				break;
			}
			System.out.println(i);
		}  */
       
		//Continue command
		
	/*	for(int i= 1;i<=10;i++) 
		{
			if(i==5)
			{
				continue; //jump number
			}
			System.out.println(i);// 1 2 3 4 6 7 8 9 10
		}  */
		
/*		for(int i= 1;i<=10;i++) 
		{
			if(i%2==1)
			{
				continue; //jump number
			}
			System.out.println(i);// 2 4 6 8 10
		} */
		
		
		for(int i= 1;i<=10;i++) 
		{
			if(i==5 || i==3 || i==7)
			{
				continue; //jump number
			}
			System.out.println(i);// 1 2 4 6 8 9 10
		}
		
	}

}
