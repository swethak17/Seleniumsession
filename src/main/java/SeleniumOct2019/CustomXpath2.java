package SeleniumOct2019;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CustomXpath2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://app.hubspot.com/login");
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement emailid = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginbtn = driver.findElement(By.id("loginBtn"));
		
		Actions action = new Actions(driver);
		action.sendKeys(emailid, "naveenanimation20@gmail.com").build().perform();
		action.sendKeys(password, "Test@12345").build().perform();
		action.click(loginbtn).build().perform();
		Thread.sleep(3000);
		
		driver.navigate().to("https://app.hubspot.com/contacts/6372460/contacts/list/view/all/? ");
		
		action.click(driver.findElement(By.xpath("//span[text()='naveen k']//ancestor::td//preceding-sibling::td//span[@class='private-checkbox__inner']"))).build().perform();		
		
		// Xpath Axis
		//div[@class='input-group']//following::input[@name='username']
		//div[@class='input-group']//following::input[1]
		////div[@class='input-group']//following::input
		
		
		//div[@class='input-group']//preceding::div
		//div[@class='input-group']//parent::div
		
		//div[@class='input-group']//child::input[@name='username']
		//div[@class='input-group']//ancestor::div[@class='container']
		
		//span[@text()='naveen k']//ancestor : : td//preceding-sibling : : td// input
		//span[@text()='naveen k']//ancestor : : td//preceding-sibling : : td//child :: input
		
		////span[text()='naveen k']//preceding::td//child::div//label[@class='private-checkbox__label']
		
		//(//span[text()='naveen k']//preceding::td//child::div//label[@class='private-checkbox__label'])[6]
		
		selectcontact(action,driver,"naveen k");
		selectcontact(action,driver,"syed irfan");
		
	}
	
	public static void selectcontact(Actions action,WebDriver driver,String contactname){
		action.click(driver.findElement(By.xpath("//span[text()='"+contactname+"']//ancestor::td//preceding-sibling::td//span[@class='private-checkbox__inner']"))).build().perform();		
		
	}

}
