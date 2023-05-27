package groupProject2;

public interface WebDrivers {
    /* Provide Implementation for the diagram below. Then create a test class
in which you need to create Objects of ChromeDriver, FirefoxDrive and
SafariDriver classes and see which methods available to them
     */
    void open();
    void close();
    String getTitle();
}
interface ObjectsWebDrivers extends WebDrivers {
    void navigate();
}
interface Screenshot extends ObjectsWebDrivers {
    void getScreenshot();
}
class ChromeDriver implements ObjectsWebDrivers {
    @Override
    public void open() {
        System.out.println("Open ChromeDriver");
    }
    @Override
    public void close() {
        System.out.println("Close ChromeDriver");
    }
    @Override
    public String getTitle() {
        return "Title";
    }
    @Override
    public void navigate() {
        System.out.println("Navigate to URL in ChromeDriver");
    }
}
class FirefoxDriver implements ObjectsWebDrivers {
    @Override
    public void open() {
        System.out.println("Open FirefoxDriver");
    }
    @Override
    public void close() {
        System.out.println("Close FirefoxDriver");
    }
    @Override
    public String getTitle() {
        return "Title";
    }
    @Override
    public void navigate() {
        System.out.println("Navigate to URL in FirefoxDriver");
    }
}
class SafariDriver implements ObjectsWebDrivers {
    @Override
    public void open() {
        System.out.println("Open SafariDriver");
    }
    @Override
    public void close() {
        System.out.println("Close SafariDriver");
    }
    @Override
    public String getTitle() {
        return "Title";
    }
    @Override
    public void navigate() {
        System.out.println("Navigate to URL in SafariDriver");
    }
}
