package day4;

public class Single_Dimensional_Array {

	public static void main(String[] args) {
		
	/*	int a[] =new int[5];//declared array with size 5; starting index is 0,last index is4.
		
		//storing/ inserting values into array
		
		a[0]=100;
		a[1]=200;
		a[2]=300;      // this method have limitation ,we declare the array,so size is fix.
		a[3]=400;
		a[4]=500;      */
		
		int a[]= {100,200,300,400,500};//Declare an array without specifying size
		
		System.out.println("Length of an array--"+a.length);//print length/size of an array
		
		System.out.println(a[2]);  //read specific value 
		
/*		for(int i=0;i<=4;i++) {
			
			System.out.println(a[i]);  //100,200,300,400,500
		}  */
		
		//read values using for loop
		
		for (int i:a) {
			
			System.out.println(i);//100,200,300,400,500
		}

	}

}
