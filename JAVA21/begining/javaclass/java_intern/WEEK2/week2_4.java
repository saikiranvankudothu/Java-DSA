class mobile{
    public void details(){
        System.out.println("The details are shown below");

    }
    public void details(int cost){
        System.out.println("the cost of mobile in $:"+cost);
    }
}
class smartphone extends mobile{
    @Override
    public void details(){
        System.out.println("the details on the right side of the screen!");
    } 
    public void details(String model){
        System.out.println("the smart phone model:"+model);
    }
}


public class week2_4 {
    public static void main(String[] args) {
        smartphone myphone = new smartphone();
        myphone.details();
        myphone.details(15);
        myphone.details("GT NEO3");
    }
}
