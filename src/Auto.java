public class Auto {

    public String marka;
    public String model;
    public Integer rok;
    public Integer przebieg;
    public String wlasciciel;

    public void jedz() {
        System.out.println("Jedz!");
    }
    public void hamuj(){
        System.out.println("Hamuj!");
    }
    public void info (){
        System.out.println("Marka: " + marka);
        System.out.println("Model: "+ model);
        System.out.println("Rok: " + rok);
        System.out.println("Przebieg: " + przebieg);
        System.out.println("Wlasciciel: " + wlasciciel);
    }
}
