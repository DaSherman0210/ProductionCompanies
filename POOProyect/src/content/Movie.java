
package content;
import pooproyect.Validation;
import staff.Director;

public class Movie extends AudiovisualContent{
     private int oscarsWon;
     private double earnings;
     private double duration;
     
     //Constructors
     
     public Movie(){
         this.oscarsWon = 0;
         this.earnings = 0;
         this.duration = 0;
     }
     public Movie(String id, String title, String synopsis, String releaseDate, String genre, Director director, double rating, String originalLanguage, int oscarsWon, double earnings, double duration){
     
         super(id, title, synopsis, releaseDate, genre, director, rating, originalLanguage);
         this.oscarsWon = oscarsWon;
         this.earnings = earnings;
         this.duration = duration;
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
     
     //toString
     @Override
     public String toString(){
         String str = super.toString() + "\nOscars won: " + this.oscarsWon + "\nEarnings: " + this.earnings + "\nDuration: " + this.duration;
         return str;
     }
     //Abstract methods heredated
     @Override
     public double calculateTotalDuration(){
         return duration / 60.0;
     }
     @Override
     public double calculateProductionBadget(){
         // Ejemplo de cálculo simple: se asume que el presupuesto
        // es proporcional a las ganancias y premios
        return (earnings * 0.4) + (oscarsWon * 50000);
     }
}
