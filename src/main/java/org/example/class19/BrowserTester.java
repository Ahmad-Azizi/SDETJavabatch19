package org.example.class19;

public class BrowserTester {
    public static void main(String[] args) {
        Chrome chrome=new Chrome();
        chrome.openBrowser();
        chrome.openWebsite();
        chrome.performTesting();
        chrome.closeBrowser();

        FireFox fireFox=new FireFox();
        fireFox.openBrowser();
        fireFox.openWebsite();
        fireFox.performTesting();
        fireFox.closeBrowser();

        Safari safari=new Safari();
        safari.openBrowser();
        safari.openWebsite();
        safari.performTesting();
        safari.closeBrowser();
    }
}
