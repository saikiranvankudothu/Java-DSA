public class fibonacci {
    static int fibo(int n){
        if(n<=1){
            return n;
        }
        else{
            return fibo(n-1)+fibo(n-2);
        }
   
    }
    public static void main(String[] args) {
        int x = 6;
        for(int i=0;i<x;i++){
            System.out.println(fibo(i) +"");
        }
}
}