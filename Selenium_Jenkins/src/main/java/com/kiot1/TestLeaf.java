package com.kiot1;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class TestLeaf{
public static void main(String args[]){
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.leafground.com/select.xhtml;jsessionid=node01uuxh29nf16yk155f9zy98uy928911379.node0");
	driver.findElement(By.xpath("//select[@class=\"ui-selectonemenu\"]")).sendKeys("Selenium");
	driver.navigate().to("https://www.leafground.com/radio.xhtml");
	WebElement btn=driver.findElement(By.xpath("//*[@id=\"j_idt87:console1\"]/tbody/tr/td[1]/label"));
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].click()",btn);
	driver.navigate().to("https://www.leafground.com/checkbox.xhtml");
	WebElement ele=driver.findElement(By.xpath("(//div[@class=\"ui-chkbox-box ui-widget ui-corner-all ui-state-default\"])[3]"));
	Actions a=new Actions(driver);
	a.moveToElement(ele).click().perform();
	driver.navigate().to("https://www.leafground.com/drag.xhtml");
	WebElement drag=driver.findElement(By.xpath("//div[@id='form:conpnl']"));
	a.clickAndHold(drag).moveByOffset(300, 0).release().build().perform();
	WebElement src=driver.findElement(By.xpath("//div[@id=\"form:drag\"]"));
	WebElement des=driver.findElement(By.xpath("//div[@id=\"form:drop\"]"));
	a.dragAndDrop(src, des).build().perform();
	WebElement drop=driver.findElement(By.xpath("//div[@id=\"form:drop_content\"]"));
	System.out.println(drop.getText());
    }
}
