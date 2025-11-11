
package content;

import pooproyect.Validation;

public class Scene {
    
    private String id;
    private double duration;
    private String description;
    
    public Scene(){
        this.id = "";
        this.duration = 0;
        this.description = "";
    }
    
    public Scene(String id, double duration, String description){
        this.setId(id);
        this.setDuration(duration);
        this.setDescription(description);
    }
    
    // SETTERS
    
    public final void setId(String id){
        Validation.validateTextNumbers(id);
        this.id = id;
    }
    
    public final void setDuration(double duration){
        Validation.validatePositiveDouble(duration);
        this.duration = duration;
    }
    
    public final void setDescription(String description){
        Validation.validateText(description);
        this.description = description;
    }
    
    // GETTERS
    
    public String getId(){
        return this.id;
    }

    public double getDuration(){
        return this.duration;
    }
    
    public String getDescription(){
        return this.description;
    }
    
    // OVERRIDES
    @Override
    public String toString(){
        String res = "Id: " +  this.getId() + "\n Duration: " + this.getDuration() + "\n Description: " + this.getDescription();
        return res;
    }
    
}
