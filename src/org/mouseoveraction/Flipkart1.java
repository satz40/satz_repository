package org.mouseoveraction;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sathish Kumar\\eclipse-workspace\\java\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/?gclid=EAIaIQobChMIjt7p2Kfw3AIVkyQrCh1A3gM-EAAYASAAEgI2cPD_BwE&semcmpid=sem_8024046704_brand_eta_goog&s_kwcid=AL!739!3!260637261012!e!!g!!flipkart&ef_id=W3CD0wAABTZz09f9:20180816002537:s");
		WebElement c=driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		c.click();
		WebElement appliances=driver.findElement(By.xpath("//span[text()='TVs & Appliances']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(appliances).perform();
		Thread.sleep(5000);
		WebElement washingMachineBrand=driver.findElement(By.xpath("(//a[text()='IFB'])[1]"));
		washingMachineBrand.click();
		WebElement powerBank=driver.findElement(By.xpath("//div[text()='IFB 6 kg Fully Automatic Front Load Washing Machine White']"));
		powerBank.click();
		Set <String> s1 = driver.getWindowHandles();
		Iterator<String> it = s1.iterator();
		String p1 = it.next();
		String c1= it.next();
		driver.switchTo().window(c1);
		WebElement addToCart=driver.findElement(By.xpath("//span[@class='_3yGtFA']"));
		addToCart.click(); 
		//driver.quit();

	}

}
