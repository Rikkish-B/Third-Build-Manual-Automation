package Buildweek;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkout {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://bewakoooff.netlify.app/html/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("user")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("signup-name")).sendKeys("Rikkish");
		driver.findElement(By.className("signup-username")).sendKeys("Rikkish");
		driver.findElement(By.className("signup-password")).sendKeys("Rikidhanu1404@");
		driver.findElement(By.className("signup-email")).sendKeys("rikidhanu1404@");
		driver.findElement(By.className("signup-number")).sendKeys("8888899933");
		driver.findElement(By.className("signup-btn")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);	
		driver.findElement(By.className("login-username")).sendKeys("Rikkish");
		driver.findElement(By.className("login-password")).sendKeys("Rikidhanu1404@");
		driver.findElement(By.className("login-btn")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@src=\"https://images.bewakoof.com/uploads/grid/app/trending-category-icons-Joggers-men-1706512292.jpg\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@src=\"https://images.bewakoof.com/original/men-s-green-super-loose-fit-cargo-joggers-609806-1710771339-2.jpg\"]")).click();
		driver.findElement(By.cssSelector(".pd-size-s.pd-size-btn")).click();
		WebElement addToBag = driver.findElement(By.id("pd-add-to-bag-btn"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", addToBag);
Thread.sleep(2000);
driver.findElement(By.xpath("//img[@src=\'../image/bag.svg\']")).click();
Thread.sleep(2000);
driver.findElement(By.className("add-address")).click();
driver.findElement(By.className("form-name")).sendKeys("Rikkish");
driver.findElement(By.className("form-mobile")).sendKeys("8027272727");
driver.findElement(By.className("form-zip")).sendKeys("635109");
driver.findElement(By.className("form-city")).sendKeys("hosur");
driver.findElement(By.className("form-state")).sendKeys("tamil nadu");
driver.findElement(By.className("form-flatno")).sendKeys("3/424, alasantham");
driver.findElement(By.className("form-locality")).sendKeys("brindhavan garden");
driver.findElement(By.className("place-order")).click();
driver.switchTo().alert().accept();
		}
}
