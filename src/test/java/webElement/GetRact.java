package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRact {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
	  Rectangle link =	driver.findElement(By.className("nivo-imageLink")).getRect();
		
	  Rectangle img= driver.findElement(By.xpath("//a[@class='nivo-imageLink']/child::img")).getRect();
	
	  
	  System.out.println("----------------------for links--------------------");
	  System.out.println(link.x);
	  System.out.println(link.y);
	  System.out.println(link.width);
	  System.out.println(link.height);
	  
	  System.out.println(link.getX());
	  System.out.println(link.getY());
	  System.out.println(link.getWidth());
	  System.out.println(link.getHeight());
	  
	  
	  System.out.println(link.getDimension());
	  System.out.println(link.getPoint());
	  
	  System.out.println("-------------------------for image-----------------");
	  System.out.println(img.x);
	  System.out.println(img.y);
	  System.out.println(img.width);
	  System.out.println(img.height);
	  
	  System.out.println(img.getX());
	  System.out.println(img.getY());
	  System.out.println(img.getWidth());
	  System.out.println(img.getHeight());
	  
	  
	  System.out.println(img.getDimension());
	  System.out.println(img.getPoint());
	  
		
		driver.quit();
	}
}
