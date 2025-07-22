class Vehicle{
    String brand;
    public Vehicle(String brand) {
        this.brand = brand;
    }
    public void displayinfo(){
        System.out.println("The brand of your Vehicle:"+brand);
    }
}
class car extends Vehicle {
    String model;
    String cost;
    public car(String brand,String model,String cost){
        super(brand);
        this.model = model;
        this.cost = cost;
    }
    public void displayinfo(){
        super.displayinfo();
        System.out.println("The model:"+model);
        System.out.println("The cost:"+cost);
    }
}
public class week2_2 {
    public static void main(String[] args) {
        System.out.println("Welcome to the Online Vehicle mart!");
        car mycar = new car("TATA","Punch","5Lakhs");
        mycar.displayinfo();
    }
    
}
