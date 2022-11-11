package assertionDemo;

import org.testng.Assert;
import org.testng.annotations.Test;
//Hard Assertion
public class AssertEx {
     @Test
     public void assertDemo()
     {

    	 System.out.println("Hello");
    	 System.out.println("Hello");
 //   	 Assert.assertTrue(false);
 //   	 Assert.assertEquals("Hello", "Hello");
    	 Assert.assertEquals("Hello", "Hollo");
    	 System.out.println("Hello");
    	 System.out.println("Hello");
     }
}
