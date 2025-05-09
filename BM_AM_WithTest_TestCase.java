package seleniumTestNG_code2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BM_AM_WithTest_TestCase 
{
	@Test
	public void testcase()
	{
		System.out.println("test1");
	}
	
	@Test
	public void testcase1()
	{
		System.out.println("test2");
	}
	
	@BeforeMethod
	public void BM()
	{
		System.out.println("precondition BM");
	}
	
	@AfterMethod
	public void AM()
	{
		System.out.println("postcondition AM");
	}
	
	
	
	

}
