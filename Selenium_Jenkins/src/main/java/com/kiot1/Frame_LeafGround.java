package com.kiot1;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Frame_LeafGround {
public static void main(String args[]) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.leafground.com/frame.xhtml");
	List<WebElement> c=driver.findElements(By.tagName("iframe"));
	System.out.println("Total Frames: "+c.size());
	driver.switchTo().frame(0);
	WebElement btn1=driver.findElement(By.xpath("//button[@id=\"Click\"]"));
	btn1.click();
	System.out.println("Text in 1st Frame: "+btn1.getText());
	driver.switchTo().defaultContent();
	driver.switchTo().frame(2);
	driver.switchTo().frame("frame2");
	WebElement btn2=driver.findElement(By.xpath("//button[@id=\"Click\"]"));
	btn2.click();
	System.out.println("text in inner Frame: "+btn2.getText());
	driver.switchTo().defaultContent();
	driver.quit();
}
}
