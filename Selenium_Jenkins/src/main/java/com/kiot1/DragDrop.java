package com.kiot1;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class DragDrop {
public static void main(String args[]) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	String clr="rgba(0, 255, 0, 1)";
	driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
	WebElement s1=driver.findElement(By.xpath("//div[@id=\"box6\"]"));
	WebElement d1=driver.findElement(By.xpath("//div[@id=\"box106\"]"));
	Actions ac=new Actions(driver);
	ac.clickAndHold(s1).moveToElement(d1).release().build().perform();
	//ac.dragAndDrop(s1, d1).build().perform();
	String clr1=s1.getCssValue("background-color");
	System.out.println(clr1);
	if(clr.equals(clr1)) {
		System.out.println("Correct");
	}
	else {
		System.out.println("Not correct");
	}
}
}
