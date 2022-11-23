//Stworz klase bazowa App-zawiera pole name i metode appInfo,dodaj konstruktor do ktorego przekazesz wartosc name
//stworz klasy potomne AndroidApp i IphoneApp - zawiera metode runAndroidApp/runIphoneApp

public class AppChecker {

    public static void main(String[] args) {
        AndroidApp  android= new AndroidApp("Calculator");
        android.appInfo();
        android.runAndroidApp();

        IphoneApp iphoneApp = new IphoneApp("Calculator");
        iphoneApp.appInfo();;
        iphoneApp.runIphoneApp();


    }
}
