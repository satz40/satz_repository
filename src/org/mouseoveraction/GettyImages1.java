package org.mouseoveraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GettyImages1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sathish Kumar\\eclipse-workspace\\java\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gettyimages.in/");
		WebElement editorial=driver.findElement(By.xpath("(//a[text()='Editorial'])[4]"));
		Actions ac=new Actions(driver);
		ac.moveToElement(editorial).perform();
		WebElement entertainment=driver.findElement(By.xpath("(//a[text()='Entertainment'])[2]"));
		entertainment.click();
		driver.quit();
	}

}
