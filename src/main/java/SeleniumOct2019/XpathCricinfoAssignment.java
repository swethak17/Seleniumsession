package SeleniumOct2019;

import java.util.List;
import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class XpathCricinfoAssignment {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://espncricinfo.com/series/19430/scorecard/1187009/india-vs-south-africa-3rd-test-icc-world-test-championship-2019-2021");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		List <WebElement> PlayersList = 
		driver.findElements(By.xpath("//div[@class='cell batsmen']//a[@name='&lpos=cricket:game:scorecard:player']"));		
	    
		System.out.println(PlayersList.size());
		
		for (int i = 0; i<PlayersList.size();i++){
			System.out.println();
			getPlayersList(driver,PlayersList.get(i).getText());
		
			}
	}
		public static void getPlayersList(WebDriver driver,String PlayerName)
		{ List<WebElement> PlayerScoreinfo = 
			driver.findElements(By.xpath("//a[contains(text(),'"+PlayerName+"')]//parent::div//following-sibling::div[@class='cell runs']"));
		
			if (PlayerName.length() <= 8){
				System.out.print(PlayerName + "\t" + "\t" );
			}else {
				System.out.println(PlayerName + "\t");
			}
			for (int s=0; s<PlayerScoreinfo.size();s++){
				System.out.println(PlayerScoreinfo.get(s).getText()+ "\t");
			}
			
			
			
			
		}
		
		
	

	
	}

	private static void getPlayersList(WebDriver driver, String text) {
		// TODO Auto-generated method stub
		
	}

	
}
