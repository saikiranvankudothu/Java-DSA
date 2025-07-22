import java.util.Random;
import java.util.Scanner;
class numgen implements Runnable{
    public void run(){
        Random random = new Random();
        while(true){
            try{
                int randomNumber = random.nextInt(100);
                System.out.println("gen num is :"+randomNumber);
                if(randomNumber%2 == 0){
                    sqnum square = new sqnum(randomNumber);
                    new Thread(square).start();
                }else{
                    cubegen cube = new cubegen(randomNumber);
                    new Thread(cube).start();

            }
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

    }
    }
}
class sqnum implements Runnable{
    private int num;
    public sqnum(int num){
        this.num = num;
    }
    public void run(){
        int sq = num*num;
        System.out.println("Square of "+num+"is:"+sq);
    }

}
class cubegen implements Runnable{
    private int num;
    public cubegen(int num){
        this.num = num;
    }
    public void run(){
        int cub = num*num*num;
        System.out.println("Cube of "+num+"is:"+cub);
    }

}
public class week4_2 {
    public static void main(String[] args) {
        numgen n = new numgen();
        new Thread(n).start();;
        
    }
    
}
