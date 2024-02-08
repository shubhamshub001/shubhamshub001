package topic_Junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Test2 {
	@BeforeClass
	public static void runOnceBeforeClass()
	{
		System.out.println("@BeforeClass--runOnceBeforeClass");
	}

	@AfterClass
	public static void runOnceAfterClass()
	{
		System.out.println("@AfterClass--runOnceAfterClass");
	}
	
	@Before
	public void runOnceBeforetestmethod()
	{
		System.out.println("@Before--runOnceBeforetestmethod");
	}
	
	@After
	public void runOnceAfetrtestmethod()
	{
		System.out.println("@After--runOnceAftertestmethod");
	}
	
	@Test
	public void test_method1()
	{
		System.out.println("@Test--test_method1()");
	}
	
	@Test
	public void test_method2()
	{
		System.out.println("@Test--test_method2()");
	}
	
	
	
	
	

}
