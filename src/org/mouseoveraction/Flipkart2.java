package org.mouseoveraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart2 {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Sathish Kumar\\eclipse-workspace\\java\\drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.flipkart.com/?gclid=EAIaIQobChMIjt7p2Kfw3AIVkyQrCh1A3gM-EAAYASAAEgI2cPD_BwE&semcmpid=sem_8024046704_brand_eta_goog&s_kwcid=AL!739!3!260637261012!e!!g!!flipkart&ef_id=W3CD0wAABTZz09f9:20180816002537:s");
			WebElement c=driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
			c.click();
			WebElement women=driver.findElement(By.xpath("//span[text()='Women']"));
			Actions ac=new Actions(driver);
			ac.moveToElement(women).perform();
			Thread.sleep(3000);
			WebElement footwear=driver.findElement(By.xpath("(//a[text()='Footwear'])[2]"));
			footwear.click();
			Thread.sleep(4000);
			WebElement flat=driver.findElement(By.className("_2SvCnW"));
			flat.click(); 
			driver.quit();

		}

}
