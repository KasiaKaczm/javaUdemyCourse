//intrukcja warunkowa if pozwala okreslic ktore czesci kodu maja zostac wykonane , gdy zostanie spełniony warunek

public class InstrukcjaWarunkowaIf {

    public static void main(String[] args) {
        float dzielna = 4.0F;
        float dzielnik = 0;

        if (dzielnik !=0) {
            System.out.println("wynik dzielenia to : " + (dzielna/dzielnik));
        } else {
            System.out.println("prosze podaj inna liczbe");
        }

    }
}
