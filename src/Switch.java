//Intrukcja sterujaca switch

public class Switch {

    public static void main(String[] args) {
        String danie = "pizza";

        switch (danie){
            case "Pizza":
                System.out.println("Cena to 22 zl");
                break;
            case "Losos":
                System.out.println("Cena to 35zl");
                break;
            case "Frytki":
                System.out.println("Cena to 9zl");
                break;
            default:
                System.out.println("Nie mamy takiego dania w karcie");
        }
    }
}
