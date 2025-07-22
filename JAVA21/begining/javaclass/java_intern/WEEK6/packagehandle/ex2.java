import p1.MyPackageClass;
import p1.subpackage.SubPackageclass;

public class ex2 {
    public static void main(String[] args) {
        MyPackageClass obj1 = new MyPackageClass();
        obj1.displayMessage();
        SubPackageclass obj2 = new SubPackageclass();
        obj2.displayMessage();
    }
    
}
