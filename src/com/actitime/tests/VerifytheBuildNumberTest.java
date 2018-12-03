package com.actitime.tests;

import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;
import com.actitime.generic.ExcelData;
import com.actitime.pages.EnterTimeTrackPage;
import com.actitime.pages.LoginPage;

public class VerifytheBuildNumberTest  extends BaseTest
{
	@Test(priority=3)
	public void testverifyBuildid() 
	{
		String user=ExcelData.getData("./data/input.xlsx", "Sheet1", 1, 0);
		String pass=ExcelData.getData("./data/input.xlsx", "Sheet1", 1, 1);
		String LoginTitile=ExcelData.getData("./data/input.xlsx", "Sheet1", 1, 2);
		String EntertimeTrack=ExcelData.getData("./data/input.xlsx", "Sheet1", 1, 3);
		LoginPage lp=new LoginPage(driver);
		EnterTimeTrackPage ep=new EnterTimeTrackPage(driver);
		lp.verifyTitle(LoginTitile);
		lp.enterUsername(user);
	    lp.enterpassword(pass);
	    lp.clickLogin();
	    lp.verifyTitle(EntertimeTrack);
	    ep.ClickonHelp();
	    ep.ClickOnAboutYouractitime();
	    ep.VerifyBuildNumber();
	    
	    
	    
	}
}
