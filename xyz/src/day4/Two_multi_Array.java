package day4;

public class Two_multi_Array {

	public static void main(String[] args) {
		int a[][]= new int[3][2];
		
		a[0][0]= 100;
		a[0][1]= 200;
		
		a[1][0]= 300;
		a[1][1]= 400;
		
		a[2][0]= 500;
		a[2][1]= 600;  
		
		//Or
      
//		int a[][]= {{100,200},{300,400},{500,600} };//if do not know the size
		
		System.out.println("Number of row:"+a.length);
		
		 System.out.println("Number of Columns:" +a[0].length);
		 
/*		 for (int i=0;i<a.length;i++)//Outer 'For loop' (represent row)
		 {
			 for(int j=0;j<a[i].length;j++) //Inner 'For loop' (represent column)
			 {
				 System.out.println(a[i][j]);
			 }  */
		 
		 //Enhanced 'For loop'
		 
		 for(int r[]:a) //(100,200),..
		 {
			 
			 for(int i:r) //one by one r value is provide to i.
			 {
				 
				 System.out.println(i); //100,200,300...
			 }
			 
		 }
		 
		 
				
		
		



	}

}
