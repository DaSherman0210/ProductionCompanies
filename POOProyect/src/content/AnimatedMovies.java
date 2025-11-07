
package content;

import java.util.ArrayList;
import pooproyect.Validation;
import staff.Animator;
import staff.Director;

public class AnimatedMovies extends Movie {
    private String renderEngine;
    private String dimension;
    private ArrayList<Animator> animators;
    
    public AnimatedMovies(){
        this.renderEngine = "";
        this.dimension = "";
    }
    public AnimatedMovies(String id, String title, String synopsis, String releaseDate, String genre, Director director, double rating, String originalLanguage, int oscarsWon, double earnings, double duration, String renderEngine, String dimension){
        super(id, title, synopsis, releaseDate, genre, director, rating, originalLanguage, oscarsWon, earnings, duration);
        this.setRenderEngine(renderEngine);
        this.setDimension(dimension);
        
        // SETTERS
    }
    public final void setRenderEngine(String renderEngine){
        Validation.validateText(renderEngine);
        this.renderEngine = renderEngine;
    }
    public final void setDimension(String dimension){
        Validation.validateText(dimension);
        this.dimension = dimension;
    }
    
        // GETTERS
    
    public String getRenderEngine(){
        return this.renderEngine;
    }
    public String getDimension(){
        return this.dimension;
    }
    public void addAnimators(Animator animator){
        this.animators.add(animator);
        
        // TOSTRING
    }
    @Override
    public String toString(){
        String str = super.toString() + "\nRender engine: " + this.getRenderEngine() + "\nDimension: " + this.getDimension();
        return str;
    }
}
