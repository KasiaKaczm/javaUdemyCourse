//najpierw wykonuje kod,nawet gdy warunek nie bedzie spelniony, potem sprawdza warunek

public class DoWhileLoop {

    public static void main(String[] args) {
        int number =21;
        do{
            System.out.println("Moja wartosc to: " +number+ " i jestem mniejsza od 20");
            number++;
        }
        while (number<20);
    }
}
