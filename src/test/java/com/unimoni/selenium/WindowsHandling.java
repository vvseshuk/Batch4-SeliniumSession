package com.unimoni.selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		// openwindow
		System.setProperty("webdriver.chrome.driver", "C:\\browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		String homeWindow = driver.getWindowHandle();
		driver.findElement(By.id("openwindow")).click();
		Set<String> allWindows = driver.getWindowHandles();
		
		for (String currentWindow : allWindows) {
			if (!homeWindow.equals(currentWindow)) {
				driver.switchTo().window(currentWindow);
			}
		}
		driver.findElement(By.partialLinkText("Practice")).click();
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(homeWindow);
		//more operations.. in home window
		driver.findElement(By.partialLinkText("Sign Up")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
