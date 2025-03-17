package com.kiot1;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Alert_Omeyo {
public static void main(String args[]) {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://omayo.blogspot.com/");
	WebElement a1=driver.findElement(By.xpath("//input[@id=\"alert1\"]"));
	a1.click();
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();
	WebElement a2=driver.findElement(By.xpath("//input[@id=\"prompt\"]"));
	a2.click();
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().sendKeys("Gayathri");
	driver.switchTo().alert().accept();
	WebElement a3=driver.findElement(By.xpath("//input[@id=\"confirm\"]"));
	a3.click();
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().dismiss();
	driver.quit();
}
}
