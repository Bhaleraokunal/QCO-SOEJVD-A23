package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://vinothqaacademy.com/mouse-event/");
		
		WebElement doubleClick = driver.findElement(By.id("doubleBtn"));
		
		Actions act = new Actions(driver);
		
		act.doubleClick(doubleClick).perform();
		
		act.contextClick(doubleClick) ;
	}
}
