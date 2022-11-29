package Exceptions;

import drivers.ChromeDriver;
import drivers.FirefoxDriver;
import drivers.WebDriver;

public class ExceptionExample {

    public static void main(String[] args) {

     /*   int [] numbers = new int[2];
        numbers[0]=1;
        numbers[1]=3;
//dlugosc tablica wynosi 2 jesli odwolamy sie do 2 go elementu w tablicy to
// musielibysmy uzyc 2 i odwolac do 3 elementu a to jest niemozliwe bo tablica ma 2 el
        //w petli moze byc tylko minejsze nie mniejsze lub rowne
        for (int i=0; i< numbers.length;i++){
            System.out.println(numbers[i]);
        }*/

        WebDriver driver = getDriver("sdgse");
        driver.get();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
    }

    private static WebDriver getDriver(String name) {
        if(name.equals("chrome")){
            return new ChromeDriver();
        } else if (name.equals("firefox")){
            return new FirefoxDriver();
        }
        return null;
    }
}
