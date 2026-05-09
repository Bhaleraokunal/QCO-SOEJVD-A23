package selectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptions {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		
		WebElement drop = driver.findElement(By.cssSelector("[name='Month']"));
		
		Select sel = new Select(drop);
		
		for (int i = 0; i < 13; i++) {
			if (i%2==0) {
				sel.selectByIndex(i);
			}
		}
		
		
		
		List<WebElement> allSelected = sel.getAllSelectedOptions();
		
		for (int i = 0; i < allSelected.size(); i++) {
			
			WebElement all = allSelected.get(i);
			
			System.out.println(all.getText());;
		}
		
//		for (WebElement webElement : allSelected) {
//			
//			System.out.println(webElement.getText());
//		}
	}
	
}
