package task10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Question1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[contains(@class, 'demo-frame')]"));
        driver.switchTo().frame(iframe);
        
        WebElement dateField = driver.findElement(By.xpath("//input[@id='datepicker']"));
        dateField.click();
        
        WebElement nextMonthButton = driver.findElement(By.xpath("//a[contains(@class, 'ui-datepicker-next')]"));
        nextMonthButton.click();
        
        WebElement dateToSelect = driver.findElement(By.xpath("//a[text()='22']"));
        dateToSelect.click();
        
        String selectedDate = dateField.getAttribute("value");
        System.out.println("Selected Date: " + selectedDate);
        
        driver.quit();
	}

}
