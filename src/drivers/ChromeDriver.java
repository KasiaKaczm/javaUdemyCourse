package drivers;

public class ChromeDriver implements WebDriver {
    @Override
    public void get() {
        System.out.println("Metoda get dla ChromeDriver");
    }

    @Override
    public void findElementBy() {
        System.out.println("Metoda findElementBy dla ChromeDriver");
    }
}
