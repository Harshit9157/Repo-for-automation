package testingbaba_test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import testingbaba_pages.Loginpage;
import testingbaba_pages.Practice_testbox;

public class Practice_sendkeys extends Baselibrary
{
   static String path="D:\\Eclipse\\automation_framwork\\testdata\\testdata.xlsx";
	Loginpage ob;
	Practice_testbox pt;
	
	@BeforeClass
	public void getLunchUrL_testingbaba()
	{
		getLunchURL("https://testingbaba.com/old/");
		ob= new Loginpage();
		pt= new Practice_testbox();
	}
	
	@Test(priority = 0)
	public void getTitle_testingbaba()
	{
		ob.getTitle_testingbaba();
	}
	@Test(priority = 1)
	public void clickonclosebtn() throws InterruptedException 
	{ Thread.sleep(1000);
		
		ob.clickonclosebtn();
	}
	@Test(priority = 2)
	public void clickonpracticebtn() throws InterruptedException 
	{Thread.sleep(1000);
	    ob.clickonpracticebtn();	
	}
	
	@Test(priority = 3)
	public void clickonelements() throws InterruptedException
	{Thread.sleep(1000);
	    pt.clickonelements();
	}
	@Test(priority = 4)
	public void clickontextbox()
	{ 
	    pt.clickontextbox();	
	}
	@Test(priority = 5)
	public void entervalueFullName() 
	{
		
	    pt.entervalueFullName(getExceldata(path, 0, 1, 0));	
	}

}
