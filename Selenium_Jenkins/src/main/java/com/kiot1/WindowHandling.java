package com.kiot1;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class WindowHandling {
public static void main(String args[]) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://demoqa.com/browser-windows");
	WebElement btn=driver.findElement(By.xpath("//button[@id=\"windowButton\"]"));
	btn.click();
	Set<String> cw=driver.getWindowHandles();
	System.out.println("Count Of Window: "+cw.size());
	Iterator<String> it=cw.iterator();
	String cw1=it.next();
	String cw2=it.next();
	String pw=driver.getWindowHandle();
	System.out.println("Parent Window: "+pw);
	System.out.println("Child Window: "+cw2);
	driver.switchTo().window(cw2);
	WebElement ele=driver.findElement(By.xpath("//h1[@id=\"sampleHeading\"]"));
	System.out.println("Child Window Text: "+ele.getText());
	driver.switchTo().window(pw);
	WebElement ele1=driver.findElement(By.xpath("//h1[@class=\"text-center\"]"));
	System.out.println("Parent Window Text: "+ele1.getText());
	driver.quit();
}
}
