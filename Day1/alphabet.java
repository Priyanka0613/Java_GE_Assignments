package Day1;
import java.util.Scanner;

public class alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter alphabet: ");
        char alpha = sc.next().charAt(0);

        if(alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'o' || alpha == 'u' || alpha == 'A' || alpha == 'E' || alpha == 'I' || alpha == 'O' || alpha == 'U'){
            System.out.println("yes vowel");
        }else{
            System.out.println("not a vowel");
        }
    }
}
