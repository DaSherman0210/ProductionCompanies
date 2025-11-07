
package content;

import pooproyect.Validation;
import staff.*;

public class Documentary extends AudiovisualContent{
    
    private String type;
    private String topic;
    private int scenes;
    private Scene mainScene;
    
    public Documentary (){
        this.type = "";
        this.topic = "";
        this.mainScene = null;
    }
    
    public Documentary(String id, String title, String synopsis, String releaseDate, String genre, Director director, double rating, String originalLanguage, String type, String topic, int scenes, String idScene, double duration, String description){
        super(id, title, synopsis, releaseDate, genre, director, rating, originalLanguage);
        this.setType(type);
        this.setTopic(topic);
        this.setMainScene(idScene, rating, synopsis);
    }
    
    // SETTERS
    
    public final void setType(String type){
        Validation.validateText(type);
        this.type = type;
    }
    
    public final void setTopic(String topic){
        Validation.validateText(topic);
        this.topic = topic; 
    }
    
    public final void setScenes(int scenes){
        Validation.validatePositiveNumber(scenes);
        this.scenes = scenes;
    }
    
    public final void setMainScene(String idScene, double duration, String description){
        Validation.validatePositiveDouble(duration);
        Validation.validateText(description);
        this.mainScene = new Scene(idScene, duration, description);
    }
    
    // GETTERS
    
    public String getType(){
        return this.type;
    }
    
    public String getTopic(){
        return this.topic;
    }
    
    public int getScene(){
        return this.scenes;
    }
    
    public Scene getMainScene(){
        return this.mainScene;
    }
    
    // OVERRIDE
    
    @Override
    public String toString(){
        String res = super.toString();
        res += "\n Type: " +  this.getType() + "\n Topic: " + this.getTopic() + "\n Scenes: " + this.getScene() + "\n Main Scene: " + this.getMainScene();
        return res;
    }
    
    @Override
    public double calculateTotalDuration(){
        double totalDuration = this.scenes * this.mainScene.getDuration();
        return totalDuration;
    }
    
    @Override
    public double calculateProductionBadget(){
        return 2;
    }
    
    
}
