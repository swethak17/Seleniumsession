package SeleniumOct2019;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		Thread.sleep(5000);
		//1. ID - I - is unique
		//WebElement email = driver.findElement(By.id("username"));
	 //	email.sendKeys("swethagokul@gmail.com");
		
       // WebElement pwd  =   driver.findElement(By.id("password"));
        //pwd.sendKeys("Test@12345");
        
		//WebElement clicklog = driver.findElement(By.id("loginBtn"));
		//clicklog.click();
		
      //  driver.findElement(By.id("username")).sendKeys("test@gmail.com");
      //  driver.findElement(By.id("password")).sendKeys("pwd@123");
      //  driver.findElement(By.id("loginBtn")).click();
        
        //2.name - II - 99% unique - only if ID not available can use name
        
       // driver.findElement(By.name("email")).sendKeys("test@gmail.com");
        
        //3.xpath - III - dynamic ids
        
       // driver.findElement(By.xpath("//*[@id='username']")).sendKeys("test@gmail.com");
        //driver.findElement(By.xpath("//*[@id='password']")).sendKeys("password@123");
		
		//4.Css - III
		
	//	driver.findElement(By.cssSelector("#username")).sendKeys("test@gmail.com");
	//	driver.findElement(By.cssSelector("#password")).sendKeys("password@123");
		
		//5.Class name - Least preference - not unique always - so last preference
		
		driver.findElement(By.className("login-email")).sendKeys("test@gmail.com");
		driver.findElement(By.className("login-password")).sendKeys("password@123");
		
		//6. link text - only used for links
		
		driver.findElement(By.linkText("Sign up")).click();
		//7. Partial link text
		
		driver.findElement(By.partialLinkText("sign")).click();
		
		
		
	}

}
