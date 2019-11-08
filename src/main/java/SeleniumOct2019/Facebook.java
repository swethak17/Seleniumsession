package SeleniumOct2019;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//1.open the browser
		driver.get("http://facebook.com");//2.enter URL
		
		String title = driver.getTitle();//3.get title
		System.out.println(title);
		
		//4.Validation 
		
		if (title.equals("Facebook - Log In or Sign Up")){
			System.out.println("Correct title");
		}else
			{System.out.println("In-Correct title");
			}
		
		System.out.println(driver.getCurrentUrl());
		driver.close();
		}
	}


