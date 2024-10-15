package Submission;
import java.util.Scanner;

public class InputOutput {
    //  Skapar ett object för logic klassen
    private Logic logic = new Logic();

    //  Input från användare
    public void inputProcess(){
        //  Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv in din text här. Skriv stop för att avbryta");

        String input;
        //  Loop som körs tills att ordet stop skrivs
        while (!(input = scanner.nextLine()).equalsIgnoreCase("stop")){
            logic.addLine(input);
        }

        //  Stänger scannern för att spara resurser
        scanner.close();
        //  Skriver ut resultat när loopen avslutas
        logic.printResult();
    }

}
