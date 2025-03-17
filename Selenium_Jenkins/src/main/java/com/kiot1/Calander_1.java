package com.kiot1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Calander_1 {
public static void main(String args[]) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
	WebElement ip=driver.findElement(By.xpath("//input[@id=\"datepicker\"]"));
	//ip.sendKeys("08/23/2024");
	ip.click();
	String mnt=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
	String yr=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();
	while((!(mnt.equals("May")) || (!(yr.equals("2026"))))) {
		WebElement btn=driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-e\"]"));
		btn.click();
		mnt=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
		yr=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();
	}
	System.out.println(mnt+"\n"+yr);
	driver.quit();
	
}
}
