package org.mouseoveraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreensTech1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sathish Kumar\\eclipse-workspace\\java\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		WebElement courses=driver.findElement(By.linkText("COURSES"));
		Actions ac=new Actions(driver);
		ac.moveToElement(courses).perform();
		WebElement softwareTest=driver.findElement(By.partialLinkText("Software Testing Tra"));
		ac.moveToElement(softwareTest).perform();
		WebElement seleniumTraining=driver.findElement(By.linkText("Selenium Training"));
		seleniumTraining.click();
		driver.quit();
		
	}
}
