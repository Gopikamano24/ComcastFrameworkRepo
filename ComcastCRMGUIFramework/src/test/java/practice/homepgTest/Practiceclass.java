package practice.homepgTest;

import org.testng.annotations.Test;

public class Practiceclass {
	@Test(retryAnalyzer=com.comcast.crm.listenerutility.RetryListenerImp.class)
	public void activateSimTest() {
		System.out.println("execute createInvoicewithContactTest");
		//Assert.assertEquals(" ", "Login");
		System.out.println("step1");
		System.out.println("step2");
		System.out.println("step3");
		System.out.println("step4");
	}
}
