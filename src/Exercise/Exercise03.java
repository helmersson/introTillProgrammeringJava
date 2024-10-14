package Exercise;
import java.util.Scanner;


public class Exercise03 {
    public static void main(String[] args) {
        String newLine = System.lineSeparator();

        //  Scanner läser in data från användaren
        Scanner scanner = new Scanner(System.in);

        /*  Ber användaren om input
            Använder double utifall användaren skulle vilja använda decimaler. */
        System.out.print("Skriv in antalet timmar du vill räkna ut: ");
        double h = scanner.nextDouble();

        //  Beräkna kvadraten på talet
        double m = h * 60;
        double s = m * 60;

        //  Skriv ut kvadraten av talet
        System.out.println(
                "Antal timmar:" + h + newLine +
                "Antal minuter:" + m + newLine +
                "Antal sekunder:" + s + newLine
        );
        //  avslutar scannern
        scanner.close();
    }
}
/* 0
 Skapa ett program som läser in antal timmar, beräknar och skriver ut hur mycket det
blir omvandlat till minuter resp sekunder.
 */