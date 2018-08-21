package org.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailSignin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sathish Kumar\\eclipse-workspace\\java\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Dwm&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		WebElement email=driver.findElement(By.id("identifierId"));
		email.sendKeys("shasatz");
		WebElement submit=driver.findElement(By.xpath("(//span[@class='RveJvd snByac'])[2]"));
		submit.click();
		Thread.sleep(4000);
		WebElement password=driver.findElement(By.xpath("//input[@jsname='YPqjbf']"));
		password.sendKeys("satz40");
		WebElement submit1=driver.findElement(By.xpath("(//span[@class='RveJvd snByac'])[1]"));
		submit1.click();
		Thread.sleep(2000);
		driver.quit();

	}

}
