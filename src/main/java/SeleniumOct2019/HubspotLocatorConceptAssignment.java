package SeleniumOct2019;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HubspotLocatorConceptAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		
		//Link text
		driver.findElement(By.linkText("Sign up")).click();
		// partial link text
		//driver.findElement(By.partialLinkText("Sign")).click();
		
		//By ID
		//WebElement fname = driver.findElement(By.id("firstName" ));
		//fname.sendKeys("Swetha");
			
	//    WebElement Lname  =   driver.findElement(By.id("lastName"));
	  //  Lname.sendKeys("Kalyan");
	        
	  //  WebElement email = driver.findElement(By.id("email"));
	 //   email.sendKeys("swethagokul123@gmail.com");
	    
	 //   WebElement submit = driver.findElement(By.id("submitStep"));
	 //   submit.click();
		
	   driver.findElement(By.id("firstName-6")).sendKeys("Swetha");
	   driver.findElement(By.id("lastName-7")).sendKeys("Kalyan");
	   driver.findElement(By.id("email-9")).sendKeys("swetha@gmail.com");
	   driver.findElement(By.id("signup")).click();
		
		//By Xpath
		
	//	driver.findElement(By.xpath("//*[@id='uid-firstName-6']")).sendKeys("Swetha");
	//	driver.findElement(By.xpath("//*[@id='uid-lastName-7']")).sendKeys("Lakshmi");
	//	driver.findElement(By.xpath("//*[@id='uid-email-9']")).sendKeys("Swethagokul@gmail.com");
	//	driver.findElement(By.xpath("//*[@id='signup-app']")).click();
		
		//By Css
		
	//	driver.findElement(By.cssSelector("#uid-firstName-6")).sendKeys("Swetha");
	//	driver.findElement(By.cssSelector("#uid-lastName-7")).sendKeys("Lakshmi");
	//	driver.findElement(By.cssSelector("#uid-email-9")).sendKeys("Swethagokul@gmail.com");
	//	driver.findElement(By.cssSelector("#signup-app")).click();
		
		//BY class name
		
	//	driver.findElement(By.className("uid-firstName-6")).sendKeys("Swetha");
	//	driver.findElement(By.className("uid-lastName-7")).sendKeys("Lakshmi");
	//	driver.findElement(By.className("uid-email-9")).sendKeys("Swethagokul@gmail.com");
    //	driver.findElement(By.className("signup-app")).click();
		
		
	}

}
