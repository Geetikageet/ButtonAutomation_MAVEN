package com.ButtonsAutomate.Maven;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CTAButtonsTesting {
	public WebDriver driver;
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver" ,"/Users/geetika/Desktop/Automation/MAC/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://campaign.odicci.com/#/cd1a4eafee78e5f4b882");
		driver.findElement(By.id("427")).click();
		driver.findElement(By.id("427")).sendKeys("abc@abc.com");
		driver.findElement(By.id("1146")).click();
		driver.findElement(By.cssSelector("#element-62864 > div > div > a")).click();
		//driver.findElement(By.xpath("(//div[@class='button_element'])")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	
	}

}
