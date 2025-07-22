class Animal{
    String sound = "generic animal sound!";
    public Animal(){
        System.out.println("this is the constructor of the Animal class");
    }
    public void makesound(){
        System.out.println("animal makes a sound:"+sound);
    }
}
class dog extends Animal{
    String breed;
    public dog(String breed){
        super();
        this.breed = breed;
        System.out.println("constructor of dog class with breed "+breed);
    }
    public void makesound(){
        super.makesound();
        System.out.println("dog barks!");
    }
    public void displaybreed(){
        System.out.println("Breed:"+breed);
    }
}

public class week2_1 {
    public static void main(String[] args) {
        System.out.println("hello");
        dog DOG = new dog("Labrador");
        DOG.displaybreed();
        DOG.makesound();
    }
}
