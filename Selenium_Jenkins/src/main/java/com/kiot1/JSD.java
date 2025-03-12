package com.kiot1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class JSD {
public static void main(String args[]) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.bstackdemo.com/");
	WebElement op=driver.findElement(By.xpath("//select"));
	op.click();
//	JavascriptExecutor js=(JavascriptExecutor) driver;
//	js.executeScript("arguments[0].value='highestprice'", op);
	Actions ac=new Actions(driver);
	ac.moveToElement(op).perform();
	WebElement cu=driver.findElement(By.xpath("//option[text()='Lowest to Highest']"));
	cu.click();
	driver.quit();
}
}
