public class factorial1 {
    static int fact(int n){
            if (n == 1 || n==0){
                return 1;
            }
            else{
                return n*fact(n-1);
            }
        }
    static int factiter(int n){
            int result = 1;
            for (int i=1;i<=n;i++){
                result *= i;
            }
            return result;
        }
    public static void main(String[] args) {
        int x = 0;
        System.out.println("the factorial of given number is " +fact(x));
        System.out.println("the factorial of given number is " +factiter(x));
    }
}
