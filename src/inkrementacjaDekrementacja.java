public class inkrementacjaDekrementacja{

    public static void main(String[] args) {
        int a = 0;
        System.out.println("Wartość a:" +a);//0
        int b = ++a;
        System.out.println("Wartość b:"+b);//1
        System.out.println("Wartość a:"+a);//1
        int c = a++;
        System.out.println("Wartość c:" +c);//1
        System.out.println("Wartość a:"+a);//2

        //dekrementacja zmniejszenie wartosci o jeden
        int d = 0;
        System.out.println("Wartość d:" +d);//0
        int e = d--;
        System.out.println("Wartość e:" +e);//0
        System.out.println("Wartość d:" +d);//-1
        int f = --d;
        System.out.println("Wartość f:" +f);//-2
        System.out.println("Wartosć d:"+d);//-2
    }
}
