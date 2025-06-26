package seleniumTestNG_code2;

import org.testng.annotations.Test;

public class SameTestcase_Run_MltplTime
{
	@Test (invocationCount=5)                               //same test case runs multiple times
	public void login()
	{
		System.out.println("Jay Veer Tejaji");
	}

	@Test
	public void regstr()
	{
		System.out.println("jay vinayak ji");
	}

	@Test (invocationCount=5)
	public void logout()
	{
		System.out.println("Jay baba ramdev ji");
	}

}
