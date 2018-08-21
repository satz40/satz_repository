package org.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAutoTestingReg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sathish Kumar\\eclipse-workspace\\java\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Index.html");
		WebElement reg=driver.findElement(By.xpath("//button[@id='btn2']"));
		reg.click();
		WebElement fName=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		fName.sendKeys("Sathish");
		WebElement lName=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lName.sendKeys("Kumar");
		WebElement add=driver.findElement(By.xpath("//textarea[@rows='3']"));
		add.sendKeys("Ramapuram, Channai - 600089");
		WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("shasatz@gmail.com");
		WebElement phone=driver.findElement(By.xpath("//input[@type='tel']"));
		phone.sendKeys("8015618104");
		WebElement sex=driver.findElement(By.xpath("//input[@value='Male']"));
	    sex.click();
	    WebElement hobby1=driver.findElement(By.id("checkbox1"));
	    hobby1.click();
	    WebElement hobby2=driver.findElement(By.id("checkbox2"));
	    hobby2.click();
	    WebElement hobby3=driver.findElement(By.id("checkbox3"));
	    hobby3.click();
	    WebElement lan=driver.findElement(By.xpath("//div[@id='msdd']"));
	    lan.click();
	    WebElement lan1=driver.findElement(By.partialLinkText("Eng"));
	    lan1.click();
	    WebElement lan11=driver.findElement(By.partialLinkText("Ara"));
	    lan11.click();
	    WebElement lan111=driver.findElement(By.partialLinkText("Dut"));
	    lan111.click();
	    WebElement skills=driver.findElement(By.id("Skills"));
	    skills.sendKeys("Java");
	    /*WebElement country=driver.findElement(By.id("countries"));
	    country.sendKeys("Albania");
	    WebElement selCountry=driver.findElement(By.xpath("//span[@role='combobox']"));
	    selCountry.sendKeys("India");*/
	    WebElement year=driver.findElement(By.xpath("//select[@placeholder='Year']"));
		year.sendKeys("1994");
		WebElement month=driver.findElement(By.xpath("//select[@placeholder='Month']"));
		month.sendKeys("January");
		WebElement day=driver.findElement(By.xpath("//select[@placeholder='Day']"));
		day.sendKeys("17");
		WebElement pWord=driver.findElement(By.id("firstpassword"));
	    pWord.sendKeys("Satz40");
	    WebElement conPWord=driver.findElement(By.id("secondpassword"));
	    conPWord.sendKeys("Satz40");
	    WebElement submit=driver.findElement(By.id("submitbtn"));
	    submit.click();
	    Thread.sleep(2000);
		driver.quit();

	}

}
