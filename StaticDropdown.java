package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Browser Utils\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		WebElement Day = driver.findElement(By.xpath("//select[starts-with(@name,'DOB_Day')]"));
		Select s = new Select(Day);
		s.selectByIndex(10);
		
		WebElement Month = driver.findElement(By.xpath("//select[starts-with(@name,'DOB_Month')]"));
		Select s1 = new Select (Month);
		s1.selectByValue("10");
		
		WebElement Year = driver.findElement(By.xpath("//select[starts-with(@name,'DOB_Year')]"));
		Select s2 = new Select (Year);
		s2.selectByVisibleText("2020");
		
		
		
	}

}
