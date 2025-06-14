package Buildweek;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='navEnd']//span[text()='SHOP NOW']")).click();
		 Thread.sleep(2000);
driver.findElement(By.id("gender-name")).click();
driver.findElement(By.xpath("//label[@for='men']")).click();
driver.findElement(By.xpath("//img[@src='https://images.bewakoof.com/t1080/men-s-black-relax-t-shirt-387407-1715257669-1.jpg']")).click();
driver.findElement(By.cssSelector(".pd-size-m.pd-size-btn")).click();
Thread.sleep(2000);
WebElement addToBag = driver.findElement(By.xpath("//button[.//span[text()='ADD TO BAG']]"));
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("arguments[0].click();", addToBag);
Thread.sleep(2000);
driver.findElement(By.xpath("//button[contains(., 'GO TO BAG')]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//img[@src='../image/bag.svg']")).click();	
	
    WebElement  product = driver.findElement(By.className("Men's Casual Cargo Pants"));
    if(product.isDisplayed()) {
    	System.out.println("teh item is sucessfully added to cart");
    }else {
    	System.out.println("the item is not added to cart");
    }
	}

}
//the Add to bag button which is used to add products in the cart is not able to perform its not clicking through automoation testing so this is actually bug
