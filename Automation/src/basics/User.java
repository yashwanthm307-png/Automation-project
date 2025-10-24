package basics;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class User {
//	@Test(priority = 3,invocationCount = 3)
	@Test
public void createUser() {
//		Assert.fail();
	Reporter.log("createUser",true);
}
//	@Test(timeOut = 5000,priority = 1,dependsOnMethods = "createUser")
	@Test
	public void modifyUser() {
	Reporter.log("modifyUser",true);
}
//	@Test(enabled=false,priority = 2,dependsOnMethods = {"createUser","modifyUser"})
	@Test
	public void deleteUser() {
	Reporter.log("deleteUser",true);
}
}
