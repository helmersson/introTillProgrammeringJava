package oop;
import java.util.Scanner;

public class Calculator {
    private double number1;
    private double number2;


    public Calculator(double number1, double number2){
        this.number1 = number1;
        this.number2 = number2;

    }
public void add() {
    System.out.println(number1 + number2);
}

}
