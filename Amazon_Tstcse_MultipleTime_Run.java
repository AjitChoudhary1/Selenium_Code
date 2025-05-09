package seleniumTestNG_code2;

import org.testng.annotations.Test;

public class Amazon_Tstcse_MultipleTime_Run 
{                     
	@Test (invocationCount=10)
	public void searchtoAmazon()
	{
		System.out.println("Iphone 16 pro max");
	}
	
	@Test
	public void login()
	{
		System.out.println("Jat Sahab ji");
	}

}
