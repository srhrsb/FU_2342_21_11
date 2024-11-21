import java.util.ArrayList;

public class Basket {

    ArrayList<Fruit> fruits = new ArrayList<>();

    public Basket() {

        Fruit banana = new Fruit("Banane", "gelb", 5);
        Fruit apple = new Fruit("Apfel", "rot");

        fruits.add(banana);


        apple.staticMethod(); //statische Methode vom Objekt verwendet

        Fruit.staticMethod(); //statische Methoden können verwendet werden ohne ein
        //Objekt zu erzeugen

        System.out.println(apple.getColor());

    }



}
