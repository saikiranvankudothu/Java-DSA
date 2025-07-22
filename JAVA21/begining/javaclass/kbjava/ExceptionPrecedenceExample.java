// Base class with a method that declares an exception
class BaseClass {
    void process() throws Exception {
        System.out.println("BaseClass processing...");
        throw new Exception("Exception from BaseClass");
    }
}
//Subclass that extends the base class and overrides the method
class SubClass extends BaseClass {
    @Override
    void process() throws CustomException {
        System.out.println("SubClass processing...");
        throw new CustomException("Custom Exception from SubClass");
    }
}
//Custom exception class
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
// Main class
public class ExceptionPrecedenceExample {
    public static void main(String[] args) {
        BaseClass obj = new SubClass(); // Creating object of SubClass using reference of BaseClass

        try {
            obj.process(); // This will throw the CustomException
        } catch (CustomException e) {
            System.out.println("Caught CustomException: " + e.getMessage());
        } catch (Exception e){
            // This block will not be executed because CustomException is caught above
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
