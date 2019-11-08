package TestNGSessions;

import org.testng.annotations.Test;

public class DependsOnMethods {

	@Test
	public void loginTest(){
		System.out.println("Login Test");
	    int i = 9/0;
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void HomePageTest(){
		System.out.println("Home Page Test");
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void contactsPageTest(){
		System.out.println("Contacts Page Test");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
