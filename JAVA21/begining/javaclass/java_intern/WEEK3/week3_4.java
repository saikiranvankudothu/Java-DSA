class CustomException extends Exception{
    public CustomException(String message){
        super(message);
    }
}
public class week3_4{
    private static void performOperation(int value) throws CustomException{
        if(value <0){
            throw new CustomException("Value cannot be negative");
        }else{
            System.out.println("Operation Successfull.....");
        }
    }

    public static void main(String[] args) {
        try{
            performOperation(-78);
        } catch(CustomException e){
            System.out.println("Caught CustomException:"+ e.getMessage());
        }
        
    }
}