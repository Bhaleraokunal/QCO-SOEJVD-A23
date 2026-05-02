package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAriaROle {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		String link = driver.findElement(By.linkText("Register")).getAriaRole();
		System.out.println("--------------------- for regiter-------------------");
		System.out.println(link);
		System.out.println("--------------------- for login-------------------");
		
		System.out.println(driver.findElement(By.linkText("Log in")).getAriaRole());
		
		System.out.println("--------------------- for radio button-------------------");
		System.out.println(driver.findElement(By.xpath("//input[@id='pollanswers-2']")).getAriaRole());
		
		System.out.println("--------------------- for image-------------------");
		System.out.println(driver.findElement(By.cssSelector("[alt='Tricentis Demo Web Shop']")).getAriaRole());
		driver.quit();
		
	}
}
