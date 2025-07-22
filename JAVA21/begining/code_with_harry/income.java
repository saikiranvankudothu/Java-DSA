import java.util.Scanner;
public class income {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float tax=0 ;
    System.out.println("Enter the salary to calculate for the income tax in LAKHS:");
    float income = sc.nextFloat();
    if (income < 2.5){
        tax += 0;
    }
    if (income >2.5 && income <= 5.0 ){
        tax += 0.05*(income-2.5f);
    }
    if (income >5.0 && income <= 10.0 ){
        tax += 0.2*(income-5f);
    }
    if (income > 10.0 ){
        tax += 0.3*(income-10f);
    }
    System.out.println("Tax you need to pay:"+tax);
}
}
