package com.kiot1;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Table_blogSpot {
public static void main(String args[]) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://omayo.blogspot.com/");
//	List <WebElement> head=driver.findElements(By.xpath("//table[@id=\"table1\"]//thead/tr/th"));
//	for(WebElement e:head) {
//		System.out.println(e.getText());
//	}
//	List<WebElement> dd=driver.findElements(By.xpath("//table[@id=\"table1\"]//tbody/tr/td"));
//	for(WebElement d:dd) {
//		System.out.println(d.getText());
//	}
//	List<WebElement> dd1=driver.findElements(By.xpath("//table[@id=\"table1\"]//tbody/tr[3]/td"));
//	for(WebElement d:dd1) {
//		System.out.println(d.getText());
//	}
//	WebElement ele=driver.findElement(By.xpath("//table[@id=\"table1\"]//tbody/tr[2]/td[3]"));
//	System.out.println(ele.getText());
//	List<WebElement> dd1=driver.findElements(By.xpath("//table[@id=\"table1\"]//tbody/tr/td[3]"));
//	for(WebElement d:dd1) {
//		System.out.println(d.getText());
//	}
	List<WebElement> r=driver.findElements(By.xpath("//table[@id=\"table1\"]//tbody/tr"));
	int rc=r.size();
	List<WebElement> c=driver.findElements(By.xpath("//table[@id=\"table1\"]//tbody/tr[1]/td"));
	int cc=c.size();
	System.out.println(rc+"\n"+cc);
	List <WebElement> head=driver.findElements(By.xpath("//table[@id=\"table1\"]//thead/tr/th"));
	for(WebElement e:head) {
		System.out.printf("%8s",e.getText()+" ");
	}
	System.out.println();
	for(int i=1;i<=rc;i++){
		for(int j=1;j<=cc;j++){
				WebElement d=driver.findElement(By.xpath("//table[@id=\"table1\"]//tbody/tr["+i+"]/td["+j+"]"));
				System.out.printf("%8s",d.getText()+" ");
		}
		System.out.println();
		}
	driver.quit();
}
}
