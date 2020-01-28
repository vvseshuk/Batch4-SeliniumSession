package com.unimoni.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementFunctions {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://learn.letskodeit.com/p/practice");
		WebElement hideButton = driver.findElement(By.id("hide-textbox"));
		hideButton.click();
		WebElement hiddenText = driver.findElement(By.id("displayed-text"));
		if (hiddenText.isDisplayed()) {
			hiddenText.sendKeys("Hi");
		} else {
			driver.findElement(By.id("show-textbox")).click();
			hiddenText.sendKeys("Hi");
		}
		Thread.sleep(5000);
		driver.close();
	}

}
