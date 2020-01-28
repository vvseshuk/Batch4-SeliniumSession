package com.unimoni.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitAndExplicit {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.tagName("button")).click();
		WebDriverWait wait = new WebDriverWait(driver, 150);
		WebElement dynamicText = driver.findElement(By.id("demo"));
		wait.until(ExpectedConditions.textToBePresentInElement(dynamicText, "WebDriver"));
		System.out.println("The dynamic text:" + dynamicText.getText());
		driver.close();
	}

}
