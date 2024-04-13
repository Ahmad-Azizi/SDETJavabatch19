package org.example.class21;
/*
Create a WebDriver Interface that will have the following
unimplemented behaviour: openBrowser(), closeBrowser(),
maximizeWindow(), findElement(). Create 2 classes that
implements WebDriver interface: ChromeDriver and
FirefoxDriver.
 */
public interface WebDriver {
    void openBrowser();

    void closeBrowser();
    void maximizeWindow();
    void findElement();
}

class ChromeDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Open Chrome Driver");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close Chrome Driver");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize Chrome Window");
    }

    @Override
    public void findElement() {
        System.out.println("Find Chrome Element");
    }
}

class FireFoxBrowser implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Open Firefox Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close Firefox Browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize Firefox window");
    }

    @Override
    public void findElement() {
        System.out.println("Find Firefox element");
    }
}