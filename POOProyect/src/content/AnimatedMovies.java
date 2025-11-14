package content;

import java.util.ArrayList;
import pooproyect.Validation;
import staff.Animator;
import staff.Director;

public class AnimatedMovies extends Movie{
    private String renderEngine;
    private String dimension;
    private ArrayList<Animator> animators;
    
public AnimatedMovies(){
    this.renderEngine = "";
    this.dimension = "";
    this.animators = new ArrayList<>();
}    
    
public AnimatedMovies(String id, String title, String synopsis,String releaseDate,String genre,Director director,double rating,String originalLanguage,int oscarsWon,double earnings, double duration, String renderEngine, String dimension ){
    super(id,title,synopsis,releaseDate,genre,director,rating,originalLanguage,oscarsWon,earnings,duration);
    this.setRenderEngine(renderEngine);
    this.setDimension(dimension);
    this.animators = new ArrayList<>();
}     

// SETTERS

public final void setRenderEngine(String renderEngine){
    Validation.validateText(dimension);
    this.renderEngine = renderEngine;
}    

public final void setDimension(String dimension){
    Validation.validateText(dimension);
    this.dimension = dimension;
}    

// Getters

public String getRenderEngine(){
    return this.renderEngine;
}    

public String getDimension(){
    return this.dimension;
}

public void addAnimator(Animator animator){
    this.animators.add(animator);
}
  
@Override
public String toString(){
    String str = super.toString() + "\nRender engine: " + this.getRenderEngine() + "\nDimension: " + this.getDimension();
    for(int i=0;i<this.animators.size();i++){
        str += this.animators.get(i) + "\t";
    }
    return str;
}

    @Override
public double calculateProductionBudget() {
    double baseCost = animators.size() * 30000;
    double timeCost = getDuration() * 20000;

    double dimensionCost = 0;
    if (dimension.equalsIgnoreCase("3D")) {
        dimensionCost = 500000;
    }

    return baseCost + timeCost + dimensionCost;
}
}