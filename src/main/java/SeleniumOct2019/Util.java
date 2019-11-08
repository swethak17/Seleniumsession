package SeleniumOct2019;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Util {

	WebDriver driver;
	
	public Util(WebDriver driver){
		this.driver = driver;
	}
	
	public WebElement getElement(By locator){
		WebElement Element = null;
		try {
	     Element = driver.findElement(locator);
		}
		catch (Exception e){
			System.out.println("Some Exception occured while creating the WebElement");
			System.out.println(e.getMessage());
		}
		return Element;
	}
	// This method is used to click on the WebElement
	
	public void doClick(By locator){
		try {
		getElement(locator).click();
	}
		catch (Exception e){
			System.out.println("Some Exception occured while clicking on the WebElement");
			System.out.println(e.getMessage());
		}
	}
	
	//This mehtod is used to pass values on the web Element
	public void doSendkeys(By locator, String value){
		try{
		getElement(locator).sendKeys(value);
	}catch (Exception e){
		System.out.println("Some Exception occured while doSendkeys on the WebElement");
		System.out.println(e.getMessage());
	}
}}
