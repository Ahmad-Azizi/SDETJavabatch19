package org.example.class19;

public class Browser {

    void openBrowser(){
        System.out.println("Opening Browser");
    }
    void openWebsite(){
        System.out.println("Loading the website");
    }

    void performTesting(){
        System.out.println("Performing the testing");
    }
    void closeBrowser(){
        System.out.println("Closing the Browser");
    }

}

class Chrome extends Browser{
    void openBrowser(){
        System.out.println("Opening Google Chrome");
    }
    void closeBrowser(){
        System.out.println("Closing the chrome");
    }
}

class FireFox extends Browser{
    void openBrowser(){
        System.out.println("Opening FireFox ");
    }
    void closeBrowser(){
        System.out.println("Closing the FireFox");
    }
}

class Safari extends Browser{

    void openBrowser(){
        System.out.println("Opening Safari ");
    }
    void closeBrowser(){
        System.out.println("Closing the Safari");
    }

}
