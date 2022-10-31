package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Manju");
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Priya");
		driver.findElement(By.xpath("(//input[@type=\"text\"])[4]")).sendKeys("9677263025");
		driver.findElement(By.xpath("(//input[@type=\"password\"])[2]")).sendKeys("OYEE@123");
		WebElement Day = driver.findElement(By.id("day"));
		Select day = new Select(Day);
		day.selectByValue("7");
		WebElement Month = driver.findElement(By.id("month"));
		Select Mon = new Select(Month);
		Mon.selectByVisibleText("Nov");
		WebElement YEAR = driver.findElement(By.id("year"));
		Select YY = new Select(YEAR);
		YY.selectByIndex(32);
		driver.findElement(By.xpath("(//input[@type=\"radio\"])[1]")).click();
		driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();
		
		}
}
