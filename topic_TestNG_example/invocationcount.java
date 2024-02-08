package topic_TestNG_example;

import org.testng.annotations.Test;

public class invocationcount {

	
	@Test(invocationCount=5) //instead of "For" loop we can use InvocationCount attribute
	public void gooto()
	{
		System.out.println("Print this 5 times");
	}
}
