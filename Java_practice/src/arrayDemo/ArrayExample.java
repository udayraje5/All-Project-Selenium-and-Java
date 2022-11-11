package arrayDemo;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		int b []=new int[5];
		int [] c=new int[5];
      //initialization of  an array
		a[0]=101;
		a[1]=102;
		a[2]=103;//Smiler data also store
		a[3]=104;
		a[4]=105;
		
		int d[]= {501,502,503,504,505,506};
		System.out.println(d.length);
		
		
		System.out.println("Size of an array"+a.length);//"" written data is not compulsory for program its for our use .
		//read array value
		System.out.println("Second location value in array"+a[2]);
		/*for (int i=0;i<=4;i++)
		  {
		 System.out.println(a[i]);
		  }*/
		 
		 for(int i:a) {
			 System.out.println(i);
		 }
	}

}
