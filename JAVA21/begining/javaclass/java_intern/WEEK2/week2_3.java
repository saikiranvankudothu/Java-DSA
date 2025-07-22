class mobile{
    String mobilemodel;
    public mobile(String mobilemodel){
        this.mobilemodel = mobilemodel;
    }
    public void mobile(){
        System.out.println("you are now using a smart phone:"+mobilemodel);
    }
}
class apps extends mobile{
    String appname;
    public apps(String mobilemodel,String appname){
        super(mobilemodel);
        this.appname = appname;
    }
    public void appdetails(){
        super.mobile();
        System.out.println("The app that running in the mobile is :"+appname);
    }
}
class orders extends apps{
    String Ordername;
    int delivarydate;
    public orders(String mobilemodel,String appname,String Ordername,int delivarydate){
        super(mobilemodel, appname);
        this.Ordername = Ordername;
        this.delivarydate = delivarydate;
    }
    public void Orderdetailes(){
        super.appdetails();
        System.out.println("you had ordered:"+Ordername);
        System.out.println("Estimate delivary date:"+delivarydate+"\nThanks for your order!");

    }
} 
public class week2_3 {
    public static void main(String[] args) {
        orders myorder = new orders("OPPO","Amazon","laptop",01012023);
        myorder.Orderdetailes();
        }
}
