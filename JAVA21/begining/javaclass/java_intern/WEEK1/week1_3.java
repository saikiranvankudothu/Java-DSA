public class week1_3 {
    private int x;
    public week1_3(int x){
        this.x = x;
    }
    public void display(){
        System.out.println("the value of x:"+this.x);
    }
    public week1_3 getobject(){
        return this;
    }
    public week1_3 multiplyby2(){
        this.x = this.x*2;
        return this;
    }

    public static void main(String[] args) {
        week1_3 obj = new week1_3(23);
        obj.display();
        week1_3 newobj = obj.getobject().multiplyby2().getobject();
        obj.display();
        newobj.display();
    }
}
