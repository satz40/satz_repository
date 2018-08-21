package org.mouseoveraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeDepot2 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sathish Kumar\\eclipse-workspace\\java\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		WebElement dept=driver.findElement(By.linkText("All Departments"));
		Actions ac=new Actions(driver);
		ac.moveToElement(dept).perform();
		Thread.sleep(4000);
		WebElement paint=driver.findElement(By.xpath("(//a[text()='Paint'])[1]"));
		ac.moveToElement(paint).perform();
		Thread.sleep(4000);
		WebElement intPaint=driver.findElement(By.xpath("//a[text()='Interior Paint']"));
		ac.moveToElement(intPaint).perform();
		Thread.sleep(4000);
		WebElement ceilPaint=driver.findElement(By.xpath("//a[text()='Ceiling Paint']"));
		ceilPaint.click();
		driver.quit();
		
	}
}

