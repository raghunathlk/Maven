package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.actitime.generic.BasePage;

public class EnterTimeTrackPage extends BasePage
{
	@FindBy(id="logoutLink")
	private WebElement Logout;
	@FindBy(xpath="//div[@class='popup_menu_button popup_menu_button_support']")
	private WebElement Help;
	@FindBy(xpath="//a[.='About your actiTIME']")
	private WebElement AboutYouractitime;
	@FindBy(xpath="//span[.='(build 40469)']")
	private WebElement BuildNumber;
	
	
	

	public EnterTimeTrackPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void Logout() 
	{
		Logout.click();
	}
	public void ClickonHelp() 
	{
		Help.click();
	}
	public void ClickOnAboutYouractitime() 
	{
		AboutYouractitime.click();
	}
	public void VerifyBuildNumber()
	{
		verifyElement(BuildNumber);
	Reporter.log("product vorsion"+BuildNumber.getText(),true);
		
	}
	

}
