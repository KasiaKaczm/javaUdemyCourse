//operatory matematyczne umożliwiają wykonanie podstawowych operacji matematycznych
public class operatoryMatematyczne {

    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 6;
        float thirdNumber =4.0F;

        int addition = firstNumber + secondNumber; //10
        int substraction = firstNumber - secondNumber; //-2
        int muliplication = firstNumber * secondNumber;//24
        float division = thirdNumber/secondNumber;//0,66
        int mod = secondNumber%firstNumber;//ilerazy 4 mieści się w 6 1, reszta 2

       /* System.out.println("Wynik dodawania " + addition);//+
        System.out.println("Odejmowanie" + substraction);//+
        System.out.println("Dzielenie" + division);//+
        System.out.println("Mnożenie" + muliplication);//+
        System.out.println("Modulo:" + mod);*/

        firstNumber+=secondNumber; //firstNumber = firstNumber + secondNumber
        System.out.println("Po dodaniu:" + firstNumber);//10+
        firstNumber-=secondNumber;
        System.out.println("Po odejmowaniu:" + firstNumber);//4+
        firstNumber*=secondNumber;
        System.out.println("Po mnożeniu" +firstNumber);//24+
        firstNumber/=secondNumber;
        System.out.println("Po dzieleniu" +firstNumber);//4+
        firstNumber%=secondNumber;
        System.out.println("Po modulo:" + firstNumber);// 0 r 4+
    }
}
