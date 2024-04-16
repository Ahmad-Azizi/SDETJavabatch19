package org.example.review8;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class E5 {
    public static void main(String[] args) throws InterruptedException {

        FirefoxDriver chromeDriver=new FirefoxDriver();
        Thread.sleep(1500);
        chromeDriver.get("https://facebook.com");
        Thread.sleep(1500);
        chromeDriver.findElement(By.xpath("//input[@id='email']")).sendKeys("Test");
        Thread.sleep(1500);
        chromeDriver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Test");
        Thread.sleep(1500);
        chromeDriver.quit();
    }
}
