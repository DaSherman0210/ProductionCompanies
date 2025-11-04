
package content;

import pooproyect.Validation;
import java.util.ArrayList;
import staff.*;

public abstract class AudiovisualContent {
    
    private String id;
    private String title;
    private String synopsis;
    private String releaseDate;
    private String genre;
    private Director director;
    private double rating;
    private String originalLanguage;
    private ArrayList<Actor> cast;
    
    public AudiovisualContent(){
        this.id = "";
        this.title = "";
        this.synopsis = "";
        this.releaseDate = "";
        this.genre = "";
        this.director = null;
        this.rating = 0;
        this.originalLanguage = "";
    }
    
    public AudiovisualContent(String id, String title, String synopsis, String releaseDate, String genre, Director director, Double rating, String originalLanguage){
        this.setid(id);
        this.setTitle(title);
        this.setSynopsis(synopsis);
        this.setReleaseDate(releaseDate);
        this.setGenre(genre);
        this.setDirector(director);
        this.setRating(rating);
        this.setOriginalLanguage(originalLanguage);
    }
    
    // SETTERS
    
    public final void setid(String id){
        Validation.validateTextNumbers(id);
        this.id = id;
    }
    
    public final void setTitle(String title){
        Validation.validateText(title);
        this.title = title;
    }
    
    public final void setSynopsis(String synopsis){
        Validation.validateText(synopsis);
        this.synopsis = synopsis;
    }
    
    public final void setReleaseDate(String releaseDate){
        Validation.validateText(releaseDate);
        this.releaseDate = releaseDate;
    }
    
    public final void setGenre(String genre){
        Validation.validateText(genre);
        this.genre = genre;
    }
    
    public final void setDirector(Director director){
        this.director = director;
    }
    
    public final void setRating(double rating){
        // MISSING THE VALIDATION
        this.rating = rating;
    }
    
    public final void setOriginalLanguage(String originalLanguage){
        Validation.validateText(originalLanguage);
        this.originalLanguage = originalLanguage;
    }
    
    // GETTERS
    
    public String getId(){
        return this.id;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public String getSynopsis(){
        return this.synopsis;
    }
    
    public String getReleaseDate(){
        return this.releaseDate;
    }
    
    public String getGenre(){
        return this.genre;
    }
    
    public Director getDirector(){
        return this.director;
    }
    
    public double getRating(){
        return this.rating;
    }
    
    public String getOriginalLanguage(){
        return this.originalLanguage;
    }
    
    // OTHERS
    
    public void addCast(Actor actor){
        this.cast.add(actor);
    }
    
    // OVERRIDE
    
    @Override
    public String toString(){
        String res = "Id: " + this.getId() + "\n Title: " + this.getTitle() + "\n Synopsis: " + this.getSynopsis() + "\n Release Date: " + this.getReleaseDate() + "\n Genre: " +  this.getGenre() + "\n Director: " + this.getDirector() + "\n Rating: " +  this.getRating() + "\n Originial Language: " + this.getOriginalLanguage();
        return res;
    }
    
    // ABSTRACT
    
    public abstract double calculateTotalDuration();
    public abstract double calculateProductionBadget();
    
}
