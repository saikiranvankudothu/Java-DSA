import java.util.Scanner;
public class week3_2 {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
    try{
        System.out.println("enter size of the array to create:");
        int size = sc.nextInt();
        if(size <0){
            throw new NegativeArraySizeException("Array size can't be Negative");
        }
        int arr[]= new int[size];
        System.out.println("Array created successfully with size:"+size);
        }catch (NegativeArraySizeException e){
            System.out.println("Exception caught:"+e.getMessage());
        }catch(Exception e){
            System.out.println("Exception caugth:"+e.getMessage());
        }finally{
            System.out.println("final block executed!");
            sc.close();
        }
}
}