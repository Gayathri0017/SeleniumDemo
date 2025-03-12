package com.kiot;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormPage_SC {
public static void main(String args[]) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.selenium.dev/selenium/web/formPage.html");
	WebElement dd=driver.findElement(By.xpath("//select[@id=\"multi\"]"));
	Select s=new Select(dd);
	List<WebElement> op=s.getOptions();
	for(WebElement ele:op) {
		System.out.println(ele.getText());
	}
	s.selectByVisibleText("Eggs");
	s.selectByValue("onion gravy");
	List<WebElement> sel=s.getAllSelectedOptions();
	for(WebElement ele:sel) {
		System.out.println(ele.getText());
	}
	s.deselectByVisibleText("Eggs");
	s.deselectAll();
}
}