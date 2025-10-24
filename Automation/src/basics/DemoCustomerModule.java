package basics;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class DemoCustomerModule extends BaseClass {
	@Test(invocationCount = 2)
	public void createCustomer() {
		Reporter.log("createCustomer", true);
	}

	@Test(priority = 0)
	public void deleteCustomer() {
		Reporter.log("deleteCustomer", true);
	}

	@Test(priority = -1, dependsOnMethods = "deleteCustomer")
	public void modifyCustomer() {
		Reporter.log("modifyCustomer", true);
	}
}
