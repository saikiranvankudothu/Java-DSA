import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int s = 0,fact = 1;
        System.out.print("enter the factorial you need:");
        int n = sc.nextInt();
        for(int i=1;i<n;i++){
            fact = fact*(i+1);
        }
        System.out.println(fact);
        
    }
}
