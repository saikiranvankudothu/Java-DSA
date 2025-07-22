import java.util.Scanner;
public class week1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coefficient of the Equation:(aX^2+b*X+c=0)");
        System.out.println("enter the coefficient of a:");
        int a = sc.nextInt();
        System.out.println("Enter the coefficient of b:" );
        int b = sc.nextInt();
        System.out.println("Enter the coeffient of c:");
        int c = sc.nextInt();
        double discriminant = b*b-4*a*c;
        if(discriminant>0){
            double root1 = (-b+discriminant)/4*a*c;
            double root2 = (-b-discriminant)/4*a*c;
            System.out.println("Root1 :"+root1);
            System.out.println("Root2"+root2);
            System.out.println("The Equation has two distint roots!");
        }else if(discriminant==0){
            double root = -b/(2*a);
            System.out.println("the equation has two equal roots: "+root);
        }else{
            System.out.println("The equation has no real roots.");
        }
    }
}
