import java.util.Scanner;

public class Calculator {

    //napisz program który poprosi użytkownika o dwie liczby, a następnie wykona na nich podstawowe operacje matematyczne

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Proszę podaj pierwwszą liczbę");
        int firstNumber = scanner.nextInt();
        System.out.println("Proszę podaj drugą liczbę");
        int secondNumber = scanner.nextInt();

        int addition = firstNumber + secondNumber;
        System.out.println("Po dodaniu:" + addition);
        int substraction = firstNumber - secondNumber;
        System.out.println("Po odejmowaniu:" + substraction);
        int muliplication = firstNumber * secondNumber;
        System.out.println("Po mnożeniu:" + muliplication);
        float division = firstNumber/secondNumber;
        System.out.println("Po dzieleniu:" + division);
        int mod = secondNumber%firstNumber;
        System.out.println("Modulo:" + mod);

    }
}
