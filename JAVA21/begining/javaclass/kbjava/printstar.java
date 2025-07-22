import java.util.Scanner;
public class printstar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of stars in 1st row:");
        int num = sc.nextInt();
        for (int i=num;i>0;i--){
            for(int j = num;j>0;j--){
            System.out.print("*\t");}
            System.out.println("\n");
            num -= 1; 
    }
    }
}
