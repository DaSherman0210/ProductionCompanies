
package content;
import pooproyect.Validation;

public class Movie extends AudioVisualContent{
     private int oscarsWon;
     private double earnings;
     private double duration;
     
     //Constructors
     
     public Movie(){}
     
     public Movie(String id, String title, String synopsis, String releaseDate, String genre, Director director, double rating, String originalLanguage, int oscarsWon, double earnings, double duration){
     
         super(id, title, synopsis, releaseDate, genre, director, rating, originalLanguage);
         
     
     }
     
     //sets y gets
     
     public final void setOscarsWon(int oscarsWon){
       Validation.validatePositiveNumber(oscarsWon);
       this.oscarsWon = oscarsWon;
     }
     
     public final void setEarnings(double earnings){
     Validation.validatePositiveDouble(earnings);
     this.earnings = earnings;
     }
     
     public final void setDuration(double duration){
     Validation.validatePositiveDouble(duration);
     this.duration = duration;
     }
     
     public int getOscarsWon(){
     return this.oscarsWon;
     }
     
     public double getEarnings(){
     return this.earnings = earnings;
     }
     //Abstract methods heredated
     
     //toString
     
}
