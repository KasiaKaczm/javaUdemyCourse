//struktury pozwalające gromadzić większa ilosc danych

public class Tablice {

    public static void main(String[] args) {
        String [] imiona = new String[3]; //tablice definiujemy stringiem i nawiasami kwadratowymi
        // potem podajemy jej nazwe = new string i ilosc elementów w nawiasie kwadratowym
         imiona[0] = "Bartek"; // 0 to index,numer elementu z tablicy, numerujemy od zera, potem = i zawartosc w ""
        imiona[1] = "Basia";
         imiona[2] = "Michal";

      /*  System.out.println(imiona[0]);
        System.out.println(imiona[1]);
        System.out.println(imiona[2]);*/

        int[] lottoNumbers = new int[] {1,2,3,4,5,6};
        //drugi sposob zadeklarowania elementow w tablicy
      /*  System.out.println(lottoNumbers[0]);
        System.out.println(lottoNumbers[1]);
        System.out.println(lottoNumbers[2]);
        System.out.println(lottoNumbers[3]);
        System.out.println(lottoNumbers[4]);
        System.out.println(lottoNumbers[5]);

        System.out.println(lottoNumbers.length);*/

       /* for (int i=0; i<lottoNumbers.length;i++){
            System.out.println(lottoNumbers[i]);

        }
*/
        System.out.println(lottoNumbers[5]);
    }
}
