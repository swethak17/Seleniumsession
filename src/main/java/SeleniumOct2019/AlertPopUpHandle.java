package SeleniumOct2019;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");//Click on the GO button
		
		driver.findElement(By.name("proceed")).click();//by name
		
		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();
		
		String text = alert.getText();
		System.out.println(text);
		
		if (text.equals("please enter a valid username")){
			System.out.println("Correct error Message");}
			else
			{
				System.out.println("In Correct error Message");
			}
			alert.accept();
			
			//alert.dismiss();
		
		}
		
		
	}


