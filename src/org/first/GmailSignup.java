package org.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailSignup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sathish Kumar\\eclipse-workspace\\java\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default&flowName=GlifWebSignIn&flowEntry=SignUp");
		WebElement fName=driver.findElement(By.id("firstName"));
		fName.sendKeys("Sathish");
		WebElement lName=driver.findElement(By.id("lastName"));
		lName.sendKeys("Kumar");
		WebElement uName=driver.findElement(By.id("username"));
		uName.sendKeys("shasatz");
		WebElement pWord=driver.findElement(By.name("Passwd"));
		pWord.sendKeys("1234");
		WebElement conPWord=driver.findElement(By.name("ConfirmPasswd"));
		conPWord.sendKeys("1234");
		WebElement submit=driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
		submit.click();
		Thread.sleep(2000);
		driver.quit();

	}

}
