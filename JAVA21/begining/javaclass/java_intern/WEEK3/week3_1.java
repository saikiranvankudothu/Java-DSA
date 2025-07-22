import java.util.Scanner;
public class week3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter the number:");
            int num = sc.nextInt();
            int result = 10/num;
            System.out.println("the result:"+result);
        }catch(ArithmeticException ae){
            System.out.println("exception caught cannot be divided by Zero");
        }catch(Exception e){
            System.out.println("Exception is:"+e.getMessage());
        }finally{
            System.out.println("finally block executed!");
            sc.close();
        }
    }
    
}
