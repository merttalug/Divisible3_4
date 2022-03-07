import java.util.Scanner;

public class Divisible3And4 {
    public static void main(String[] args) {
        int i, k, tot = 0, count = 0;
        double ave = 0;
        boolean isError = false;
        Scanner inp = new Scanner(System.in);

        do {
            System.out.println("Please enter a number that greater than 0: ");
            k = inp.nextInt();
            if (k > 0) {
                isError = false;
            } else {
                isError = true;
            }
        }
        while (isError);
        System.out.println("Numbers up to " + k + " that are divisible by both 3 and 4: ");
        for (i = 0; i <= k; i++) {
            if (i % 3 == 0) {
                if (i % 4 == 0) {
                    count++;
                    tot = tot + i;
                    ave = tot / count;
                    System.out.println(i);
                }
            }
        }

        System.out.println("The Average of these numbers is : " + ave);

    }
}
