package testingbaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class Checkbox_pages extends Baselibrary
{
     public Checkbox_pages()
     {
    	 PageFactory.initElements(driver, this);
    	 
     }
     @FindBy(xpath="//*[@id=\"v-pills-tab\"]/a[2]")
     public WebElement checkboxbtn;
     
     @FindBy(xpath="//*[@id=\"myCheck\"]")
     public WebElement mobilebtn;
     
     @FindBy(xpath="//*[@id=\"mylaptop\"]")
     public WebElement laptopbtn;
     
     @FindBy(xpath="//*[@id=\"mydesktop\"]")
     public WebElement desktopbtn;
     
     public void clickoncheckboxbtn() 
     {
    	 checkboxbtn.click();
     }
     public void selectmobilebtn()
     {
    	 mobilebtn.click();
     }
     
     public void selectlaptopbtn()
     {
    	 laptopbtn.click();
     }
     public void selectdesktopbtn() 
     {
    	 desktopbtn.click();
     }
   
}
