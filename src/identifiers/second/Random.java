package identifiers.second;

import identifiers.first.Parent;

public class Random {

    //klasa w innej paczce nie ma dostepu do pol/metod private oraz pol/metod default czuli bez identyfikatora
    //oraz protected (bo nie ma dziedziczenia!)

    public void testIdentifier(){
        Parent parent = new Parent();

        System.out.println(parent.first);

        parent.firstMethod();

    }
}
