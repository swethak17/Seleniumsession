package TestNGSessions;

import org.testng.annotations.Test;

public class InvocationCountConcept {
	@Test(invocationCount = 10 )
	public void loginTest(){
		System.out.println("Login Test");
	    
	}
}
