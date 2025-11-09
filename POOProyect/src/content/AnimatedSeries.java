
package content;

import java.util.ArrayList;
import pooproyect.Validation;
import staff.Animator;
import staff.Director;

public class AnimatedSeries extends Serie{
    private String renderEngine;
    private String dimension;
    private ArrayList<Animator> animators;
    
public AnimatedSeries(){
    this.renderEngine = null;
    this.dimension = null;
    this.animators = null;
}
public AnimatedSeries(String id, String title, String synopsis, String releaseDate, String genre, Director director, Double rating, String originalLanguage, int seasons, int chapters, double averageChapterDuration, String renderEngine, String dimension, Animator animator){
    super(id, title, synopsis, releaseDate, genre, director, rating, originalLanguage, seasons, chapters, averageChapterDuration);
    this.setRenderEngine(renderEngine);
    this.setDimension(dimension);
    this.animators = new ArrayList<>();
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

public void addAnimators(Animator animators){
    
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
