package com.qa.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoSiteLogin {
	
	@FindBy(xpath = "/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]")
	private WebElement loginButton;
	
	public void getToLoginPage() throws InterruptedException {
		loginButton.click();
	}
	
}
