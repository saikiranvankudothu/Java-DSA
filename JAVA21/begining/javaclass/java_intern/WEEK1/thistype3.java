public class thistype3{//this()' can be used to invoke current class constructor.
    private int value = 23;
    public thistype3(int value ){
        this.value = value;
        System.out.println("parameterized constructor setting value: "+value);
    }
    public thistype3(){
        this(34);
        System.out.println("no-argument constructor!");
    }
    public void display(){
        System.out.println("value:"+ value);
    }
    public static void main(String[] args) {
        thistype3 obj1 = new thistype3();
        obj1.display();
        thistype3 obj2 = new thistype3(100);
        obj2.display();
    }

}