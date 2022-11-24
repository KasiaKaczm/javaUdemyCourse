public class Bike implements Vehicle {

    @Override
    public void jazda(int speed) {
        System.out.println("Jadę rowerem z prędkością" + speed);
    }

    @Override
    public void stop() {
        System.out.println("Hamuje rowerem! Naciskam mocno na pedaly");
    }

    @Override
    public String info() {
        return "Rower";
    }
    public void zatankuj(){
        System.out.println("Aby miec duzo sily musze zjesc obiad");
    }
}
