package Day1;
import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number to find its prime factors: ");
        int number = s.nextInt();

        if (number <= 1) {
            System.out.println("Please enter a number greater than 1.");
        }

        System.out.println("Prime factors are: ");
        computePrimeFactors(number);
    }

    private static void computePrimeFactors(int number) {
        for (int i = 2; i * i <= number; i++) {
            while (number % i == 0) {
                System.out.print(i + " ");
                number /= i;
            }
        }
        if (number > 1) {
            System.out.print(number);
        }
    }
}
