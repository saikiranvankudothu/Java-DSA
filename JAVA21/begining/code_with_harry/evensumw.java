import java.util.Scanner;
public class evensumw{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0,i=0;
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();
        while(i<n){
                sum = sum + i;
                i+=2;
        }
        System.out.println(sum);
    }
}
