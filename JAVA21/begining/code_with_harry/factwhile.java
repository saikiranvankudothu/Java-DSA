import java.util.Scanner;
public class factwhile{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        System.out.print("Enter the factorial u need:");
        int n = sc.nextInt();
        while(n>0){
            fact = fact*n;
            n--;
        }
        System.out.println(fact);
    }
} 