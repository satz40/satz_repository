package org.mouseoveraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sathish Kumar\\eclipse-workspace\\java\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?tag=googinabkkenshoo-21&ascsubtag=688cbedd-b8c2-4d46-b63a-e8951b759244&ie=UTF8");
		WebElement category=driver.findElement(By.id("nav-link-shopall"));
		Actions ac=new Actions(driver);
		ac.moveToElement(category).perform();
		WebElement mens=driver.findElement(By.xpath("//span[@data-nav-panelkey='MensFashionPanel']"));
		ac.moveToElement(mens).perform();
		WebElement sunglass=driver.findElement(By.xpath("//span[text()='Sunglasses']"));
		sunglass.click();
		driver.quit();


	}
}
