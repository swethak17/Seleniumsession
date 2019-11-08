package TestNGSessions;

import org.testng.annotations.Test;

public class TestPriority {
	
	@Test(priority=1)
	public void HomepageTitleTest(){
		System.out.println("Home Page Title Test");
	}
	@Test(priority=2)
	public void HomepageHeaderTest(){
		System.out.println("Homepage Header Test");
	}

	@Test
	public void HomepageLinkTest(){
		System.out.println("Homepage Link Test");
	}
	
	@Test
	public void HomepageUserTest(){
		System.out.println("Homepage User Test");
	}
	

}
