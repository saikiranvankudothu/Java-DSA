class Overloading{
    //method overlaing 
    public void details(){
        System.out.println("no details");
    }
    public void details(int cost){
        System.out.println("the expenses this month $:"+cost);
    }
    public void details(String name){
        System.out.println("the order purchased :"+name);
    }
    //constructor overloading
    public Overloading(){
        System.out.println("this is constructor overloading");
    }
    public Overloading(int num){
        System.out.println("the number given:"+num);
    }
    public Overloading(String str){
        System.out.println("The string given:"+str);
    }
}
public class week2_5 {
    public static void main(String[] args) {
        Overloading obj = new Overloading();
        obj.details();
        obj.details("suit");
        obj.details(23);
        Overloading obj1 = new Overloading();
        Overloading obj2 = new Overloading(45);
        Overloading obj3 = new Overloading("sai");
    }
}
