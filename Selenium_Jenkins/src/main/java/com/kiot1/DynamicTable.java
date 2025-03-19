package com.kiot1;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DynamicTable {
public static void main(String args[]) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://thinking-tester-contact-list.herokuapp.com/");
	WebElement ip1=driver.findElement(By.xpath("//input[@id=\"email\"]"));
	ip1.sendKeys("2k21cse020@kiot.ac.in");
	WebElement ip2=driver.findElement(By.xpath("//input[@id=\"password\"]"));
	ip2.sendKeys("1234567");
	WebElement btn=driver.findElement(By.xpath("//button[@id=\"submit\"]"));
	btn.click();
	String expected="2314567890";
	List<WebElement> contact=driver.findElements(By.xpath("//table[@id=\"myTable\"]//td[5]"));
	for(WebElement e:contact) {
		System.out.println(e.getText());
	}
	int i=1;
	for(WebElement c:contact) {
		if(c.getText().equals(expected)) {
			List<WebElement> row=driver.findElements(By.xpath("//table[@id=\"myTable\"]//tr["+i+"]"));
			for(WebElement r:row) {
				System.out.println(r.getText());
			}
		}
		i++;
	}
//	List<WebElement> s=driver.findElements(By.xpath("//table[@id=\"myTable\"]/tr[1]"));
//	for(WebElement e:s) {
//		System.out.print(e.getText()+" ");
//	}
}
}