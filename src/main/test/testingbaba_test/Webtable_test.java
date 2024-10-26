package testingbaba_test;

import org.openqa.selenium.By;
import org.seleniumhq.jetty9.util.thread.ThreadPool;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import testingbaba_pages.Loginpage;

public class Webtable_test extends Baselibrary
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
	public void clickonElement()
	{
		ob.clickonElements();
		
	}
	@Test(priority = 4)
	public void clickonWebtable() throws InterruptedException
	{Thread.sleep(1000);
		ob.clickonWebtable();
		driver.switchTo().frame(1);
		String fisrtname="harshit";
		driver.findElement(By.xpath("//input[@name=\"name\" and @pattern=\"^[a-zA-Z][\\sa-zA-Z]{2,32}\"]")).sendKeys(fisrtname);
		String email="harshitsaini122@gmail.com";
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys(email);
		driver.findElement(By.xpath("//button[text()=\"Save\"]")).click();
	String expectedname=	driver.findElement(By.xpath("//tr[@data-name=\""+fisrtname+"\"]/child::td[1]")).getText();
		
	    if(fisrtname.contains(expectedname)) {
	    	System.out.println("passed");
	    }
	    else {
	    	System.out.println("fail");
	    }
	    
	    String expectedemail=driver.findElement(By.xpath(" //td[text()=\""+email+"\"]")).getText();
	    if(email.contains(expectedemail))
	    {
	    	System.out.println("passed");
	    }
	    else {
	    	System.out.println("fail");
	    }
	}
}  
