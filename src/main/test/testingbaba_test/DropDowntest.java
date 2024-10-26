package testingbaba_test;

import java.awt.event.FocusListener;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import testingbaba_pages.Loginpage;

public class DropDowntest extends Baselibrary
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
	
	public void clickonpracticebtn() throws InterruptedException
	{
		ob.clickonpracticebtn();
		driver.findElement(By.xpath("//button[@data-target=\"#widget\"]")).click();
		Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()=\"select menu\"]")).click();
        Thread.sleep(1000);
       
       
//  List<WebElement>  option= driver.findElements(By.xpath("(//select[@class=\"form-control\"])[3]/child::option"));
    WebElement dropdown=  driver.findElement(By.xpath(" (//select[@class=\"form-control\"])[3]")) ;
  Select sel=new Select(dropdown);
  sel.selectByIndex(4);
 
  
//  for(WebElement ele:option) 
//  {Thread.sleep(1000);
//	String str=  ele.getText();
//	if(str.equals("HTML"))
//	{
//		ele.click();
//		break;
//	}
//  }
	}
	
}
