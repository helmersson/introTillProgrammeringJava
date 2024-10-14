package common;
import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ange det första talet:");
        double tal1 = scanner.nextDouble();

        System.out.println("Ange det andra talet:");
        double tal2 = scanner.nextDouble();

        if (tal1 > 2 * tal2)
            System.out.println("För stort");
        else
            System.out.println("Inte för stort");

    scanner.close();
    }
}
