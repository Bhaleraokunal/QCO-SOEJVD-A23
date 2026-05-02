package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		
		Point locations = driver.findElement(By.linkText("View all")).getLocation();
		
		System.out.println(locations);
		
		System.out.println(locations.getX());
		
		System.out.println(locations.getY());
		
		driver.quit();

	}
}
