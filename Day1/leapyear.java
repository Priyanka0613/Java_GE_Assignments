import java.util.Scanner;

public class leapyear {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year (4 digits): ");
        int year = scanner.nextInt();

        if (isValidYear(year)) {
            if (isLeapYear(year)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("Invalid input. Please enter a 4-digit year.");
        }
        scanner.close();
    }

    private static boolean isValidYear(int year) {
        return year >= 1000 && year <= 9999;
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    
}
