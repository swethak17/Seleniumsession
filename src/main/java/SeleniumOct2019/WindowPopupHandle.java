package SeleniumOct2019;

import java.util.Iterator;
import java.util.Set;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopupHandle {

	public static void main(String[] args) {
		
		    WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://www.popuptest.com/goodpopups.html");
			driver.findElement(By.linkText("Good PopUp #3")).click();
	
	        Set <String> handles = driver.getWindowHandles();
	        
	        Iterator<String> it = handles.iterator();
	        String ParentwindowID = it.next();
	        System.out.println("Parent window ID is :    "+ ParentwindowID);
	
	        String childWindowID = it.next();
	        System.out.println("Child Window ID is :   "+ childWindowID);
	        
	        driver.switchTo().window(childWindowID);
	        System.out.println(driver.getTitle());
	        driver.close();
	        
	        driver.switchTo().window(ParentwindowID);
	        
	        System.out.println("Parent window Id is  "+ParentwindowID);
	        
	        driver.close();
	        
	
	
	}

}
