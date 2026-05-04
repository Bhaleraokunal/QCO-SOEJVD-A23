package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetDOMPropertiesAndAttribute {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		
		WebElement search = driver.findElement(By.id("small-searchterms"));
		
		System.out.println("----------Before Typing-----------");
		System.out.println(search.getDomAttribute("value"));  //search store
		System.out.println(search.getDomProperty("value"));  // search store
		
		search.clear();
		search.sendKeys("Books");
		
		
		System.out.println("---------------After typing------------");
		System.out.println(search.getDomAttribute("value"));  // search store
		System.out.println(search.getDomProperty("value"));  // books
	}
}
