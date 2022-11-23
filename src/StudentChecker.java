//Stworz 3 obiekty klasy student.Przypisz wartosci do pol.Stworz tablice i dodaj studentow do tablicy.
// Przejdz przez elementy w tablicy i wywołaj wszystkie metody.

public class StudentChecker {
    public static void main(String[] args) {

        String uczelnia = Student.nazwaUczelni;
         Student.infoUczelnia();
        Student Student1=new Student();

        Student1.imie="Katarzyna";
        Student1.nazwisko="Kaczmarek";
        Student1.nick="KatKaczm";
        Student1.email="kasiak123@gmail.com";
        Student1.numerIndeksu=12345;
        String uczelniaStudenta1= Student1.nazwaUczelni;
        Student1.infoUczelnia();

        Student1.przedstawSie();
        Student1.podajEmail();
        Student1.podajNrIndeksu();
        Student1.zalogujSie();

        Student Student2=new Student();

        Student2.imie="Piotr";
        Student2.nazwisko="Kaczmarek";
        Student2.nick="PKaczm";
        Student2.email="piotrk123@gmail.com";
        Student2.numerIndeksu=44545;

        Student2.przedstawSie();
        Student2.podajEmail();
        Student2.podajNrIndeksu();
        Student2.zalogujSie();

        Student Student3=new Student();

        Student3.imie="Tadeusz";
        Student3.nazwisko="Kaczmarek";
        Student3.nick="TadKaczm";
        Student3.email="Tadekk123@gmail.com";
        Student3.numerIndeksu=68125;

        Student3.przedstawSie();
        Student3.podajEmail();
        Student3.podajNrIndeksu();
        Student3.zalogujSie();

        Student[] studenci=new Student[3];
        studenci[0]=Student1;
        studenci[1]= Student2;
        studenci[2]=Student3;

        for(int i=0;i< studenci.length;i++){
            studenci[i].przedstawSie();
            studenci[i].podajEmail();
            studenci[i].podajNrIndeksu();
            studenci[i].zalogujSie();
        }

}}
