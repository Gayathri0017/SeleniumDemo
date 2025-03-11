package com.kiot;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import io.github.bonigarcia.wdm.WebDriverManager;
public class Explicitwait{
	public static void main(String args[]) throws InterruptedException{
//	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	WebElement reveal=driver.findElement(By.xpath("//input[@id=\"reveal\"]"));
	reveal.click();
	WebElement revealed=driver.findElement(By.xpath("//input[@id=\"revealed\"]"));
	wait.until(ExpectedConditions.visibilityOf(revealed));
	revealed.sendKeys("Hello"+Keys.ENTER);
	System.out.println(revealed.getDomProperty("value"));
	}
}
