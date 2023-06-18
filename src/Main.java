// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        SingletonEx ex = SingletonEx.getSingletonEx("Some value");
        SingletonEx ex1 = SingletonEx.getSingletonEx("Some other value");

        //true
        System.out.println(ex == ex1);
        //Some value
        System.out.println(ex.getValue());
        //Some value
        System.out.println(ex1.getValue());
    }
}
