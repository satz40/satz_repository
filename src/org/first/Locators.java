package org.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish Kumar\\eclipse-workspace\\java\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.adactin.com/HotelApp/");
		WebElement user=driver.findElement(By.id("username"));
		user.sendKeys("username");
		WebElement pass=driver.findElement(By.id("password"));
		pass.sendKeys("password");
		driver.quit();
	}

}
