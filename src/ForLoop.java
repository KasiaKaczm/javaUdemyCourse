//umozliwia cykliczne wykonywanie ciagu instrukcji okreslona liczbe razy
public class ForLoop {

    public static void main(String[] args) {

        int number = 100;

        //i specjalna zmienna sterujaca
      /* for (int i=0; i< number; i=i+2) {
            System.out.println(i);
        }*/

        for (int i=0;i<number;i++){
            if (i%5==0){
                System.out.println(i);
            }
        }
    }
}
