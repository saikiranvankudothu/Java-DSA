public class methods {
    int met(int a,int b){
        int z;
        if(a>b){
            z = a+b;
        }
        else{
            z=(a+b)*5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a =5;
        int b =12;
        methods obj = new methods();
        int c = obj.met(a, b);
        System.out.println(c);
    }
}
