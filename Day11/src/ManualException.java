class InvalidAgeException extends Exception{
    InvalidAgeException(String msg){
        super(msg);
    }
}

public class ManualException {
    static void checkAge(int age) throws InvalidAgeException{ // to use "throw" we must use "throws"
        if(age<18){
            throw new InvalidAgeException("Age is lesser than 18");
        }
        else{
            System.out.println("Eligible to vote");
        }
    }
    public static void main(String[] args){
        try {
            checkAge(19);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
