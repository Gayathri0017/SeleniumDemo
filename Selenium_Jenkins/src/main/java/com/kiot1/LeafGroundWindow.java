package com.kiot1;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LeafGroundWindow {
public static void main(String args[]) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.leafground.com/window.xhtml");
	WebElement ele=driver.findElement(By.xpath("(//span[@class=\"ui-button-text ui-c\"])[1]"));
	ele.click();
	Set<String> add=driver.getWindowHandles();
	Iterator<String> it=add.iterator();
	String pw=it.next();
	String cw=it.next();
	driver.switchTo().window(cw);
	String expect="Dashboard";
	String act=driver.getTitle();
	if(expect.equals(act)) {
		System.out.println("Window Switched..");
	}
	driver.switchTo().window(pw);
	WebElement ele2=driver.findElement(By.xpath("(//span[@class=\"ui-button-text ui-c\"])[2]"));
	ele2.click();
	Set<String> cnt=driver.getWindowHandles();
	System.out.println("Opened Tabs:"+cnt.size());
	WebElement ele3=driver.findElement(By.xpath("(//span[@class=\"ui-button-text ui-c\"])[3]"));
	for(String a:cnt) {
		if(!(a.equals(pw))) {
			driver.close();
		}
	}
	ele3.click();
	Set<String> add1=driver.getWindowHandles();
	System.out.println("Count after closing child windows: "+add.size());
	WebElement ele4=driver.findElement(By.xpath("(//span[@class=\"ui-button-text ui-c\"])[4]"));
	ele4.click();
	driver.quit();
}
}
