package Submission;
import java.util.Scanner;

public class InputOutput {

    //  Skapar ett object för logic klassen
    private Logic logic = new Logic();

    //  Input från användare
    public void inputProcess(){

        //  Scanner
        Scanner scanner = new Scanner(System.in);

        //  Loop som körs tills att ordet stop skrivs
        while (true) {
            System.out.print("Skriv in din text här. Skriv 'stop' för att avbryta.");
            String input = scanner.nextLine();

            // Skicka texten till logik-klassen för bearbetning
            if (logic.addLine(input)) {
                break;
            }
        }

        //  Stänger scannern då den inte behövs längre
        //  kör printResult funktionen i logic klassen
        scanner.close();
        logic.printResult();
    }

}
