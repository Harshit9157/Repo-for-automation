package testingbaba_test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import testingbaba_pages.Loginpage;

public class Upload_file extends Baselibrary
{
	Loginpage ob;
	@BeforeClass
	public void getLunchUrL_testingbaba()
	{
		getLunchURL("https://testingbaba.com/old/");
		ob= new Loginpage();
	}
	
	@Test(priority = 0)
	public void getTitle_testingbaba()
	{
		ob.getTitle_testingbaba();
	}
	@Test(priority = 1)
	public void clickonclosebtn() throws InterruptedException 
	{ 
		Thread.sleep(1000);
		ob.clickonclosebtn();
}
	@Test(priority = 2)
	
	public void clickonpracticebtn() 
	{
		ob.clickonpracticebtn();

		}
    @Test(priority = 3)
	public void Uploadfile() throws InterruptedException, IOException
    {
		driver.findElement(By.xpath("//button[@data-target=\"#elements\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"v-pills-tab\"]/a[7]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id=\"File1\"]")).click();
		Thread.sleep(1000);
		UploadfileUsingRobotClass("D:\\Eclipse\\automation_framwork\\testdata\\proprtfile.properties");
		
		
    }
	
	
	
}
