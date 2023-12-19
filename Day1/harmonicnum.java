package Day1;
import java.util.Scanner;

public class harmonicnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter digit: ");
        int n = sc.nextInt();

        if(n==0){
            System.out.println("cannot be zero");
            return;
        }

        double harmonicValue = 0.0;
        for (int i = 1; i <= n; i++) {
            harmonicValue += 1.0 / i;
        }

        System.out.println(harmonicValue);

    }
}
