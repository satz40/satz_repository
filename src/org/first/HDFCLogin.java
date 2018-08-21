package org.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HDFCLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sathish Kumar\\eclipse-workspace\\java\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement login=driver.findElement(By.name("fldLoginUserId"));
		login.sendKeys("68021662");
		WebElement submit=driver.findElement(By.xpath("//img[@alt='continue']"));
		submit.click();
		WebElement pass=driver.findElement(By.name("fldPassword"));
		pass.sendKeys("Sathish@17");
		WebElement check=driver.findElement(By.id("chkrsastu"));
		check.click();
		WebElement loginBt=driver.findElement(By.xpath("//img[@src='/gif/login_new1.gif']"));
		loginBt.click();
	}

}
