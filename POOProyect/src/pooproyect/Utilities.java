
package pooproyect;

import staff.*;
import content.*;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public final class Utilities {
    
    private Utilities(){};
    
    public static void printMenu(){
        System.out.println("\n\f\f MENU");
        System.out.println("1)Print Scenes ");
        System.out.println("2)Create a new Scene ");
        System.out.println("3)Modify an existing Scene ");
        System.out.println("4)Create Report File ");
        System.out.println("5)End program ");
    }
    
    public static ArrayList<Animator> readAnimator(String filePath){
        
        ArrayList <Animator> animators = new ArrayList<>();
        
        String line = "";
        String id = "";
        String name = "";
        int age = 0;
        String nationality = "";
        int telephoneNumber = 0;
        String emailAddress = "";
        double salary = 0;
        int yearsExperience = 0;
        String animationStyle = "";
        int animatedMovies = 0; 
        String idSerie = "";
        String idMovie = "";
        AnimatedMovies tempMovie;
        AnimatedSeries tempSeries;
        
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            
            reader.readLine();
            
            while((line = reader.readLine())!=null){
                
                String[] parts = line.split(",");
            
                try{
                        if(parts.length >=12){
                            id = parts[0].trim();
                            name = parts[1].trim();
                            age = Integer.parseInt(parts[2].trim());
                            nationality = parts[3].trim();
                            telephoneNumber = Integer.parseInt(parts[4].trim());
                            emailAddress = parts[5].trim();
                            salary = Double.parseDouble(parts[6].trim());
                            yearsExperience = Integer.parseInt(parts[7].trim());
                            animationStyle = parts[8].trim();
                            animatedMovies = Integer.parseInt(parts[9].trim());
                            idSerie = parts[10].trim();
                            idMovie = parts[11].trim();
                            
                            tempMovie = new AnimatedMovies();
                            
                            animators.add(new Animator());
                            
                        }
                        
                        
                    }catch(Exception e){
                        System.out.println("Incomplete data to cretae the object.");
                    }
                
            }
            reader.close();
        }catch(IOException e){
            System.err.println("Error reading the animators file: " + e.getMessage());
        }
        
        
        
    }
    
}
