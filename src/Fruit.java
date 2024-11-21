public class Fruit {

    //Eigenschaften -> Variablen die zu diesem Objekt
    //gehören

    private String name;

    private String color;

    private int harvest;


    //Konstruktor erzeugt das Objekt nach dem Bauplan der Klasse
    //Konstruktoren können mehrfach vorhanden sein
    //Bedingung: die Parameter sind unterschiedlich

    public Fruit(String name, String color) {
        this.name = name;
        this.color = color;
        this.harvest = 9;
    }

    public Fruit(String name, String color, int harvest) {
        this.name = name;
        this.color = color;
        this.harvest = harvest;
    }

    public static void staticMethod(){
        System.out.println("Statische Methode in Fruit");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHarvest() {
        return harvest;
    }

    public void setHarvest(int harvest) {
        this.harvest = harvest;
    }
}
