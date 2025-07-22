public class thistype1 {//'this' can be used to refer current class instance variable
    private int instancevariable;
    public thistype1(int instancevariable){//constructor
        this.instancevariable = instancevariable;
    }
    public void display(){//method
        System.out.println("instance variable is:"+this.instancevariable);
    }
    public void updatevariable(int newValue){//method to update the insatnce variable
        this.instancevariable = newValue;
    }
    public static void main(String[] args) {
        thistype1 obj = new thistype1(67);
        obj.display();
        obj.updatevariable(45);
        obj.display();
    }
}
