package testingbaba_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import testingbaba_pages.Loginpage;

public class Logintest extends Baselibrary
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
//		String header=driver.findElement(By.xpath("//h2[@class=\"heading-agileinfo\"]")).getText();
//		System.out.println(header);
//		String headertegname=driver.findElement(By.xpath("//h2[@class=\"heading-agileinfo\"]")).getTagName();
//		System.out.println(headertegname);
//		String Attribute=driver.findElement(By.xpath("//h2[@class=\"heading-agileinfo\"]")).getAttribute("class");
//		System.out.println(Attribute);
//		String Attributecss=driver.findElement(By.xpath("//h2[@class=\"heading-agileinfo\"]")).getCssValue("color");
//		System.out.println(Attributecss);
//		driver.switchTo().frame(0);
//	    WebElement first=	driver.findElement(By.xpath("//iframe[@src=\"Checkbox.html\"]"));
//		driver.switchTo().frame(first);
	}
	@Test(priority = 2)
	
	public void clickonpracticebtn() 
	{
		ob.clickonpracticebtn();
//	System.out.println(getReadData("studentid"))  ;
		}
	@Test(priority = 3)
	public void clickonElement()
	{
		ob.clickonElements();
	}
	@Test(priority = 4)
	public void clickonRatiobtn() throws InterruptedException
	{Thread.sleep(1000);
		ob.clickonRatiobtn();
	}
	
	@Test(priority = 5)
	public void clickonYesbtn()
	{
		ob.clickonYesbtn();
	}
//	public void clickonCheckboxbtn() throws InterruptedException
//	{
//		Thread.sleep(1000);
//		ob.clickonCheckboxbtn();
//		driver.switchTo().frame(0);
//		driver.findElement(By.xpath("//input[@id=\"myCheck\"]")).click();
//	String mobiletitle=	driver.findElement(By.xpath("//h6[text()=\"You are selected Mobile\"]")).getText();
//		if(mobiletitle.contains("Mobile"))
//		{
//			System.out.println("passed");
//		}
//		else {
//			System.out.println("failed");
//		}
//	}
}

