package org.mouseoveraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreensTech2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sathish Kumar\\eclipse-workspace\\java\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		WebElement courses=driver.findElement(By.linkText("COURSES"));
		Actions ac=new Actions(driver);
		ac.moveToElement(courses).perform();
		WebElement training=driver.findElement(By.partialLinkText("Oracle Train"));
		ac.moveToElement(training).perform();
		WebElement trainingCourse=driver.findElement(By.linkText("Oracle SQL Training"));
		trainingCourse.click();
		driver.quit();
	}

}
