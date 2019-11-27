package com.techouts.fanniemae.testcases;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.techouts.fanniemae.consts.FanniemaeConstants;
import com.techouts.fanniemae.test.AbstractTest;
import com.techouts.fanniemae.util.Assert;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;

public class SupplierRegister extends AbstractTest
{
	private static final Logger LOG = Logger.getLogger(CreateRequisitionsTest.class.getName());
	private int userName = FanniemaeConstants.G;
	private int password = FanniemaeConstants.H;
	private int landingPageTitle=FanniemaeConstants.K;
@Test
public void Supplier()
{
	String testCaseName="SupplierRegistration";
	String serialNo="1";
	getFannieMaePage();
	Assert.assertTrue(WebElementOperations.verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(serialNo,landingPageTitle, DEFAULT_SHEET_NAME))); 
	  WebElementOperations.captureScreenShotOnPass(getDriver(), testCaseName);
	  HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(serialNo, userName, DEFAULT_SHEET_NAME),REPOSITORY.getCellDataOnTestCase(serialNo, password, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, FanniemaeConstants.L, DEFAULT_SHEET_NAME)); 
}
}
