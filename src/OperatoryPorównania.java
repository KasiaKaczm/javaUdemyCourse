//porównują elementy równania i zwracają wartość logiczną (true/false)

import java.util.Scanner;

public class OperatoryPorównania {


    /*public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 6;

        boolean result = secondNumber > firstNumber;// true

        System.out.println(result);
        System.out.println(firstNumber > secondNumber); //false
        System.out.println(firstNumber < secondNumber); //true
        System.out.println(firstNumber >= secondNumber); //false
        System.out.println(firstNumber <=secondNumber); //true
        System.out.println(firstNumber == secondNumber); //false
        System.out.println(firstNumber != secondNumber); // true*/

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Prosze podaj pierwwsza liczbe a");
        int firstNumber = scanner.nextInt();
        System.out.println("Prosze podaj druga liczbe b");
        int secondNumber = scanner.nextInt();


        boolean result = secondNumber > firstNumber;// true

        System.out.println("b > a : " + result);
        System.out.println("a > b : " + (firstNumber > secondNumber)); //false
        System.out.println("a < b : " +(firstNumber < secondNumber)); //true
        System.out.println("a >= b : " +(firstNumber >= secondNumber)); //false
        System.out.println("a <= b : " +(firstNumber <=secondNumber)); //true
        System.out.println("a == b : " +(firstNumber == secondNumber)); //false
        System.out.println("a != b : " +(firstNumber != secondNumber)); // true
    }
}