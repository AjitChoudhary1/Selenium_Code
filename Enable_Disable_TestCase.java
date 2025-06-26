package seleniumTestNG_code2;

import org.testng.annotations.Test;

public class Enable_Disable_TestCase
{
	@Test (enabled=false)
	public void login()
	{
		System.out.println("Jay Veer Tejaji");
	}

	@Test (priority=1,enabled=true)                                    //default status is always enabled=true
	public void regstr()
	{
		System.out.println("jay vinayak ji");
	}

	@Test
	public void logout()
	{
		System.out.println("Jay baba ramdev ji");
	}

}
