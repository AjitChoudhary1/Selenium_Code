package selenium_code;

import java.util.Date;

public class Date_Class1
{
	public static void main(String[] args)
	{
		Date d1= new Date();
		   System.out.println(d1.getTime());                   //use epoch cnvrtr to convrt time

		     Date d2= new Date(d1.getTime());
		        System.out.println(d2);

		String f1=   d2.toString();
		    //DDMMYYYY
		  String date= f1.substring(8, 10);
		     String month= f1.substring(4, 7);
		       String year=  f1.substring(f1.length()-4);

		          System.out.println("Date-> " + date.concat(month).concat(year));

		    String hour=  f1.substring(11, 13);
		       String min=  f1.substring(14, 16);
		          String sec=  f1.substring(17, 19);

		             String f2=   hour.concat(min).concat(sec);
		                   System.out.println("Time-> " + f2);





	}

}
