package Day1;
import java.util.Scanner;

public class powerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter digit: ");
        int n = sc.nextInt();

        if(n>=31){
            System.out.println("Eneter under 31");
            return;
        }

        int ans=1;
        for(int i=0;i<=n;i++){
            ans=ans*2;
        }
        System.out.println(ans);
    }
}
