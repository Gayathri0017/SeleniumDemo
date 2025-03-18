package com.kiot1;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Ninja_JSE{
public static void main(String args[]) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://tutorialsninja.com/demo/");
	WebElement dd=driver.findElement(By.xpath("(//a[@class=\"dropdown-toggle\"])[1]"));
	click(driver,dd);
	WebElement reg=driver.findElement(By.xpath("//a[text()=\"Register\"]"));
	click(driver,reg);
//	WebElement name=driver.findElement(By.xpath("//input[@id=\"input-firstname\"]"));
//	sendKeys(driver,name,"Gayathri");
//	WebElement ln=driver.findElement(By.xpath("//input[@id=\"input-lastname\"]"));
//	sendKeys(driver,ln,"R");
//	WebElement email=driver.findElement(By.xpath("//input[@id=\"input-email\"]"));
//	sendKeys(driver,email,"gayathri0017@gamil.com");
//	WebElement ph=driver.findElement(By.xpath("//input[@id=\"input-telephone\"]"));
//	sendKeys(driver,ph,"9566930017");
//	WebElement pass=driver.findElement(By.xpath("//input[@id=\"input-password\"]"));
//	sendKeys(driver,pass,"gayathri0017");
//	WebElement cpass=driver.findElement(By.xpath("//input[@id=\"input-confirm\"]"));
//	sendKeys(driver,cpass,"gayathri0017");
//	WebElement ck=driver.findElement(By.xpath("//input[@name=\"agree\"]"));
//	click(driver,ck);
//	WebElement btn=driver.findElement(By.xpath("//input[@class=\"btn btn-primary\"]"));
//	click(driver,btn);
//	WebElement btn1=driver.findElement(By.xpath("//a[@class=\"btn btn-primary\"]"));
//	click(driver,btn1);
	WebElement log=driver.findElement(By.xpath("//a[text()=\"Login\"]"));
	click(driver,log);
	WebElement email=driver.findElement(By.xpath("//input[@id=\"input-email\"]"));
	sendKeys(driver,email,"gayathri0017@gamil.com");
	WebElement pass=driver.findElement(By.xpath("//input[@id=\"input-password\"]"));
	sendKeys(driver,pass,"gayathri0017");
	WebElement logBtn=driver.findElement(By.xpath("//input[@class=\"btn btn-primary\"]"));
	click(driver,logBtn);
	driver.quit();
}
public static void sendKeys(WebDriver driver,WebElement ele,String s) {
	JavascriptExecutor jse=(JavascriptExecutor) driver;
	jse.executeScript("arguments[0].value='"+s+"'",ele);
}
public static void click(WebDriver driver,WebElement ele){
	JavascriptExecutor jse=(JavascriptExecutor) driver;
	jse.executeScript("arguments[0].click()",ele);
}
}
