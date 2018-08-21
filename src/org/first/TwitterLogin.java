package org.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwitterLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sathish Kumar\\eclipse-workspace\\java\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://twitter.com/login?lang=en");
		WebElement login=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		login.sendKeys("satz40");
		WebElement password=driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		password.sendKeys("56481");
		WebElement submit=driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		Thread.sleep(2000);
		driver.quit();

	}

}
