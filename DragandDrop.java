package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".\\Browser Utils\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		WebElement iFrame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(iFrame);
		WebElement DragFrom = driver.findElement(By.id("draggable"));
		WebElement DropTo = driver.findElement(By.id("droppable"));
		Actions a = new Actions(driver);
		a.dragAndDrop(DragFrom, DropTo).build().perform();
		
	}

}
