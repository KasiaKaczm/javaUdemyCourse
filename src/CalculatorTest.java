import java.util.Scanner;

public class CalculatorTest {

    //napisz program który poprosi użytkownika o dwie liczby, a następnie wykona na nich podstawowe operacje matematyczne

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Prosze podaj pierwwsza liczbe");
        int firstNumber = scanner.nextInt();
        System.out.println("Prosze podaj druga liczbe");
        int secondNumber = scanner.nextInt();

        Calculator calculator = new Calculator();

        int addition = calculator.add(firstNumber, secondNumber);
        System.out.println("Po dodaniu:" + addition);
        int substraction = calculator.sub(firstNumber, secondNumber);
        System.out.println("Po odejmowaniu:" + substraction);
        int muliplication = calculator.mult(firstNumber,secondNumber);
        System.out.println("Po mnozeniu:" + muliplication);
        float division = calculator.div(firstNumber,secondNumber);
        System.out.println("Po dzieleniu:" + division);
        int mod = calculator.mod(secondNumber,firstNumber);
        System.out.println("Modulo:" + mod);

    }
}
