package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".\\Browser Utils\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/login");
		System.out.println(driver.getTitle());
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("tomsmith");
		username.clear();
		username.sendKeys("Nitish");
		//driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		//driver.close();
		
driver.navigate().to("https://the-internet.herokuapp.com/");
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("The total number of links" +allLinks.size());
		
		for(int i = 0;i<allLinks.size();i++)
		{
			
			System.out.println(allLinks.get(i).getText());
			System.out.println(allLinks.get(i).getAttribute("href"));
			

		
		
		}				
		
		
	}

}
