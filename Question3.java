package task10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Question3 {

	public static void main(String[] args)  throws InterruptedException{
				
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.guvi.in/"); 
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
      
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

      WebElement signupButton = driver.findElement(By.xpath("//a[@href='/register/' and contains(text(), 'Sign up')]"));
      signupButton.click();

      wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name"))).sendKeys("Demo User");
      driver.findElement(By.id("email")).sendKeys("demo1234567@gmail.com");
      driver.findElement(By.id("password")).sendKeys("Demo@1234567");
      driver.findElement(By.id("mobileNumber")).sendKeys("9876543210");

      WebElement signupButton2 = driver.findElement(By.xpath("//a[@id='signup-btn']"));
      signupButton2.click();
      
      System.out.println("Page title after signup: " + driver.getTitle());

      driver.get("https://www.guvi.in/");
      WebElement loginButton = driver.findElement(By.id("login-btn"));
      loginButton.click();


      wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email"))).sendKeys("saranshanmugavel1@gmail.com");
      driver.findElement(By.id("password")).sendKeys("Zmalqp@123?");

      WebElement loginButton2 = driver.findElement(By.xpath("//a[text()='Login']"));
      loginButton2.click();

      System.out.println("Page title after login: " + driver.getTitle());

      driver.quit();
  }
}
      
    
