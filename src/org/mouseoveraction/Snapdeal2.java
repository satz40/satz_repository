package org.mouseoveraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sathish Kumar\\eclipse-workspace\\java\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/offers/deal-of-the-day?utm_source=earth_brand_new&utm_campaign=BrandCat&utm_medium=brand%20term,1t1&utm_content=homepage&utm_term=e,snapdeal&utm_source=earth_brand_new&utm_campaign=brandcat_roas_ftu&utm_content=57444771733");
		WebElement menu=driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-menu']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(menu).perform();
		WebElement women=driver.findElement(By.xpath("(//span[@class='catText'])[7]"));
		ac.moveToElement(women).perform();
		WebElement footWear=driver.findElement(By.xpath("(//span[text()='Footwear'])[2]"));
		footWear.click();
		driver.quit();
		
	}
}
