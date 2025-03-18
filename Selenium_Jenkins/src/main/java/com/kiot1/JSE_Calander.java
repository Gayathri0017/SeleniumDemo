package com.kiot1;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class JSE_Calander {
public static void main(String args[]) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
	WebElement ip=driver.findElement(By.xpath("//input[@id=\"datepicker\"]"));
	sendKeys(driver,ip,"12/12/2030");
	driver.quit();
}
public static void sendKeys(WebDriver driver,WebElement ele,String s) {
	JavascriptExecutor jse=(JavascriptExecutor) driver;
	jse.executeScript("arguments[0].value='"+s+"'",ele);
}
}
