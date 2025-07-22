public class varargs1 {
    static int sum1(int ...arr){
        int result=0 ;
        for(int a:arr){
            result +=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("the sum of two numbers is :"+sum1(2,4));
        System.out.println("the sum of three numbers is:"+sum1(2,34,67));
    }
}
