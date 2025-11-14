
package content;

import java.util.ArrayList;
import staff.Director;

public class LiveActionSeries extends Serie{
    private boolean scriptSupervisor;
    private ArrayList<String> locations;
    
public LiveActionSeries(){
    this.scriptSupervisor = true;
    this.locations = null;
}    
public LiveActionSeries(String id, String title, String synopsis, String releaseDate, String genre, Director director, Double rating, String originalLanguage, int seasons, int chapters, double averageChapterDuration, boolean scriptSupervisor){
super(id, title, synopsis, releaseDate, genre, director, rating, originalLanguage, seasons, chapters, averageChapterDuration);
 this.setScriptSupervisor(scriptSupervisor);
 this.locations = new ArrayList<>();
}
public final void setScriptSupervisor(boolean scriptSupervisor){
    this.scriptSupervisor = scriptSupervisor;
}
public boolean getScriptSupervisor(){
    return this.scriptSupervisor;
}
public void addLocations(String locations){
    
}    
    
@Override    
public String toString(){
    String str = super.toString() + "\nWas there a scriptSupervisor: " + this.scriptSupervisor;
     for(int i=0; i<this.locations.size(); i++){
        str += this.locations.get(i) + "\t";
    }
    return str;
}    

    @Override
    public double calculateProductionBudget() {
        double location = this.locations.size()*100000;
        double actor = 500000;
        double budget = this.getSeasons()*this.getChapters()+location+actor;
        return budget;
    }
    
}    