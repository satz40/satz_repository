package org.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookSignup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sathish Kumar\\eclipse-workspace\\java\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement fName=driver.findElement(By.name("firstname"));
		fName.sendKeys("Sathish");
		WebElement sName=driver.findElement(By.name("lastname"));
		sName.sendKeys("Kumar");
		WebElement phone=driver.findElement(By.name("reg_email__"));
		phone.sendKeys("8015618104");
		WebElement pWord=driver.findElement(By.name("reg_passwd__"));
		pWord.sendKeys("Satz@40");
		WebElement day=driver.findElement(By.id("day"));
		day.sendKeys("17");
		WebElement month=driver.findElement(By.id("month"));
		month.sendKeys("Jan");
		WebElement year=driver.findElement(By.id("year"));
		year.sendKeys("1994");
		WebElement sex=driver.findElement(By.xpath("//input[@value='2']"));
		sex.click();
		WebElement signup=driver.findElement(By.name("websubmit"));
		signup.click();
		Thread.sleep(2000);
		driver.quit();

	}

}
