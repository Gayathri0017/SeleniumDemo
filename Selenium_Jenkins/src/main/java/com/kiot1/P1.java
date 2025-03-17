package com.kiot1;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class P1{
    public static void main(String args[]) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.leafground.com/window.xhtml");
        String parentWindow=driver.getWindowHandle();
        WebElement ele2=driver.findElement(By.xpath("(//span[@class=\"ui-button-text ui-c\"])[3]"));
        ele2.click();
        Set<String> all=driver.getWindowHandles();
        System.out.println("Opened Tabs:"+all.size());
        for (String window:all) {
            if (!window.equals(parentWindow)) {
                driver.switchTo().window(window);
                driver.close();
            }
        }
        driver.switchTo().window(parentWindow);
        Set<String> rW=driver.getWindowHandles();
        System.out.println("Count after closing child windows: "+rW.size());
        driver.quit();
    }
}
