package com.unimoni.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.switchTo().frame("courses-iframe");
		WebElement findCourse = driver.findElement(By.name("query"));
		findCourse.sendKeys("Hi");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("header-sign-up-btn")).click();
		Thread.sleep(3000);
		driver.quit();		
	}

}
