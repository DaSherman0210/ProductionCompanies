
package content;

import java.util.ArrayList;
import pooproyect.Validation;
import staff.Animator;
import staff.Director;

public class AnimatedMovies extends Serie{
    private String renderEngine;
    private String dimension;
    private ArrayList<Animator> animators;
    
public AnimatedMovies(){
    this.renderEngine = null;
    this.dimension = null;
    this.animators = new ArrayList<>();
}    
    
public AnimatedMovies(String id, String title, String synopsis, String releaseDate, String genre, Director director, Double rating, String originalLanguage, int seasons, int chapters, double averageChapterDuration, String renderEngine, String dimension){
    super(id, title, synopsis, releaseDate, genre, director, rating, originalLanguage, seasons, chapters, averageChapterDuration);
    this.setRenderEngine(renderEngine);
    this.setDimension(dimension);
}     
public final void setRenderEngine(String renderEngine){
    Validation.validateText(dimension);
    this.renderEngine = renderEngine;
}    
public final void setDimension(String dimension){
    Validation.validateText(dimension);
    this.dimension = dimension;
}    
public String getRenderEngine(){
    return this.renderEngine;
}    
public String getDimension(){
    return this.dimension;
}
  
@Override
public String toString(){
    String str = super.toString() + "\nRender engine: " + this.renderEngine + "\nDimension: " + this.dimension;
    for(int i=0;i<this.animators.size();i++){
        str += this.animators.get(i) + "\t";
    }
    return str;
}

    @Override
    public double calculateProductionBadget() {
        double b = 0;
    return b;
    }



}
