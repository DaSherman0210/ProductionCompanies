
package content;

import pooproyect.Validation;
import staff.Director;

public class StopMotionMovies extends Movie {
    private int fps;
    private String technique;
    private String dimension;
    
    public StopMotionMovies(){
        this.fps = 0;
        this.technique = "";
        this.dimension = "";
    }
    public StopMotionMovies(String id, String title, String synopsis, String releaseDate, String genre, Director director, double rating, String originalLanguage, int oscarsWon, double earnings, double duration, int fps, String technique, String dimension){
        super(id, title, synopsis, releaseDate, genre, director, rating, originalLanguage, oscarsWon, earnings, duration);
        this.setFps(fps);
        this.setTechnique(technique);
        this.setDimension(dimension);
    }
    
     // SETTERS
    
    public final void setFps(int fps){
        Validation.validatePositiveNumber(fps);
        this.fps = fps;
    }
    public final void setTechnique(String technique){
        Validation.validateText(technique);
        this.technique = technique;
    }
    public final void setDimension(String dimension){
        Validation.validateText(dimension);
        this.dimension = dimension;
    }
    
    // GETTERS 
    
    public int getFps(){
        return this.fps;
    }
    public String getTechnique(){
        return this.technique;
    }
    public String getDimension(){
        return this.dimension;
    }
    // TOSTRING
    @Override
    public String toString(){
        String str = super.toString() + "\nFps: " + this.getFps() + "\nTechnique: " + this.getTechnique() + "\nDimension: " + this.getDimension();
        return str;
    }
    @Override
public double calculateProductionBudget() {
    double fpsCost = fps * 2000;
    double timeCost = getDuration() * 30000;

    double techniqueCost = 0;
    if (technique.equalsIgnoreCase("claymation")) {
        techniqueCost = 400000;
    } else if (technique.equalsIgnoreCase("puppet")) {
        techniqueCost = 250000;
    }

    return fpsCost + timeCost + techniqueCost;
}

}
