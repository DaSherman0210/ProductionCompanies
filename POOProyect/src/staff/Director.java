package staff;

import java.util.ArrayList;


public class Director extends Person{
    private int directedMovies;
    private ArrayList<String> awards;
    
    public Director(){
        this.directedMovies = 0;
        this.awards = new ArrayList<>();
    }
    public Director(String id, String name, int age, String nationality, int telephoneNumber, String emailAddress, double salary, int yearsExperience, int directedMovies){
        super(id, name, age, nationality, telephoneNumber, emailAddress, salary, yearsExperience);
        this.directedMovies = directedMovies;
        this.awards = new ArrayList<>();
    }
    public final void setDirectedMovies(int directedMovies){
        this.directedMovies = directedMovies;
    }
    public int getDirectedMovies(){
        return this.directedMovies;
    }
    public void addAwards(String awards){
        this.awards.add(awards);
    }
    @Override
    public String toString(){
        String str = super.toString() + "Directed movies: " + this.directedMovies;
        return str;
    }
    @Override
    public String showTitle(){
        String str = "\nDirector: " + this.getName();
        return str;
    }
    @Override
    public double calculateSalary(){
        // Ejemplo: salario base + bono por película dirigida + bono por experiencia
        double bonusPerMovie = 500;
        double experienceBonus = getYearsExperience() * 100;
        return getSalary() + (directedMovies * bonusPerMovie) + experienceBonus;
    }
    public double averageFilmsPerYear(){
        if (getYearsExperience() == 0) return 0;
        return directedMovies / getYearsExperience();
    }
}