package class23Interface;

public interface WebDriver {
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class ChromeDriver implements WebDriver{
    @Override
    public void openBrowser(){
        System.out.println("open browser");
    }
    @Override
    public void closeBrowser(){
        System.out.println("close browser");
    }
    @Override
    public void maximizeWindow(){
        System.out.println("maximize Window");
    }
    @Override
    public void findElement(){
        System.out.println("find Element");
    }
}
