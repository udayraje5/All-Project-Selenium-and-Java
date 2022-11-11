package assertionDemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionEx 
{ @Test
    public void assertDemo()
    {
     SoftAssert sa=new SoftAssert();
     
	
   	 System.out.println("Hello");
   	 System.out.println("Hello");
//   	 sa.assertTrue(false);
//   	 sa.assertEquals("Hello", "Hello");
 	 sa.assertEquals("Hello", "Hollo");
   	 System.out.println("Hello");
   	 System.out.println("Hello");
   	 sa.assertAll();
    }

}
