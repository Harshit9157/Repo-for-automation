package testingbaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class Practice_testbox extends Baselibrary
{
 
	public Practice_testbox() 
	{
		PageFactory.initElements(driver, this);

	}
	
	
	@FindBy(xpath="//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")
	private WebElement elements;
	@FindBy(xpath="//*[@id=\"v-pills-tab\"]/a[1]")
	private WebElement textbox;
	@FindBy(xpath="//*[@id=\"fullname1\"]")
	private WebElement fullnamebox;
	@FindBy(xpath="//*[@id=\"fullemail1\"]")
	private WebElement email;
	@FindBy(xpath="//*[@id=\"fulladdresh1\"]")
	private WebElement permanentadress;
	@FindBy(xpath="//*[@id=\"paddresh1\"]")
	private WebElement currentaddress;
	
	
	public void clickonelements() 
	{
		elements.click();
	}
	public void clickontextbox() 
	{
		textbox.click();
	}
	
	
	
	public void entervalueFullName(String fullname)
	{
		fullnamebox.clear();
		fullnamebox.sendKeys(fullname);
	}

}
