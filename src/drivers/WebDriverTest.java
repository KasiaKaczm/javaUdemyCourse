package drivers;

public class WebDriverTest {
    public static void main(String[] args)  {

        WebDriver driver = getDriver("a");
        driver.get();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();

      /*  FirefoxDriver firefox=new FirefoxDriver();
                firefox.get();
        firefox.findElementBy();
        chrome.findElementBy();
        chrome.findElementBy();
        chrome.findElementBy();
        chrome.findElementBy();
        chrome.findElementBy();*/
    }

    private static WebDriver getDriver(String name) throws NoValidBrowserName {
        if(name.equals("chrome")){
            return new ChromeDriver();
        } else if (name.equals("firefox")){
            return new FirefoxDriver();
        }
        throw new NoValidBrowserName("No valid browser name. ");

    }
}
