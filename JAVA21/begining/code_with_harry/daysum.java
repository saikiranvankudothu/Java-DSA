import java.util.Scanner;
public class daysum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1 to 7 acc to the days in a week:");
        int day = sc.nextInt();
        switch(day){
        case 1:
        System.out.println("1 for the Monday!");
        break;
        case 2:
        System.out.println("2 for the Tuesday!");
        break;
        case 3:
        System.out.println("3 for the Wednesday!");
        break;
        case 4:
        System.out.println("4 for the Thursday!");
        break;
        case 5:
        System.out.println("5 for the FRIDAY!");
        break;
        case 6:
        System.out.println("6 for the Saturday!");
        break;
        case 7:
        System.err.println("7 for the SUNDAY!");
        break;
        default:
        System.out.println("Input Error!");
    }
}
}
