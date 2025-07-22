import java.util.Scanner;
public class conditional{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a;
        System.out.println("Enter the subject one marks:");
        int sub1 = sc.nextInt();
        System.out.println("Enter the subject two marks:");
        int sub2 = sc.nextInt();
        System.out.println("Enter the subject three marks:");
        int sub3 = sc.nextInt();
        float avg = (sub1+sub2+sub3)/3.0f;
        if (avg > 40 && sub1>33 && sub2>33 && sub3>33){
            System.out.println("You have Qulaified for the next class!");
        }
        else{
            System.out.println("Better luck next time!");
        }
        
    }
}