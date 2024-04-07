package org.example.class19;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class E3 {
    public static void main(String[] args) {
        

        WebDriver [] arr= {new ChromeDriver(),new FirefoxDriver(),new EdgeDriver()};

        for (int i = 0; i < arr.length; i++) {
            WebDriver webDriver=arr[i];
            webDriver.navigate().to("https://facebook.com");
        }



    }
}
