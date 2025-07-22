class BaseException extends Exception{
    public BaseException(String message){
        super(message);
    }
}
class SubException extends BaseException{
    public SubException(String message){
    super(message);
}
}
public class week3_3 {
    public static void main(String[] args) {
    try{
        // throw new BaseException("BaseException");
        throw new SubException("SubException");
    }catch(SubException se){
        System.out.println("Caught SubException:"+se.getMessage());
    }catch(BaseException be){
        System.out.println("Caught BaseException:"+be.getMessage());
    }catch(Exception e){
        System.out.println("Exception caught:"+e.getMessage());
    }finally{
        System.out.println("final block is executed!");
    }
    
}
}
