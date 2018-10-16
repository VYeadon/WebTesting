package com.qa.elements;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class FindingElements {
	public WebDriver driver = null;
	
	String userName = "nameBrash";
	String passWord = "nameBrahh";
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	/*
	@Test
	public void searchText() throws InterruptedException, IOException {
		driver.get("http://thedemosite.co.uk/");
		
		DemoSiteLogin mainPage = PageFactory.initElements(driver, DemoSiteLogin.class);
		
		DemoSiteLogonPage logonPage = PageFactory.initElements(driver, DemoSiteLogonPage.class);
		
		mainPage.getToLoginPage();
		
		WebElement textCheck = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[1]/p/font/small"));
				
		assertEquals("Username:", textCheck.getText());	
	}
	*/
	
	@Test
	public void login() throws InterruptedException {
		driver.get("http://thedemosite.co.uk/addauser.php");
		
		DemoSiteLogin mainPage = PageFactory.initElements(driver, DemoSiteLogin.class);
		
		DemoSiteLogonPage logonPage = PageFactory.initElements(driver, DemoSiteLogonPage.class);
		
		WebElement username = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input"));
		username.sendKeys(userName);
		
		WebElement password = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input"));
		password.sendKeys(passWord);
		
		WebElement enterButton = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input"));
		enterButton.click();
		
		mainPage.getToLoginPage();
		
		logonPage.logOn(userName, passWord);
		
		WebElement textCheck = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b"));
		assertEquals("**Successful Login**", textCheck.getText());
		
		
	}

	@After
	public void tearDown() {
		driver.quit();
	}
}
