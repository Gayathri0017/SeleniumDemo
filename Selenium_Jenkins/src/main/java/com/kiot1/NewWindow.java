package com.kiot1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
public class NewWindow {
public static void main(String args[]) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.bing.com/");
	driver.switchTo().newWindow(WindowType.TAB);
	driver.navigate().to("https://www.leafground.com/dashboard.xhtml");
	driver.quit();
}
}
