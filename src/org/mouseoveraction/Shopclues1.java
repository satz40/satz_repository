package org.mouseoveraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Shopclues1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sathish Kumar\\eclipse-workspace\\java\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shopclues.com/");
		// not working due to notification popup
		WebElement mobiles=driver.findElement(By.xpath("//a[text()='Mobiles & Electronics']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(mobiles).perform();
		WebElement range=driver.findElement(By.xpath("//a[text()='Rs.5001 - Rs.10000']"));
		range.click();
		driver.quit();
	}

}
