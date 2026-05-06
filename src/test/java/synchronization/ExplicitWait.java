package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

public static void main(String[] args) {
	
	WebDriver driver = new FirefoxDriver();//browser
	driver.manage().window().maximize();// maximize
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
	driver.get("https://omayo.blogspot.com/");
	
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	driver.findElement(By.xpath("//button[text()='Dropdown']")).click();
	
	WebElement el1 = driver.findElement(By.xpath("//a[text()='Facebook']"));
	
	wait.until(ExpectedConditions.elementToBeClickable(el1));

	el1.click();
	
	
}
}
