
package pooproyect;

public final class Validation {
    
    private Validation(){}
    
    public static void validateTextNumbers(String id){
        if(!id.matches("[0-9 a-z A-Z]+")){
            throw new IllegalArgumentException("The id is invalid.");
        }
    }
    
    public static void validateText(String text){
        if(!text.matches("[a-z A-Z]+")){
            throw new IllegalArgumentException("The text is invalid.");
        }
    }
    
    public static void validatePositiveNumber(int number){
        if(number < 0){
            throw new IllegalArgumentException("The number must be positive.");
        }
    }
    
    public static void validatePositiveDouble(double number){
        if(number < 0){
            throw new IllegalArgumentException("The double number is invalid.");
        }
    }
    
    public static void validateEmail(String email){
        if(!email.matches("[0-9 a-z A-Z @.]+")){
            throw new IllegalArgumentException("The email is invalid.");
        }
    }
    
    
    
}
