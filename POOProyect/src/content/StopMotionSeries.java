
package content;

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
public StopMotionSeries(String id, String title, String synopsis, String releaseDate, String genre, Director director, Double rating, String originalLanguage, int seasons, int chapters, double averageChapterDuration, int fps, String technique, String dimension){
    super(id, title, synopsis, releaseDate, genre, director, rating, originalLanguage, seasons, chapters, 0);
    
    
    
}    
public final void setFps(int fps){
    this.fps = fps;
}    
public final void setTechnique(String technique){
    this.technique = technique;
}    
public final void setDimensio(String dimension){
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
    
    
    
    
    
    
    
}
