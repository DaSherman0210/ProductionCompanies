
package content;

import pooproyect.Validation;
import java.util.ArrayList;

public class ProductionCompany {
    
    private String id;  
    private String name;
    private String country;
    private String foundationDate;
    private ArrayList<AudiovisualContent> audiovisualContent;
    
    public ProductionCompany(){
        this.id = "";
        this.name = "";
        this.country = "";
        this.foundationDate = "";
    }
    
    public ProductionCompany(int String, String name, String country, String foundationDate){
        this.setId(id);
        this.setName(name);
        this.setCountry(country);
        this.setFoundationDate(foundationDate);
    }
    
    // SETS
    
    public final void setId(String id){
        Validation.validateTextNumbers(id);
        this.id = id;
    }
    
    public final void setName(String name){
        Validation.validateText(name);
        this.name = name;
    }
    
    public final void setCountry(String country){
        Validation.validateText(country);
        this.country = country;
    }
    
    public final void setFoundationDate(String foundationDate){
        Validation.validateDate(foundationDate);
        this.foundationDate = foundationDate;
    }
    
    // GETS
    
    public String getId(){
        return this.id;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getCountry(){
        return this.country;
    }
    
    public String getFoundationDate(){
        return this.foundationDate;
    }
    
    // OTHERS
    
    public void addAudioVisualContent(AudiovisualContent audiovisualContent){
        this.audiovisualContent.add(audiovisualContent);
    }
    
    // OVERRIDE
    
    @Override
    
    public String toString(){
        String res = "Id: " + this.getId() + "\n Name: " + this.getName() + "\n Country: " +  this.getCountry() + "\n Foundation Date: " + this.getFoundationDate(); 
        return res;
    }
    
}
