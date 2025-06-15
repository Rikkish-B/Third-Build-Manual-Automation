package Buildweek;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class footerlinks {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://bewakoooff.netlify.app/html/");
		
Thread.sleep(2000);
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
Thread.sleep(3000);
driver.findElement(By.xpath("//ul[contains(@class, 'f-list-1')]//li[contains(text(),'CUSTOMER SERVICE')]")).click();
driver.navigate().back();
Thread.sleep(2000);
driver.findElement(By.xpath("//ul[contains(@class, 'f-list-1')]//li[contains(text(),'Contact Us')]")).click();
driver.navigate().back();
Thread.sleep(2000);
driver.findElement(By.xpath("//ul[contains(@class, 'f-list-1')]//li[contains(text(),'Track Order')]")).click();
driver.navigate().back();
Thread.sleep(2000);
driver.findElement(By.xpath("//ul[contains(@class, 'f-list-1')]//li[contains(text(),'Return Order')]")).click();
driver.navigate().back();
Thread.sleep(2000);
driver.findElement(By.xpath("//ul[contains(@class, 'f-list-1')]//li[contains(text(),'Cancel Order')]")).click();
driver.navigate().back();
Thread.sleep(2000);
driver.findElement(By.xpath("//ul[contains(@class, 'f-list-2')]//li[contains(text(),'COMPANY')]")).click();
driver.navigate().back();
Thread.sleep(2000);
driver.findElement(By.xpath("//ul[contains(@class, 'f-list-2')]//li[contains(text(),'About Us')]")).click();
driver.navigate().back();
Thread.sleep(2000);
driver.findElement(By.xpath("//ul[contains(@class, 'f-list-2')]//li[contains(text(),'We're Hiring')]")).click();
driver.navigate().back();
Thread.sleep(2000);
driver.findElement(By.xpath("//ul[contains(@class, 'f-list-2')]//li[contains(text(),'Terms & Conditions')]")).click();
driver.navigate().back();
Thread.sleep(2000);
driver.findElement(By.xpath("//ul[contains(@class, 'f-list-2')]//li[contains(text(),'Privacy Policy')]")).click();
driver.navigate().back();
Thread.sleep(2000);
driver.findElement(By.xpath("//ul[contains(@class, 'f-list-2')]//li[contains(text(),'Blog')]")).click();
driver.navigate().back();
Thread.sleep(2000);
driver.findElement(By.xpath("//ul[contains(@class, 'f-list-3')]//li[contains(text(),'CONNECT WITH US')]")).click();
driver.navigate().back();
Thread.sleep(2000);
driver.findElement(By.xpath("//ul[contains(@class, 'f-list-3')]//li[contains(text(),'4.7M People Like this')]")).click();
driver.navigate().back();
Thread.sleep(2000);
driver.findElement(By.xpath("//ul[contains(@class, 'f-list-3')]//li[contains(text(),'1M Followers')]")).click();
driver.navigate().back();
Thread.sleep(2000);
driver.findElement(By.xpath("//ul[contains(@class, 'f-list-4')]//li[contains(text(),'KEEP UP TO DATE')]")).click();
driver.navigate().back();
Thread.sleep(2000);
driver.findElement(By.id("email")).sendKeys("rikidhanu1404@gmail.com");
driver.findElement(By.id("f-subscribe-btn")).click();
Thread.sleep(2000);
	}
}
//the footer lnks are not clickable and when clicked it provided no futher data  its a bug
