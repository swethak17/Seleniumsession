package TestNGSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//Launch the Browser - BS
//Launch the URL- BT
//Login to  App - BC

//Go to Homepage - BM
//Homepage Header Test ---Test1
//Log out---AM

//Go to Homepage - BM 
//Homepage Link Test---TEst 2
//Log out---AM

//Go to Homepage --BM
//Home Page Title Test ---TEst3
//Log out--AM

//Goto Login Page --AC
//Disconnect with DB --AT

public class HomepageTest {
	//Launch the Browser - BS
	//Launch the URL - BT
	//Login to  App - BC
	
	//Go to Homepage --BM
	//Homepage Header Test ----Test1
	//Log out---AM
	
	//Go to Homepage ----BM
	//Home Page Title Test ---Test2
	//Log out----AM
	
	//Goto Login Page --- AC
	//Disconnect with DB----AT
	//Close the Browser -- AS
	
	//PASSED: HomepageHeaderTest
	//PASSED: HomepageTitleTest
	
	//Before - Test - After 
	
	@BeforeSuite
	public void launchbrowser(){
		System.out.println("Launch the Browser");
	}
	@BeforeTest
	public void launchURL(){
		System.out.println("Launch the URL");
	}
	@BeforeClass
	public void logintoApp(){
		System.out.println("Login to  App");
	}
	@BeforeMethod
	public void gotoHomepage(){
		System.out.println("Go to Homepage");
	}
	
	@Test
	public void HomepageTitleTest(){
		System.out.println("Home Page Title Test");
	}
	@Test
	public void HomepageHeaderTest(){
		System.out.println("Homepage Header Test");
	}

	@Test
	public void HomepageLinkTest(){
		System.out.println("Homepage Link Test");
	}
	@AfterMethod
	public void logout(){
		System.out.println("Log out");
	}
	
	@AfterClass
	public void goToLoginPage(){
		System.out.println("Goto Login Page");
	}
		
	@AfterTest
	public void disconnectwithDB(){
		System.out.println("Disconnect with DB");
		}
	@AfterSuite
	public void closeBrowser(){
		System.out.println("Close the Browser");
	}
	}

