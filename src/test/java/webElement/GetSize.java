package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		
//		Dimension size = driver.findElement(By.linkText("View all")).getSize();
		
		Dimension size=driver.findElement(By.cssSelector("[alt='Tricentis Demo Web Shop']")).getSize();
		
		System.out.println(size);
		
		System.out.println(size.getWidth());
		
		System.out.println(size.getHeight());
		
		driver.quit();

	}
}
