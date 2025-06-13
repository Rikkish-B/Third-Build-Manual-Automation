package Buildweek;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class signin {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://bewakoooff.netlify.app/html/index.html");
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
		driver.quit();
	}
}

//while clickiing the signup button after entering the setails sometimes the user needs to click the signinbutton twice to go next step even after the alerts appear
