package org.mouseoveraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish Kumar\\eclipse-workspace\\java\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?tag=googinabkkenshoo-21&ascsubtag=688cbedd-b8c2-4d46-b63a-e8951b759244&ie=UTF8");
		Actions ac=new Actions(driver);
		WebElement signIn= driver.findElement(By.xpath("(//span[@class='nav-line-1'])[2]"));
		ac.moveToElement(signIn).perform();
		Thread.sleep(3000);
		WebElement startHere= driver.findElement(By.xpath("(//a[@class='nav-a'])[1]"));
		startHere.click();
		WebElement custName= driver.findElement(By.name("customerName"));
		custName.sendKeys("Sathish");
		WebElement phone= driver.findElement(By.id("ap_phone_number"));
		phone.sendKeys("8015618104");
		WebElement email= driver.findElement(By.id("ap_email"));
		email.sendKeys("shasatz@gmail.com");
		WebElement pass= driver.findElement(By.id("ap_password"));
		pass.sendKeys("satz40");
		WebElement submit= driver.findElement(By.id("continue"));
		submit.click();
		
	}

}
