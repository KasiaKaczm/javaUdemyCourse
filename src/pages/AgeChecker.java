package pages;

import java.util.Scanner;

/*zapytaj użytkownika o wiek.
W przypadku gdy ma mniej niz 18 lat wypisz na ekranie informacje ze nie moze kupic alkoholu.
Gdy ma wiecej niz 18 lat to podziekuj za zakupy*/


public class AgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoj wiek");
        int age = scanner.nextInt();
          if (age >= 18) {
            System.out.println("Dziekujemy za zakupy!Zapraszam ponownie!");
        }else if (age<0) {
              System.out.println("Wprowadz wartosc poprawna");
          }else{
            System.out.println("Nie mozesz kupic alkoholu");


        }
    }
}
