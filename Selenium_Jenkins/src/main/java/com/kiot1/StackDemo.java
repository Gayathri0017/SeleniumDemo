package com.kiot1;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class StackDemo {
public static void main(String args[]) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.bstackdemo.com/");
	WebElement dd=driver.findElement(By.xpath("//select"));
	dd.click();
	List<WebElement> op=driver.findElements(By.tagName("option"));
	String option="Lowest to highest";
	for(int i=0;i<op.size();i++) {
		if(op.get(i).getText().contains(option)) {
			op.get(i).click();
			System.out.println("Clicked");
			break;
		}
	}
}
}
