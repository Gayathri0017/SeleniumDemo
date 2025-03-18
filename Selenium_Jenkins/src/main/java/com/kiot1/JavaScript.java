package com.kiot1;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class JavaScript {
public static void main(String args[]) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://omayo.blogspot.com/");
	JavascriptExecutor jse=(JavascriptExecutor) driver;
	jse.executeScript("alert('hello')");
	//jse.executeScript("document.getElementById('alert2').click()");
//	WebElement btn1=driver.findElement(By.id("alert2"));
//	jse.executeScript("arguments[0].click()",btn1);
}
}
