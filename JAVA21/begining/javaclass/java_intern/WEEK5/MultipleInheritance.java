interface features {
    void display();
    void ram();
}
interface price{
    void offerprice();
}
class mobile implements features,price{
    public void display(){
        System.out.println("mobile display is OLED");
    }
    public void ram(){
        System.out.println("Ram availabe 8,12,16");
    }
    public void offerprice(){
        System.out.println("the price starts form 20k only!");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
    mobile newMobile = new mobile();
    newMobile.display();
    newMobile.ram();
    newMobile.offerprice();
}
}
