package com.kiot1;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class actionClass {
public static void main(String args[]) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://omayo.blogspot.com/");
	WebElement btn=driver.findElement(By.xpath("//input[@name=\"q\"]"));
	Actions ac=new Actions(driver);
	ac.contextClick(btn).perform();
	WebElement dclik=driver.findElement(By.xpath("//button[text()=\" Double click Here   \"]"));
	ac.doubleClick(dclik).perform();
}
}
