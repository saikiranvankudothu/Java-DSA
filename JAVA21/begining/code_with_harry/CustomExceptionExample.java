class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
class Person {
    private String name;
    private int age;
    public Person(String name, int age) throws InvalidAgeException {
        this.name = name;
        if (age < 0) {
            throw new InvalidAgeException("Age cannot be negative");
        }
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            Person person1 = new Person("John", 25);
            System.out.println("Person: " + person1.getName() + ", Age: " + person1.getAge());
            Person person2 = new Person("Alice", -78);
            System.out.println("Person: " + person2.getName() + ", Age: " + person2.getAge());

        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
