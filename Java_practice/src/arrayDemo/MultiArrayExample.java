package arrayDemo;

public class MultiArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] [] = new int [3] [3];
		a[0] [0]=101;
		a[0] [1]=102;
        a[0] [2]=103;
        a[1] [0]=104;
        a[1] [1]=105;
        a[1] [2]=106;
        a[2] [0]=107;
        a[2] [1]=108;
        a[2] [2]=109;
        
  int b[] [] = {{101},{102},{103},{104},{105},{106},{107},{108},{109}};
  
  System.out.println(a[2][2]);//for single element
   /* for (int i=0;i<=a.length-1;i++)
{   
    	
    	for (int j=0;j<a[i].length;j++)
    {
    		System.out.println(a[i][j]);
    }
} */
    for(int j[]:b)
    {
    	for(int k:j)
    	{
    		System.out.println(k);
    	}
    }
    
  }
	}


