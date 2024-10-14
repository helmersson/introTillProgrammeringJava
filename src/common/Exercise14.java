package common;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Skriv ett tal");
        int num = reader.nextInt();

        if (num % 2 == 0)
            System.out.println(num + " är ett heltal");
        else
            System.out.println(num + " är inte ett heltal");

    }
}
