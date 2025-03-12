package com.kiot;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class FormPage {
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
	List<String> options=new ArrayList<>();
	for(WebElement ele:op) {
		options.add(ele.getText());
	}
	Collections.sort(options);
	System.out.println("Sorted value");
	for(String val:options) {
		System.out.println(val);
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