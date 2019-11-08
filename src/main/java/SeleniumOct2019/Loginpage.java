package SeleniumOct2019;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.prefs.Preferences;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpage {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("aap.hubspot.com/login");
		Thread.sleep(5000);
		
		By emailid = By.id("username");
		By password = By.id("password");
		By loginbutton = By.id("loginBtn");
		
		
		Util util = new Util(driver);
		
		util.doSendkeys(emailid ,"test@gmail.com");
		util.doSendkeys(password,"test@123");
		util.doClick(loginbutton);
		

	}

}
