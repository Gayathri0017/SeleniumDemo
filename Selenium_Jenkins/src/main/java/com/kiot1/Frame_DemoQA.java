package com.kiot1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_DemoQA {
public static void main(String args[]) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://demoqa.com/frames");
WebElement f1=driver.findElement(By.xpath("//iframe[@id=\"frame1\"]"));
driver.switchTo().frame(f1);
WebElement t1=driver.findElement(By.xpath("//h1[@id=\"sampleHeading\"]"));
System.out.println("Text in iframe 1: "+t1.getText());
driver.switchTo().defaultContent();
System.out.println(driver.getCurrentUrl());
driver.switchTo().frame(3);
WebElement t2=driver.findElement(By.xpath("//h1[@id=\"sampleHeading\"]"));
System.out.println("Text in iframe 2:"+t2.getText());
driver.quit();
}
}
