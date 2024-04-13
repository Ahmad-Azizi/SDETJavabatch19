package org.example.class21;

public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver w=new ChromeDriver();
        w.openBrowser();
        w.closeBrowser();
        w.maximizeWindow();
        w.findElement();

        WebDriver f=new FireFoxBrowser();
        f.openBrowser();
        f.closeBrowser();
        f.maximizeWindow();
        f.findElement();

        WebDriver[] webDrivers={new ChromeDriver(),new FireFoxBrowser()};

        for(WebDriver wd: webDrivers){
            wd.openBrowser();
            wd.closeBrowser();
            wd.maximizeWindow();
            wd.findElement();
        }

        //Break till 11:48
    }
}