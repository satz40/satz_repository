package org.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettyImagesReg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sathish Kumar\\eclipse-workspace\\java\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gettyimages.in/");
		WebElement signIn=driver.findElement(By.linkText("Sign in"));
		signIn.click();
		WebElement reg=driver.findElement(By.xpath("//div[text()='REGISTER']"));
		reg.click();
		WebElement fName=driver.findElement(By.id("register_first_name"));
	    fName.sendKeys("Sathish");
	    WebElement lName=driver.findElement(By.id("register_last_name"));
	    lName.sendKeys("Kumar");
	    WebElement com=driver.findElement(By.id("register_organization_type"));
	    com.sendKeys("Direct Marketing");
	    WebElement comName=driver.findElement(By.id("register_organization_name"));
	    comName.sendKeys("Amazon");
	    WebElement jobTitle=driver.findElement(By.id("register_job_title"));
	    jobTitle.sendKeys("Other");
	    WebElement jobTitleDesc=driver.findElement(By.id("register_unique_job_title"));
	    jobTitleDesc.sendKeys("Software Test Engineer");
	    WebElement email=driver.findElement(By.id("register_email"));
	    email.sendKeys("shasatz@amazon.com");
	    WebElement phone=driver.findElement(By.id("register_telephone"));
	    phone.sendKeys("8015618104");
	    WebElement password=driver.findElement(By.id("register_password"));
	    password.sendKeys("satz40");
	    WebElement submit=driver.findElement(By.id("register-button"));
	    submit.click();
	    Thread.sleep(2000);
	    driver.quit();
	}

}
