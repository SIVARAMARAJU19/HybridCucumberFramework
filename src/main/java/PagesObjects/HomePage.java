package PagesObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {


	public WebDriver driver; 
	 
	public HomePage(WebDriver driver) { 
	 
	this.driver = driver; 
	PageFactory.initElements(driver, this); 
	 
	}
	
	@FindBy(xpath="(//a[contains(text(),'Sign In')])[1]")
	WebElement signinoption;
	
	public WebElement signinoption() {
		
		return signinoption;
	}
	
	@FindBy(xpath="(//a[contains(text(),'Create an Account')])[1]")
	WebElement createaccountoption;
	
	public WebElement createaccountoption() {
		
		return createaccountoption;
	}

	@FindBy(xpath="//input[@id='search']")
	WebElement searchfield;
	
	public WebElement searchfield() {
		
		return searchfield;
	}
	
	@FindBy(xpath="//button[@class='action search']")
	WebElement searchbutton;
	
	public WebElement searchbutton() {
		
		return searchbutton;
	}
	
	@FindBy(xpath="//a[@class='product-item-link']")
	WebElement validproductresult;
	
	public WebElement validproductresult() {
		
		return validproductresult;
	}
	
	@FindBy(xpath="//div[@class='message notice']/div")
	WebElement invalidproductresult;
	
	public WebElement invalidproductresult() {
		
		return invalidproductresult;
	}
	
}
