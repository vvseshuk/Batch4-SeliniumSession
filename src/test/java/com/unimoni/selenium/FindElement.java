package com.unimoni.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
	
	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://learn.letskodeit.com/p/practice");
		WebElement signUpBtn = driver.findElement(By.id("header-sign-up-btn")); 
		//WebElement signUpAnchor = driver.findElement(By.linkText("Sign Up"));
		//WebElement signUpAnchor = driver.findElement(By.partialLinkText("Sign"));
		//signUpAnchor.click();
		signUpBtn.click();
		Thread.sleep(5000);
		driver.close();
	}

}
