package Day1;
import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number: ");
        int n=sc.nextInt();

        if(n%2==0){
            System.out.println("it's even");
        }else{
            System.out.println("it's odd");
        }
    }
}
