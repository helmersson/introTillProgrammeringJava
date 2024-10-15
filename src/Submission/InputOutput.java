package Submission;
import java.util.Scanner;

public class InputOutput {
    private Logic logic = new Logic();

    public void inputProcess(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv in din text här. Skriv stop för att avbryta");

        String input;
        while (!(input = scanner.nextLine()).equalsIgnoreCase("stop")){
            logic.addLine(input);
        }
        scanner.close();
        logic.printResult();
    }


}
