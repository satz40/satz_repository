package org.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensVelSearch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sathish Kumar\\eclipse-workspace\\java\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement searchName=driver.findElement(By.id("lst-ib"));
		searchName.sendKeys("Greens Velmurugan");
		WebElement search=driver.findElement(By.name("btnK"));
		search.click();
		WebElement link1=driver.findElement(By.linkText("Selenium Training In Chennai - Greens Technologys"));
		link1.click();
		Thread.sleep(2000);
		driver.quit();
	}

}
