package Buildweek;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class addtocart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
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
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement sizeBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".pd-size-s.pd-size-btn")));
		sizeBtn.click();

		WebElement addToBag = driver.findElement(By.id("pd-add-to-bag-btn"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", addToBag);
Thread.sleep(2000);
driver.findElement(By.xpath("//img[@src=\'../image/bag.svg\']")).click();
WebElement product = driver.findElement(By.xpath("//h5[text()=\"Men's Super Loose Fit Cargo Joggers\"]"));
if (product.isDisplayed()) {
    System.out.println("The item is successfully added to cart");
} else {
    System.out.println("The item is not added to cart");
}
}	
}
