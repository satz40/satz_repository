package org.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LVSLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sathish Kumar\\eclipse-workspace\\java\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.lvbankonline.in/lvbretail/RetailLogin.html");
		WebElement login=driver.findElement(By.id("fldLoginUserId"));
		login.sendKeys("satz40");
		WebElement password=driver.findElement(By.id("fldPassword"));
		password.sendKeys("56481");
		WebElement submit=driver.findElement(By.name("imageField"));
		submit.click();
		Thread.sleep(2000);
		driver.quit();

	}

}
