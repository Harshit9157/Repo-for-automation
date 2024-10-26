package testingbaba_test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import testingbaba_pages.Loginpage;

public class ScreenShot_test extends Baselibrary
{
	Loginpage ob;
	@BeforeClass
	public void getLunchUrL_testingbaba() 
	{
		try {
			getLunchURL("https://testingbaba.com/old/");
		}
		catch (IOException e) 
		{
			
			e.printStackTrace();
		}
		ob= new Loginpage();
	}
	
	@Test(priority = 0)
	public void getTitle_testingbaba()
	{
		ob.getTitle_testingbaba();
	}
	@Test(priority = 1)
	public void clickonclosebtn() throws InterruptedException, IOException 
	{ 
		
		ob.clickonclosebtn();
		Thread.sleep(1000);
		 File src= 	( (TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File destination= new File("D:\\Eclipse\\automation_framwork\\ScreenShot\\first.png");
			FileUtils.copyFile(src, destination);
	}
	
	
	
	
}
