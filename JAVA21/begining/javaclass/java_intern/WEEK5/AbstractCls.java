// package WEEK5;
interface Eating{
    void eat();
}
abstract class Animal{
    String name;
    Animal(String name){
        this.name = name;
    }
    abstract void makesound();
}
class Dog extends Animal implements Eating{
    Dog(String name){
        super(name);
    }
    public void eat(){
        System.out.println(name+" is Eating bone!");
    }
    public void makesound(){
        System.out.println(name+" says woof!");
    }
}
class Cat extends Animal implements Eating{
    Cat(String name){
        super(name);
    }
    public void eat(){
        System.out.println(name+" is Eating fish!");
    }
    public void makesound(){
        System.out.println(name +" says meow!");
    }
}
public class AbstractCls {
    public static void main(String[] args) {
        
    Dog dog = new Dog("Buddy");
    Cat cat = new Cat("cuty");
    dog.eat();
    cat.eat();
    dog.makesound();
    cat.makesound();
    }
}
