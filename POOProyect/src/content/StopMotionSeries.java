
package content;

import pooproyect.Validation;
import staff.Director;

public class StopMotionSeries extends Serie{
    private int fps;
    private String technique;
    private String dimension;
    
public StopMotionSeries(){
    this.fps = 0;
    this.technique = null;
    this.dimension = null;
}

public StopMotionSeries(String id, String title, String synopsis, String releaseDate, String genre, Director director, double rating, String originalLanguage, int seasons, int chapters, double averageChapterDuration, int fps, String technique, String dimension){
    super(id, title, synopsis, releaseDate, genre, director, rating, originalLanguage, seasons, chapters, averageChapterDuration);
    this.setFps(fps);
    this.setDimension(dimension);
    this.setTechnique(technique);
}    
public final void setFps(int fps){
    Validation.validatePositiveNumber(fps);
    this.fps = fps;
}    
public final void setTechnique(String technique){
    Validation.validateText(technique);
    this.technique = technique;
}    
public final void setDimension(String dimension){
    Validation.validateText(technique);
    this.dimension = technique;
}    
public int getFps(){
    return this.fps;
}    
public String getTechnique(){
    return this.technique;
}    
public String getDimension(){
    return this.dimension;
}    
    
@Override
public String toString(){
   String str = super.toString() + "\nNumber of fps: " + this.fps + "\nUsed technique: " + this.technique + "\nDimension: " + this.dimension;
    return str;
}

    @Override
    public double calculateProductionBudget() {
      double costfps = this.getFps() * 1500;
      double costtecnique = 10000;
      if(dimension.equalsIgnoreCase("2D")){
          double costdimension = 10000;
      }
      double costdimension = 15000;
      double budget = costfps+costtecnique+costdimension;
      return budget;
    }
    
    
    
    
    
    
    
}
