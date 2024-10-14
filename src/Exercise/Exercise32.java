package Exercise;

public class Exercise32 {
   /* public static void main(String[] args) {
        int n = 100, i = 1;
        System.out.println("Lista av heltal mellan 1 och 100");
        while (i<n)
        {
            if (i % 2 == 0)
            {
                System.out.print(i+" ");
            }
         i++;
        }
    } */


    public static void main(String[] args) {
        int n = 100;
        System.out.println("Lista av heltal mellan 1 och 100 ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

    }
}
