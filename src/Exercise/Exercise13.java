package Exercise;
import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Ange ett tal:");
        int tal = reader.nextInt();

        if (tal % 2 == 0)
            System.out.println("Talet är ett heltal");
    }
}
