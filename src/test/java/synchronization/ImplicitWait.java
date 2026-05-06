package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();//browser
		driver.manage().window().maximize();// maximize
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // waiting implicit wait
		
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		
		driver.findElement(By.id("btn1")).click();
		
		driver.findElement(By.cssSelector("[id='txt1']")).sendKeys("Hellooooooooo");
		
		driver.quit();
		
	}
}