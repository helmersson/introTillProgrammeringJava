package Submission;

import java.util.Scanner;

public class Logics {
    public static void main(String[] args) {
        int charCount = 0;
        int lineCount = 0;
        String input;
        Scanner scan = new Scanner(System.in);

        System.out.println("Skriv in din text här, skriv stop för att avsluta");

        while (true) {
            input = scan.nextLine();

            if (input.equalsIgnoreCase("stop")){
                break;
            }
            charCount += input.length();
            lineCount++;

        }
        System.out.println("Antal rader:" + lineCount);
        System.out.println("Antal tecken:" + charCount);

    }



}
