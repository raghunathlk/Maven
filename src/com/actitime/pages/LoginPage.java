package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.actitime.generic.BasePage;

public class LoginPage extends BasePage
{
	@FindBy(id="username")
	private WebElement username;
	@FindBy(name="pwd")
	private WebElement password;
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginbutton;
	@FindBy(xpath="//nobr[contains(text(),'actiTIME')]")
	private WebElement version;
	
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	public void enterUsername(String un)
	{
		username.sendKeys(un);
	}
	public void enterpassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void clickLogin()
	{
		loginbutton.click();
	}
	 public void verifyPage(String etitle)
	 {
		 verifyTitle(etitle);
	 }
	 public void verifyVersion()
	 {
		 verifyElement(version);
		 Reporter.log("verion: "+version.getText(),true);
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
