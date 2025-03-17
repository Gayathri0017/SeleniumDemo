package com.kiot1;
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Alert_LeafGround {
public static void main(String args[]) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demoqa.com/alerts");
	WebElement a1=driver.findElement(By.xpath("//button[@id=\"alertButton\"]"));
	a1.click();
	Alert alert1=driver.switchTo().alert();
	System.out.println(alert1.getText());
	alert1.accept();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	WebElement a2=driver.findElement(By.xpath("//button[@id=\"timerAlertButton\"]"));
	a2.click();
	wait.until(ExpectedConditions.alertIsPresent());
	Alert alert2=driver.switchTo().alert();
	System.out.println(alert2.getText());
	alert2.accept();
	driver.quit();
	
}
}
