
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
    
    public static void validateDate(String date){
        if(!date.matches("[a-z A-Z /]+")){
            throw new IllegalArgumentException("The date is invalid.");
        }
    }
    
    public static void validateRating(double rating){
        if(rating < 0 || rating > 10){
            throw new IllegalArgumentException("The rating is from 0 to 10.");
        }
    }
    
    public static void validateAge(int age){
        if(age < 0 || age > 120){
            throw new IllegalArgumentException("The age is invalid.");
        }
    }
    
}
