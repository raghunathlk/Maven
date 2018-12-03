package com.actitime.generic;

import static org.testng.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage 
{
	 public WebDriver driver;

	public BasePage(WebDriver driver) 
	{
		this.driver = driver;
	}
	 public void verifyTitle(String etitle)
	 {
		 WebDriverWait wait=new WebDriverWait(driver, 10);
		 try 
		 {
			 wait.until(ExpectedConditions.titleIs(etitle));
			Reporter.log("Title is matching: "+etitle,true);
			
		}
		 catch (Exception e) 
		 {
			 Reporter.log("Title is  not matching: "+etitle,true);
			 Assert.fail();
		}
		  
	 }
	 
	 public void verifyElement(WebElement element) 
	 { WebDriverWait wait=new WebDriverWait(driver, 10);
	 try 
	 {
		 wait.until(ExpectedConditions.visibilityOf(element));
		Reporter.log("Element is precent: "+element,true);
		
	}
	 catch (Exception e) 
	 {
		 Reporter.log("Element is  not precent: "+element,true);
		 Assert.fail();
	}
	  
		 
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

}
