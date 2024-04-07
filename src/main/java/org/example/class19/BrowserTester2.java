package org.example.class19;

public class BrowserTester2 {
    public static void main(String[] args) {
       Browser [] arr={new Chrome(),new FireFox(),new Safari()};
        for (int i = 0; i < arr.length; i++) {
            Browser b=arr[i];
            b.openBrowser();
            b.openWebsite();
            b.performTesting();
            b.closeBrowser();
        }

        // Break till 1:55


    }
}
