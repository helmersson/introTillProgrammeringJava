package Exercise;
import java.util.Scanner;


public class Exercise02 {
    public static void main(String[] args) {
        String newLine = System.lineSeparator();

        //baslönen
        double baseSalary = 8000;

        //  Scanner läser in data från användaren
        Scanner scanner = new Scanner(System.in);

        /*  Ber användaren om input
            Använder double utifall användaren skulle vilja använda decimaler. */
        System.out.print("Skriv in totala försäljningsumman: ");

        //  Variablar för att för att spara försäljning och sedan räkna ut provisionen
        double sales = scanner.nextDouble();
        double commission = sales * 0.09;

        //  Beräkna kvadraten på talet
        double totalSalary = baseSalary + commission;

        //  Skriver ut totala lönen
        System.out.println(
                "Eftersom din grundlön är:" + baseSalary + newLine +
                "Du har sålt för:" + sales + newLine +
                "Din provision blir då:" + commission + newLine +
                "Din fullständiga lön blir:" + totalSalary);
        //  avslutar scannern
        scanner.close();
    }
}
