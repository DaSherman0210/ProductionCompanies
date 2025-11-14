package staff;

import java.util.ArrayList;
import pooproyect.Validation;

public class Actor extends Person{
   private String agency;
   private int actedMovies;
   private boolean isVoiceActor;
   private ArrayList<String> awards;
   
   public Actor(){
       this.agency = "";
       this.actedMovies = 0;
       this.isVoiceActor = false;
       this.awards = new ArrayList<>();
   }
   public Actor(String id, String name, int age, String nationality, int telephoneNumber, String emailAddress, double salary, int yearsExperience, String agency, int actedMovies, boolean isVoiceActor){
       super(id, name, age, nationality, telephoneNumber, emailAddress, salary, yearsExperience);
       this.setAgency(agency);
       this.setActedMovies(actedMovies);
       this.setIsVoiceActor(isVoiceActor);
       this.awards = new ArrayList<>();
   }
   public final void setAgency(String agency){
       Validation.validateText(agency);
       this.agency = agency;
   }
   public final void setActedMovies(int actedMovies){
       Validation.validatePositiveNumber(actedMovies);
       this.actedMovies = actedMovies;
   }
   public final void setIsVoiceActor(boolean isVoiceActor){
       this.isVoiceActor = isVoiceActor;
   }
   public String getAgency(){
       return this.agency;
   }
   public int getActedMovies(){
       return this.actedMovies;
   }
   public boolean getIsVoiceActor(){
       return this.isVoiceActor;
   }
   public void addAwards(String awards){
       this.awards.add(awards);
   }
   @Override
   public String toString(){
       String str = super.toString() + "\nAgency: " + this.getAgency() + "\nActed movies: " + this.getActedMovies() + "\nIs he a voice actor? " + this.getIsVoiceActor();
       return str;
   }
   @Override
   public String showTitle(){
       String str = "\nActor: " + this.getName();
       return str;
   }
   @Override
    public double calculateSalary(){
        // Ejemplo: salario base + bono por película + bono si es actor de voz
        double bonusPerMovie = 300;
        double voiceBonus = isVoiceActor ? 1000 : 0;
        return getSalary() + (actedMovies * bonusPerMovie) + voiceBonus;
    }
    public double getActorRating(){
        // Ejemplo: calificación basada en películas y premios
        int awardsCount = awards.size();
        if (actedMovies == 0) return 0;
        return (awardsCount * 2.0 + actedMovies) / 10;
    }
}