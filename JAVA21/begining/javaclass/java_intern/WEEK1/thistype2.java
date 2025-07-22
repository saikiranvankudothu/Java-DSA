public class thistype2{//this' can be used to invoke current class method (implicitly)
    public void method1(){
        System.out.println("This is method 1");
        this.method2();
        System.out.println("method 1 exit!");
    }
    public void method2(){
        System.out.println("this is method2");
    }
    public static void main(String[] args) {
        thistype2 obj = new thistype2();
        obj.method1();
        obj.method2();
    }
}