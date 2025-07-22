import java.util.Scanner;;
public class Multiplication10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter which number table you want:");
        int sum =0;
        int n = sc.nextInt();
        for(int i=10;i>0;i--){
            sum += n*i;
            // System.out.printf("%d X %d = %d\n",n,i,(n*i));
            
        }
        System.out.println(sum);w
        // scanner.close();
    }
}
