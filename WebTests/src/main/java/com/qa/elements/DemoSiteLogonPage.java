package com.qa.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoSiteLogonPage {

	@FindBy(xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input")
	private WebElement userNameBox;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input")
	private WebElement passWordBox;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/p/input")
	private WebElement logonbutton;
	
	public void logOn(String userName, String passWord) throws InterruptedException
	{
		userNameBox.sendKeys(userName);
		passWordBox.sendKeys(passWord);
		logonbutton.click();
		
		
	}
}
