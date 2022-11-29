package Exceptions;

import java.util.Scanner;

public class ExceptionsCheck {

    //pobierz wiek od uzytkownika,jezeli bedzie mniejszy od zera to wyrzuc wyjatek InvalidAgeException
    //jezeli mamy 18>= to mozemy wypisac ze jestes pelnoletni

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if(age<0) {
            throw new InvalidAgeException("Your age is not valid");
        }
        if (age >=18) {
            System.out.println("Jestes pelnoletni");
        } else {
            System.out.println("Nie jestes pelnoletni");
        }
    }
}
