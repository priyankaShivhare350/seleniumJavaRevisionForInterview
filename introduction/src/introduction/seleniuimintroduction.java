
package introduction;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class seleniuimintroduction  {

	public static void main(String[] args) {

//		invoke browser chrome driver
//		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
//		firefox launch
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver=new FirefoxDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("username")).sendKeys("priyanka");
		driver.findElement(By.id("password")).sendKeys("priyanka");
		driver.findElement(By.id("submit")).click();
		System.out.println(driver.findElement(By.id("error")).getText());
		driver.close();
//		driver.quit();
		

		
	}

	
}
