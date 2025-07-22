import java.util.Scanner;
public class marks{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the marks out of 100!");
        System.out.println("enter the eng marks:");
        int s1 = s.nextInt();
        System.out.println("enter the math marks:");
        int s2 = s.nextInt();
        System.out.println("enter the hindi marks:");
        int s3 = s.nextInt();
        System.out.println("enter the science marks:");
        int s4 = s.nextInt();
        System.out.println("enter the social marks:");
        int s5 = s.nextInt();
        float total = (s1+s2+s3+s4+s5);
        float per = (total/500.0f)*100;
        System.out.println("the percentile of the given student is: "+per+"%");

    }
}
