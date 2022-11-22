public class UserTest {

    public static void main(String[] args) {

      //  User user = new User();
        User user= new User ("Tomek","Hello");

       /*user.username = "Kasia";
        user.password = "qwerty";*/
        System.out.println(user.username);
        System.out.println(user.password);
        user.sayHello();
    }
}
