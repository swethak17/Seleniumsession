package SeleniumOct2019;

import java.io.File;
import java.io.IOException;
import java.util.prefs.WindowsPreferences <init>
import io.github.bonigarcia.wdm.WebDriverManager;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotConcept {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://app.hubspot.com/login");
		
		Thread.sleep(5000);
		
		takePageScreenshot(driver,"loginPage");
		
		WebElement emailid = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginbutton = driver.findElement(By.id("loginBtn"));
		
		emailid.sendKeys("test@gmail.com");
		password.sendKeys("test123");
		loginbutton.click();
		
		
		takeElementScreenShot(emailid,"username");
		takeElementScreenShot(password,"password");
		takeElementScreenShot(loginbutton,"loginBtn");
		
		takePageScreenshot(driver,"loginPage error");
		
		driver.close();
		
	}
		        
        
        public static void takePageScreenshot(WebDriver driver , String Filename){
        	File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        	try {
        		FileUtils.copyFile(srcfile, new File("./target/screenshots/page.png"));
        	} catch (IOException e){
        		e.printStackTrace();
        	}
        	}
        	
        	public static void takeElementScreenShot(WebElement element , String Filename){
            	File srcfile = ((TakesScreenshot)element).getScreenshotAs(OutputType.FILE);
            	try {
            		FileUtils.copyFile(srcfile, new File("./target/screenshots/page.png"));
            	} catch (IOException e){
            		e.printStackTrace();
        	
        }
        
        	}
}
	


