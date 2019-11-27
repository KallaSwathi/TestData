package com.techouts.fanniemae.testcases;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.techouts.fanniemae.consts.FanniemaeConstants;
import com.techouts.fanniemae.test.AbstractTest;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;

public class NewSupplierReg extends AbstractTest
{
	private static final Logger LOG=Logger.getLogger(NewSupplierReg.class.getName());
	private int corporate = FanniemaeConstants.C;
	private int supplierType = FanniemaeConstants.D;
	private int federalTax = FanniemaeConstants.E;
	private int lastName = FanniemaeConstants.F;
	private int firstName = FanniemaeConstants.G;
	private int title = FanniemaeConstants.H;
	private int email = FanniemaeConstants.I;
	private int password = FanniemaeConstants.J;
	private int confirmPassword = FanniemaeConstants.L;
	private int phoneNumber = FanniemaeConstants.M;
	private int address1 = FanniemaeConstants.N;
	private int city = FanniemaeConstants.O;
	private int state = FanniemaeConstants.P;
	private int country = FanniemaeConstants.Q;
	private int zip = FanniemaeConstants.R;
	@Test
	public void supplier()
	{
		String testCaseName="NewSupplierReg";
		String serialNo="1";
		
		getFannieMaePage();
	WebElementOperations.click(getDriver(), getWebElementFactory().getNewSupplier());
	WebElementOperations.waitForPageLoad(getDriver(), 15);
	WebElementOperations.sendKeys(getDriver(), getWebElementFactory().getCorporateName(),REPOSITORY.getCellDataOnTestCase(serialNo, corporate, DEFAULT_SHEET_NAME));
	WebElementOperations.park(2);
	
	WebElementOperations.dropDownByTextVisibility(getDriver(), getWebElementFactory().getSupplierType(), REPOSITORY.getCellDataOnTestCase(serialNo, supplierType,DEFAULT_SHEET_NAME));
	WebElementOperations.sendKeys(getDriver(), getWebElementFactory().getFederal(),REPOSITORY.getCellDataOnTestCase(serialNo, federalTax, DEFAULT_SHEET_NAME));
	WebElementOperations.sendKeys(getDriver(), getWebElementFactory().getLastName(),REPOSITORY.getCellDataOnTestCase(serialNo, lastName, DEFAULT_SHEET_NAME));
	
	WebElementOperations.sendKeys(getDriver(), getWebElementFactory().getFirstName(),REPOSITORY.getCellDataOnTestCase(serialNo, firstName, DEFAULT_SHEET_NAME));
	WebElementOperations.park(2);
	WebElementOperations.dropDownByTextVisibility(getDriver(), getWebElementFactory().getTitle(),REPOSITORY.getCellDataOnTestCase(serialNo, title, DEFAULT_SHEET_NAME));
	WebElementOperations.park(2);
	WebElementOperations.sendKeys(getDriver(), getWebElementFactory().getEmail(),REPOSITORY.getCellDataOnTestCase(serialNo, email, DEFAULT_SHEET_NAME));
	WebElementOperations.park(2);
	WebElementOperations.sendKeys(getDriver(), getWebElementFactory().getPassword(),REPOSITORY.getCellDataOnTestCase(serialNo, password, DEFAULT_SHEET_NAME));
	WebElementOperations.park(2);
	WebElementOperations.sendKeys(getDriver(), getWebElementFactory().getConfirmPassword(),REPOSITORY.getCellDataOnTestCase(serialNo, confirmPassword, DEFAULT_SHEET_NAME));
	WebElementOperations.park(2);
	WebElementOperations.sendKeys(getDriver(), getWebElementFactory().getPhoneNumber(),REPOSITORY.getCellDataOnTestCase(serialNo, phoneNumber, DEFAULT_SHEET_NAME));
	WebElementOperations.park(2);
	WebElementOperations.sendKeys(getDriver(), getWebElementFactory().getAddress(), REPOSITORY.getCellDataOnTestCase(serialNo, address1, DEFAULT_SHEET_NAME));
	WebElementOperations.park(2);
	WebElementOperations.sendKeys(getDriver(), getWebElementFactory().getCity(),REPOSITORY.getCellDataOnTestCase(serialNo, city,DEFAULT_SHEET_NAME ));
	WebElementOperations.park(2);
	WebElementOperations.dropDownByTextVisibility(getDriver(), getWebElementFactory().getState(),REPOSITORY.getCellDataOnTestCase(serialNo, state, DEFAULT_SHEET_NAME));
	WebElementOperations.park(2);
	WebElementOperations.sendKeys(getDriver(), getWebElementFactory().getZipCode(),REPOSITORY.getCellDataOnTestCase(serialNo, zip, DEFAULT_SHEET_NAME));
	WebElementOperations.park(2);
	WebElementOperations.dropDownByTextVisibility(getDriver(), getWebElementFactory().getCountry(),REPOSITORY.getCellDataOnTestCase(serialNo, country, DEFAULT_SHEET_NAME));
	WebElementOperations.park(2);
	}
	}


