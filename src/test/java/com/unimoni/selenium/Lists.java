package com.unimoni.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Lists {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://learn.letskodeit.com/p/practice");
		Select carModel = new Select(driver.findElement(By.id("carselect")));
		//carModel.selectByIndex(1);
		//carModel.selectByVisibleText("Honda");
		carModel.selectByValue("benz");
		Select multiCarModel = new Select(driver.findElement(By.id("multiple-select-example")));
		if (multiCarModel.isMultiple()) {
			multiCarModel.selectByVisibleText("Orange");
			multiCarModel.selectByVisibleText("Peach");
		}
		Thread.sleep(5000);
		multiCarModel.deselectByIndex(1);
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
