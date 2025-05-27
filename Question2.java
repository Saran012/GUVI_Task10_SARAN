package task10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	    WebElement iframe = driver.findElement(By.xpath("//iframe[contains(@class, 'demo-frame')]"));
	    driver.switchTo().frame(iframe);
	        
	    WebElement sourceElement = driver.findElement(By.xpath("//div[@id='draggable']"));
	    WebElement targetElement = driver.findElement(By.xpath("//div[@id='droppable']"));
	        
	    Actions actions = new Actions(driver);
	    actions.dragAndDrop(sourceElement, targetElement).perform();
	        
	    String backgroundColor = targetElement.getCssValue("background-color");
	    System.out.println("Background Color after drop: " + backgroundColor);
	        
	    String droppedText = targetElement.getText();
	    if (droppedText.equals("Dropped!")) {
	         System.out.println("Drag and Drop successful!");
	    } else {
	         System.out.println("Drag and Drop failed!");
	    }
	        
	    driver.quit();
	    
     }
}
		
		

	


