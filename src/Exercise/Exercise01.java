package Exercise;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {

        //  Scanner läser in data från användaren
        Scanner scanner = new Scanner(System.in);

        /*  Ber användaren om input
            Använder double utifall användaren skulle vilja använda decimaler. */
        System.out.print("Skriv ett tal: ");
        double input = scanner.nextDouble();

        //  Beräkna kvadraten på talet
        double square = input * input;

        //  Skriv ut kvadraten av talet
        System.out.println("Kvadraten av " + input + " är: " + square);
        //  avslutar scannern
        scanner.close();
    }
}
