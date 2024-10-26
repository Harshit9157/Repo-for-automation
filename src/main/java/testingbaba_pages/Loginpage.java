package testingbaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class Loginpage extends Baselibrary
{
  
	public Loginpage()
	{
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//*[@id=\"myModal2\"]/div/div/div[1]/button")
	private WebElement closebtn;
	
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a")
	private WebElement practicebtn;
	
	@FindBy(xpath="//button[@class=\"btn btn-block p-0 text-left\"]")
	private WebElement elementsbtn;
	
	@FindBy(xpath="//*[@id=\"v-pills-tab\"]/a[2]")
	private WebElement Checkboxbtn;
//	@FindBy(xpath = "//*[@id=\"v-pills-tab\"]/a[3]")
//	private WebElement Ratiobtn;
	
//	@FindBy(xpath = "//input[@id=\"yes\" ]")
//	private WebElement Yesbtn;
//	
//	@FindBy(xpath = "//*[@id=\"v-pills-tab\"]/a[4]")
//	private WebElement Webtable;
	
	@FindBy(xpath="//button[@data-target=\"#alerts\"]")
	private WebElement Alertsbtn;
	@FindBy(xpath="//a[text()=\"browser windows\"]")
	private WebElement Browserwindow;
	
	@FindBy(xpath="//a[@href=\"#tab_12\"]")
	private WebElement Alerts;
//	
//	@FindBy(xpath="//button[@onclick=\"myalert()\"]")
//	private WebElement Clickbtn;
	
//	@FindBy(xpath="//button[@class=\"btn btn-primary\" and @onclick=\"myconfirm()\"]")
//	private WebElement Confirmbox;
//	
	@FindBy(xpath="//button[@class=\"btn btn-primary\" and @onclick=\"myprompt()\"]")
	private WebElement Promtbtn;
	
	
	public void getTitle_testingbaba() 
	{
           String title	=driver.getTitle();
           System.out.println("title is " + title);
           
	}
	public void clickonclosebtn() 
	{
//		expliciwait(closebtn, 10);
		System.out.println("closebtn is visible");
		closebtn.click();
	}
	public void clickonpracticebtn() 
	{
		practicebtn.click();
	}
	public void clickonElements() 
	{
		elementsbtn.click();
	}
	
//	public void clickonCheckboxbtn() 
//	{
//		Checkboxbtn.click();
//	}
//	public void clickonRatiobtn() 
//	{
//		Ratiobtn.click();
//	}
//	
//	public void clickonYesbtn() 
//	{
//		Yesbtn.click();
//	}
//	public void clickonWebtable() 
//	{
//		Webtable.click();
//	}
//	
	public void clickonAlertsbtn() 
	{
		Alertsbtn.click();
	}
	public void clickonBrowserwindow() 
	{
		Browserwindow.click();
	}
	public void clickonAlerts() 
	{
		Alerts.click();
	}
//	public void clickonClickbtn() 
//	{
//		Clickbtn.click();
//	}

//public void clickonConfirmbox() 
//{
//	Confirmbox.click();
//}
//	public void clickonPromtbtn() 
//	{
//		Promtbtn.click();
//	}
}
