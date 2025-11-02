
package content;

import java.util.ArrayList;

public class ProductionCompany {
    
    private int id;
    private String name;
    private String country;
    private String foundationDate;
    private ArrayList<AudiovisualContent> audiovisualContent;
    
    public ProductionCompany(){
        this.id = 0;
        this.name = "";
        this.country = "";
        this.foundationDate = "";
    }
    
    public ProductionCompany(int id, String name, String country, String foundationDate){
        
    }
    
    // SETS
    
    public final void setId(int id){
        
    }
    
    public final void setName(String name){
        
    }
    
    public final void setCountry(String country){
        
    }
    
    public final void setFoundationDate(String foundationDate){
        
    }
    
    // GETS
    
    public int getId(){
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
       
}
