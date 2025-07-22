class cylinder{
    private int radius;
    private int height;
    public void setradius(int radius){
        this.radius = radius;
    }
    public int getradius(){
        return radius;
    }
    public void setheight(int height){
        this.height = height;
    }
    public int getheight(){
        return height;
    }
}
public class accessmodifiers1{
        public static void main(String[] args) {
        cylinder cyn = new cylinder();
        cyn.setradius(12);
        cyn.setheight(23);
        System.out.println(cyn.getradius());
        System.out.println(cyn.getheight());
        
    }

    }
