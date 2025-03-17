package com.kiot1;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class BlogSpotWindow {
public static void main(String args[]) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://omayo.blogspot.com/");
	WebElement link=driver.findElement(By.xpath("//a[@id=\"selenium143\"]"));
	link.click();
	WebElement pop=driver.findElement(By.xpath("//a[text()=\"Open a popup window\"]"));
	pop.click();
	Set<String> add=driver.getWindowHandles();
	System.out.println(add);
	String main=driver.getWindowHandle();
	for(String a:add){
		if(!(main.equals(a))) {
		driver.switchTo().window(a);
		WebElement ele=driver.findElement(By.xpath("//a[text()=\"What is Selenium?\"]"));
		System.out.println(ele.getText());
		break;
		}
	}
	driver.switchTo().window(main);
	WebElement ele1=driver.findElement(By.xpath("//h1[@class=\"title\"]"));
	System.out.println(ele1.getText());
	driver.quit();
	
	}
}

