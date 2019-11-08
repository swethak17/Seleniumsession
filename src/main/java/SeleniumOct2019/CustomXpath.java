package SeleniumOct2019;

import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CustomXpath {

	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://app.hubspot.com/login");
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//htmltag[@prop1='value'] - xpath with 1 property
		//input[@id='username']
		
		//htmltag[@prop1='value' and prop2='value'] - xpath with 2 properties
		//input[@id='username' and @type='email']
		
		//input[@class='form-control private-form__control login-email'] - xpath with class attribute
		
		//contains() in xpath
		//htmltag[contains(@prop,'value')]
		////input[contains(@class,'login-email')]
		//input[contains(@id,'username')]
		
		//input[@id='username' and contains(@class,'login-email')]
		//input[@id='username' and contains(@class, ' ')]
		
		//contains used for dynamic ids
		//input id='test_233'
		//input id ='test_235'
		//input id = 'test 236'
		
		//input[contains(@id,'test_')]
		////i18n-string[contains(@data-key,'forgotPassword')]
		
		//index - xpath
		//(//input[contains(@class,'form-control')])[1]
		
		//xpath - position
		//(//input[contains(@class,'form-control')])[position()=1]
		
		// last () - xpath
		//(//input[contains(@class,'form-control')])[last()]
		// (//i18n-string)[1]
			
		
		//text() in xpath
		// htmltag[text()='value']
		// //i18ln-string[text()='forgotPassword']
		////span[text()='Show Password']
		////span[contains(text(),'Show Password')]
		//span[contains(text(),'Show')]
		////span[contains(text(),'Password')]
		//i18n-string[text()="Don't have an account?"]
		
		//h1[@class='private-page__title']
		//h1[text()='Sales Dashboard']
		////h1[starts-with(text(),'Sales')]
		
		//*[@id='username'] - * elements in the webpage
		//input[@id='username']
		
		//span[text()='Greetel']
		//account name
		//span[starts-with(@class,'account')]
		//span [starts-with(text(),'Greetel')]
		//h1[starts-with(text(),'Sales')]
		
		
		// //div/input - direct child
		//div parent and input is direct child - represented by single fwd slash
		
		// //div//input - direct + indirect child - div is parent and input is indirect child - represented by double fwd slash
		
		WebElement emailid = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginbtn = driver.findElement(By.id("loginBtn"));
		
		Actions action = new Actions(driver);
		action.sendKeys(emailid, "naveenanimation20@gmail.com").build().perform();
		action.sendKeys(password, "Test@12345").build().perform();
		action.click(loginbtn).build().perform();
		Thread.sleep(4000);
				
		String headervalue = driver.findElement(By.xpath("//h1[@class='private-page__title']")).getText();
		System.out.println(headervalue);
		Thread.sleep(4000);
		
		System.out.println(driver.findElement(By.xpath("//h1[text()='Sales Dashboard']")).isDisplayed());
		
		
		

	}

}
