package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Browser Utils\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/tables");
		List<WebElement> columns = driver.findElements(By.xpath("//*[@id='table1']/thead/tr/th"));
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id='table1']/tbody/tr"));
		System.out.println("Total number of cols are " + columns.size());
		System.out.println("Total number of rows are " + rows.size());

		for (int i = 0; i < columns.size(); i++) {
			System.out.println(columns.get(i).getText());

		}

		List<WebElement> row1 = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[1]/td"));
		for (int i = 0; i < row1.size(); i++) {
			System.out.println(row1.get(i).getText());

		}

	}
}
