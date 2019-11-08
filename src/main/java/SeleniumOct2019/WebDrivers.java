package SeleniumOct2019;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDrivers {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" ,"C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//1. Open the Browser
		driver.get("http://google.com");//2. enter the URL
		
		String title = driver.getTitle();//3.get the page title
        System.out.println(title);  
        
        //4.Validation point:
        if (title.equals("Google")){
        	System.out.println("Correct title");
        }else{
        	System.out.println("In-Correct title");
        }
        System.out.println(driver.getCurrentUrl());
     //   System.out.println(driver.getPageSource());
        
        driver.quit();//close the browser
        
        
        
        driver.close();// Invalid Session id
        
        System.out.println(driver.getTitle());
	}

}
