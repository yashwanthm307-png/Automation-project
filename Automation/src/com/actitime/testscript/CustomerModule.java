package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass{
	@Test(groups = "SmokeTest")
public void createCustomer() {
	Reporter.log("createCustomer",true);
}
	@Test(groups = "RegressionTest",dependsOnMethods = "createCustomer")
public void deleteCustomer() {
	Reporter.log("deleteCustomer",true);
}
	@Test(groups = "RegressionTest")
public void modifyCustomer() {
	Reporter.log("modifyCustomer",true);
}
}
