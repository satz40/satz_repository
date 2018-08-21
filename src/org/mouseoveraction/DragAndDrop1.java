package org.mouseoveraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sathish Kumar\\eclipse-workspace\\java\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement sDebitAccount=driver.findElement(By.id("credit2"));
		WebElement dDebitAccount=driver.findElement(By.id("bank"));
		WebElement sDebitAmount=driver.findElement(By.xpath("(//li[@id='fourth'])[1]"));
		WebElement dDebitAmount=driver.findElement(By.id("amt7"));
		WebElement sDebitAccount1=driver.findElement(By.id("credit1"));
		WebElement dDebitAccount1=driver.findElement(By.id("loan"));
		WebElement sDebitAmount1=driver.findElement(By.xpath("(//li[@id='fourth'])[2]"));
		WebElement dDebitAmount1=driver.findElement(By.id("amt8"));
		Actions ac=new Actions(driver);
		ac.dragAndDrop(sDebitAccount, dDebitAccount).perform();
		ac.dragAndDrop(sDebitAmount, dDebitAmount).perform();
		ac.dragAndDrop(sDebitAccount1, dDebitAccount1).perform();
		ac.dragAndDrop(sDebitAmount1, dDebitAmount1).perform();
		driver.quit();
		

	}

}
