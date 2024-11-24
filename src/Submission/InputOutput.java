package Submission;
import java.util.Scanner;

public class InputOutput {

    //  Skapar ett object för logic klassen
    private Logic logic = new Logic();


    public void inputProcess(){

        //  Scanner init
        Scanner scanner = new Scanner(System.in);


        //  True användds för att köra loopen oöndligt
        //  tills du går in i if
        while (true) {
            System.out.print("Skriv in din text här. Skriv 'stop' för att avbryta.");
            String input = scanner.nextLine();

            //  Om addLine är True avslutas loopen
            //  Om addLine är False fortsätter den
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
