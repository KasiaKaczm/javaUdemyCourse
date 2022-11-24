package identifiers.second;

import identifiers.first.Parent;

public class Child extends Parent {

    //klasa potomna w iinej paczce nie ma dostepu do pol/metod private oraz pol/metod default czuli bez identyfikatora
    public void testIdentifier() {
        System.out.println(first);
        System.out.println(third);

        firstMethod();
        thirdMethod();
    }
}
