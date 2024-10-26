package baselibrary;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import excelutility.Excel_utility;
import gherkin.deps.com.google.gson.annotations.Until;
//import excelutility.Excel_utility;
import propertyutility.Proprtyutility;
import waitutilty.WaitUtility;

public class Baselibrary implements Proprtyutility 
{
     public static WebDriver driver;
     String configpath="D:\\Eclipse\\automation_framwork\\testdata\\proprtfile.properties";
	
	public void getLunchURL(String url) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\automation_framwork\\drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get(url);
     	driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         File src= 	( (TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     	File destination= new File("D:\\Eclipse\\automation_framwork\\ScreenShot\firstscreenshot.png");
     	FileUtils.copyFile(src, destination);
		
	}
	 

//	@Override
//	public String getExceldata(String path, int sheetno, int rowno, int colno) 
//	{String value=" ";
//		try 
//		{
//			FileInputStream fis=new FileInputStream(path);
//			XSSFWorkbook wb = new XSSFWorkbook(fis);
//			XSSFSheet sh = wb.cloneSheet(sheetno);
//			value=sh.getRow(rowno).getCell(colno).getStringCellValue();
//			
//		}
//		catch (Exception e) 
//		{
//			System.out.println(e);
//		}
//		
//		return value;
//	}
	 

	@Override
	public String getReadData(String key)  
	 {
		FileInputStream fis = null;
		try
		{
			fis = new FileInputStream(configpath);
		}
		catch (FileNotFoundException e)
		{
			
			e.printStackTrace();
		}
		Properties pro=new Properties();
		try 
		{
			pro.load(fis);
		}
		catch (IOException e) 
		{
			
			e.printStackTrace();
		}
		String value=pro.getProperty(key);
		
		
		return value;
	}

//  @Override
//     public String getExceldata(String path, int sheetno, int rowno, int colno) {
//	
//	 return null;
//}

//@Override
//public void expliciwait(WebElement element,int time)
//{
//	WebDriverWait wait=new WebDriverWait(driver, time);
//	wait.until(ExpectedConditions.visibilityOf(element));
//	
//}
	
	public void UploadfileUsingRobotClass(String path) throws InterruptedException
	{
		StringSelection selection = new StringSelection(path);
		Clipboard clip=Toolkit.getDefaultToolkit().getSystemClipboard();
		clip.setContents(selection, null);
		try
		{
			Robot robot=new Robot();
			robot.delay(250);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			robot.delay(250);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.delay(250);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			
		}
		catch (AWTException e) 
		{
			e.printStackTrace();
		}
		
	}
	
}
