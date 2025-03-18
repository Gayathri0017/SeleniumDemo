package com.kiot1;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class JSE_Task {
public static void main(String args[]) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	JavascriptExecutor jse=(JavascriptExecutor) driver;
	driver.get("https://tutorialsninja.com/demo/");
	WebElement ele=driver.findElement(By.xpath("//input[@class=\"form-control input-lg\"]"));
	sendKeys(driver,ele);
	WebElement btn=driver.findElement(By.xpath("//button[@class=\"btn btn-default btn-lg\"]"));
	click(driver,btn);
	jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	jse.executeScript("window.scrollBy(0,-300)");
	//driver.quit();
}
public static void sendKeys(WebDriver driver,WebElement ele) {
	JavascriptExecutor jse=(JavascriptExecutor) driver;
	jse.executeScript("arguments[0].value='Hp'",ele);
}
public static void click(WebDriver driver,WebElement ele){
	JavascriptExecutor jse=(JavascriptExecutor) driver;
	jse.executeScript("arguments[0].click()",ele);
}
}
