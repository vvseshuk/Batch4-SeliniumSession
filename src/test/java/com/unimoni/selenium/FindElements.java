package com.unimoni.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://learn.letskodeit.com/p/practice");
		List<WebElement> trs = driver.findElements(By.tagName("tr"));
		System.out.println("size:" + trs.size());
		for(WebElement tr : trs) {
			System.out.println("tr:" + tr.getText());
		}
	}

}
