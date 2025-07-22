public class method_overloading2 {
    static void meter(){
            System.out.println("good morning ");
        }
        static void meter(int a){
            System.out.println("good morning "+a);
        }
        static void meter(int a, int b){
            System.out.printf("good morning %d and %d ",a,b);
        }
    public static void main(String[] args) {
        meter();
        meter(2);
        meter(8, 5);
    }
}
