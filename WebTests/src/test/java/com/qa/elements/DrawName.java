package com.qa.elements;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DrawName {
	
	public WebDriver driver = null;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void draw() throws InterruptedException {
		driver.get("https://www.youidraw.com/apps/painter/");
		
		Actions drawAction = new Actions(driver);
		
		// canvas left: 0px top: 122px
		
		// V
		drawAction
			.moveByOffset(100, 200)
			.clickAndHold()
			.moveByOffset(50, 100)
			.moveByOffset(50, -100)
		.release().perform();
		
		// i
		drawAction
			.moveByOffset(50, 100)
			.clickAndHold()
			.moveByOffset(0, -100)
			.release()
			.moveByOffset(0, -5)
			.click()
		.perform();
		
		// n
		drawAction
			.moveByOffset(50, 105)
			.clickAndHold()
			.moveByOffset(0, -105)
			.moveByOffset(0, 5)
			.moveByOffset(25, -5)
			.moveByOffset(25, 5)
			.moveByOffset(0, 100)
		.release().perform();
		
		// n
		drawAction
			.moveByOffset(50, 105)
			.clickAndHold()
			.moveByOffset(0, -105)
			.moveByOffset(0, 5)
			.moveByOffset(25, -5)
			.moveByOffset(25, 5)
			.moveByOffset(0, 100)
		.release().perform();
		
		// i
		drawAction
			.moveByOffset(50, 100)
			.clickAndHold()
			.moveByOffset(0, -100)
			.release()
			.moveByOffset(0, -5)
			.click()
		.perform();
		
	}

}
