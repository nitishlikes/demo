package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Browser Utils\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.partialLinkText("Example 1")).click();
		driver.findElement(By.xpath("//div[@id='start']/button")).click();
		WebElement text = driver.findElement(By.xpath("//div[@id='finish']/h4"));
		System.out.println(text.getText());
		//System.out.println(driver.findElement(By.xpath("(//h4)[2]")).getText());
		
	}

}
