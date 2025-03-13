package com.kiot1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoradActions {
public static void main(String args[]) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://omayo.blogspot.com/");
	WebElement link=driver.findElement(By.xpath("//a[text()=\"jqueryui\"]"));
	Actions a=new Actions(driver);
	a.keyDown(Keys.CONTROL).moveToElement(link).click().keyUp(Keys.CONTROL).build().perform();
}
}
