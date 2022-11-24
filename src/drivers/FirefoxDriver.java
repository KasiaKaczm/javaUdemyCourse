package drivers;

public class FirefoxDriver implements WebDriver {
    @Override
    public void get() {
        System.out.println("Metoda get dla FirefoxDriver");
    }

    @Override
    public void findElementBy() {
        System.out.println("Metoda findElementBy dla FirefoxDriver");
    }
}
