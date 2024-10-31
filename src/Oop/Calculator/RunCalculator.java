package Oop.Calculator;

import java.util.Scanner;


public class RunCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double myNumber1 = Double.parseDouble(scan.nextLine());
        double myNumber2 = Double.parseDouble(scan.nextLine());

        Calculator myCalculator = new Calculator(myNumber1, myNumber2);

        myCalculator.add();
    }
}
