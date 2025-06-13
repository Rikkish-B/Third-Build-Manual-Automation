package Buildweek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class homepage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://bewakoooff.netlify.app/html/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='navEnd']//span[text()='SHOP NOW']")).click();
 Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='navEnd']//span[text()='MEN']")).click();
		 Thread.sleep(2000);
				driver.navigate().back();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@id='navEnd']//span[text()='WOMEN']")).click();
				 Thread.sleep(2000);
						driver.navigate().back();
						Thread.sleep(2000);
						driver.findElement(By.xpath("//div[@id='navEnd']//span[text()='ACCESSORIES']")).click();
						 Thread.sleep(2000);
								driver.navigate().back();
								Thread.sleep(2000);
								driver.findElement(By.xpath("//div[@id='navEnd']//span[text()='LIVE NOW']")).click();
								 Thread.sleep(2000);
										driver.navigate().back();
										Thread.sleep(2000);
										driver.findElement(By.xpath("//div[@id='navEnd']//span[text()='HEAVY DUTY']")).click();
										 Thread.sleep(2000);
												driver.navigate().back();
												Thread.sleep(2000);
												driver.findElement(By.xpath("//div[@id='navEnd']//span[text()='BEWAKOOF AIR']")).click();
												 Thread.sleep(2000);
														driver.navigate().back();
														Thread.sleep(2000);
														driver.findElement(By.xpath("//div[@id='navEnd']//span[text()='OFFICIAL MERCH']")).click();
														 Thread.sleep(2000);
																driver.navigate().back();
																Thread.sleep(2000);
																driver.findElement(By.xpath("//div[@id='navEnd']//span[text()='PLUS SIZE']")).click();
																 Thread.sleep(2000);
																		driver.navigate().back();
																		Thread.sleep(2000);
														driver.quit();

	}

}
