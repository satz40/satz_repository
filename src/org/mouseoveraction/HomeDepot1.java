package org.mouseoveraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeDepot1 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sathish Kumar\\eclipse-workspace\\java\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		WebElement dept=driver.findElement(By.linkText("All Departments"));
		Actions ac=new Actions(driver);
		ac.moveToElement(dept).perform();
		Thread.sleep(4000);
		WebElement heat=driver.findElement(By.xpath("(//a[text()='Heating & Cooling'])[1]"));
		ac.moveToElement(heat).perform();
		Thread.sleep(4000);
		WebElement airCond=driver.findElement(By.xpath("(//a[text()='Air Conditioners'])[1]"));
		ac.moveToElement(airCond).perform();
		Thread.sleep(4000);
		WebElement portAirCond=driver.findElement(By.xpath("(//a[text()='Portable Air Conditioners'])[1]"));
		portAirCond.click();
		driver.quit();
		
	}
}
