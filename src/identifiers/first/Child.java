package identifiers.first;

public class Child extends Parent{

    //klasa potomna w tej samej paczce nie ma dostepu do pol/metod private

    public void testIdentifier(){
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        firstMethod();
        secondMethod();
        thirdMethod();


    }
}
