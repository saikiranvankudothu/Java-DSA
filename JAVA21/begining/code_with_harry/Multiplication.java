package code_with_harry;
import java.util.Scanner;;
public class Multiplication{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter which number table you want:");
        int n = sc.nextInt();
        for(int i=1;i<11;i++){
            System.out.printf("%d X %d = %d\n",n,i,(n*i));
        }
        // scanner.close();
    }
}
