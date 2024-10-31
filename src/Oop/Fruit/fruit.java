package Oop.Fruit;

public class fruit {
    private String name;
    private String color;


    public fruit(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void printColor() {
        System.out.println(name + " is " + color + ".");
    }
}
