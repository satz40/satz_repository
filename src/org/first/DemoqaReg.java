package org.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class DemoqaReg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sathish Kumar\\eclipse-workspace\\java\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/registration/");
		WebElement fName=driver.findElement(By.id("name_3_firstname"));
	    fName.sendKeys("Sathish");
	    WebElement lName=driver.findElement(By.id("name_3_lastname"));
	    lName.sendKeys("Kumar");
	    WebElement rel=driver.findElement(By.xpath("//input[@value='single']"));
	    rel.click();
	    WebElement hobby1=driver.findElement(By.xpath("//input[@value='dance']"));
	    hobby1.click();
	    WebElement hobby2=driver.findElement(By.xpath("//input[@value='reading']"));
	    hobby2.click();
	    WebElement hobby3=driver.findElement(By.xpath("//input[contains(@value,'cricket')]"));
	    hobby3.click();
	    WebElement country=driver.findElement(By.id("dropdown_7"));
	    country.sendKeys("India");
	    WebElement month=driver.findElement(By.id("mm_date_8"));
	    month.sendKeys("1");
	    WebElement day=driver.findElement(By.id("dd_date_8"));
	    day.sendKeys("17");
	    WebElement year=driver.findElement(By.id("yy_date_8"));
	    year.sendKeys("1994");
	    WebElement phone=driver.findElement(By.id("phone_9"));
	    phone.sendKeys("8015618104");
	    WebElement uName=driver.findElement(By.id("username"));
	    uName.sendKeys("Satz");
	    WebElement email=driver.findElement(By.id("email_1"));
	    email.sendKeys("shasatz@gmail.com");
	    /*WebElement upload=driver.findElement(By.id("profile_pic_10"));
	    upload.sendKeys("C:\\Users\\Sathish Kumar\\Pictures"); - not executing*/
	    WebElement txtBox=driver.findElement(By.id("description"));
	    txtBox.sendKeys("I am from chennai");
	    WebElement pWord=driver.findElement(By.id("password_2"));
	    pWord.sendKeys("Satz40");
	    WebElement conPWord=driver.findElement(By.id("confirm_password_password_2"));
	    conPWord.sendKeys("Satz40");
	    WebElement submit=driver.findElement(By.name("pie_submit"));
	    submit.click();
		Thread.sleep(2000);
		driver.quit();
	}

}


