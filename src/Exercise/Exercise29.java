package Exercise;
import java.util.Scanner;


public class Exercise29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  Läs in timmar avgång
        System.out.print("Enter departure hours: ");
        int depH = scanner.nextInt();

        //  Läs in minuter avång
        System.out.print("Enter departure minutes: ");
        int depMin = scanner.nextInt();

        //  Läs in minuter körtid
        System.out.print("Enter hours of travel time: ");
        int travelH = scanner.nextInt();

        //  Läs in minuter körtid
        System.out.print("Enter minutes of travel time: ");
        int travelMin = scanner.nextInt();

        //  Räkna timmar
        int arrivalH = (depH + travelH + (depMin + travelMin) / 60) % 24;

        //  Räkna minuter
        int arrivalMin = (depMin + travelMin) % 60;

        //  Kontrollera om ny dag
        if (arrivalH < depH || (arrivalH == depH && arrivalMin < depMin)) {
            System.out.println("Arrival is on the next day.");
        }

        System.out.printf("Expected arrival time is %02d:%02d.%n", arrivalH, arrivalMin);

        scanner.close();
    }
}
