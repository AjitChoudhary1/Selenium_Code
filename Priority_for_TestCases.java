package seleniumTestNG_code2;

import org.testng.annotations.Test;

public class Priority_for_TestCases
{                                                      //we can set priority within the same class only
	@Test (priority=1)
	public void login()                                    //priority can be negative also like -1, -10
	{                                                      //priority can be default also as 0
		System.out.println("Jay Veer Tejaji");
	}

	@Test                                              //here is default 0
	public void regstr()
	{
		System.out.println("jay vinayak ji");
	}

	@Test (priority=2)
	public void logout()
	{
		System.out.println("Jay baba ramdev ji");
	}

}
