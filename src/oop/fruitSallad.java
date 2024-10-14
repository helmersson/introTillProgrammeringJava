package oop;

public class fruitSallad {
    public static void main(String[] args) {
        fruit banana = new fruit("banana", "yellow");
        fruit apple = new fruit("apple", "red");
        fruit plum = new fruit("plum", "purple");

        banana.printColor();
        apple.printColor();
        plum.printColor();

    }
}
