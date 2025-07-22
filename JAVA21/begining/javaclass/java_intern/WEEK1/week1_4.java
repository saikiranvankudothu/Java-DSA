public class week1_4 {
    private static int staticvariable = 0;
    private int instancevariable;
    static{
        System.out.println("static block is executed!");
        staticvariable = 5;
    }
    {
        System.out.println("instance block is executed!");
        instancevariable =10;
    }
    public static void staticmethod(){
        System.out.println("static method is executed!");
        System.out.println("static variable:"+staticvariable);
    }
    public void instancemethod(){
        System.out.println("instance method is executed!");
        System.out.println("instance variable:"+instancevariable);
    }
    public static void main(String[] args) {
        week1_4.staticmethod();
        week1_4 obj = new week1_4();
        obj.instancemethod();
    }
}
