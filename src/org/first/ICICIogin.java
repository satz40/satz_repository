package org.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ICICIogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sathish Kumar\\eclipse-workspace\\java\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		WebElement login=driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL"));
		login.sendKeys("satz40");
		WebElement password=driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
		password.sendKeys("56481");
		WebElement submit=driver.findElement(By.id("VALIDATE_CREDENTIALS1"));
		submit.click();
		Thread.sleep(2000);
		driver.quit();

	}

}
