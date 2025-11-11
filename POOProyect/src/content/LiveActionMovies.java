
package content;

import java.util.ArrayList;
import staff.Director;

public class LiveActionMovies extends Movie{
    //Attrubites 
    private boolean scriptSupervisor;
    private ArrayList<String> locations;
    
    //Constructors
    public LiveActionMovies (){
    this.scriptSupervisor = false;
    this.locations = new ArrayList<String>();
    }
    
    public LiveActionMovies (String id, String title,  String synopsis, String releaseDate, String genre, Director director, double rating, String originalLanguage, int oscarsWon, double earnings, double duration, boolean scriptSupervisor){
    
        super(id, title, synopsis, releaseDate, genre, director, rating, originalLanguage, oscarsWon, earnings, duration);
        this.setScriptSupervisor(scriptSupervisor);
        this.locations = new ArrayList<String>();
    }
    
    //Set and Gets
    public final void setScriptSupervisor(boolean scriptSupervisor){
        this.scriptSupervisor = scriptSupervisor;
    }
    
    public boolean getScriptSupervisor(){
    return this.scriptSupervisor;
    }
    
    //Unique methods 
    public void addLocations(String location){
    this.locations.add(location);
    }
    
    //toString
    @Override
    public String toString(){
        String str = super.toString() + "\nScript Supervisor: " + this.scriptSupervisor + "\nLocations: ";
         for(int i=0;i<this.locations.size();i++){
        str += this.locations.get(i) + "\t";}
    return str;
    }
    
    //Abstract method overwritten
    @Override
    public double calculateProductionBudget(){
    double a = 0;
    return a;
    }
    
}
