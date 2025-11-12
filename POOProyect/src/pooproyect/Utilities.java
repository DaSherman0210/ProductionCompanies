
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
    
    // READ DIRECTOR
    
    public static ArrayList<Director> readDirector(String filePath){
        
        ArrayList<Director> directors = new ArrayList<>();
        
        String line = "";
        String id = "";
        String name = "";
        int age = 0;
        String nationality = "";
        int telephoneNumber = 0;
        String emailAddress = "";
        double salary = 0;
        int yearsExperience = 0;
        int directedMovies = 0;
        
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            
            reader.readLine();
            
            while((line = reader.readLine())!= null){
                
                String[] parts = line.split(",");
                
                try{
                    
                    if(parts.length >=9){
                        
                        id = parts[0].trim();
                        name = parts[1].trim();
                        age = Integer.parseInt(parts[2].trim());
                        nationality = parts[3].trim();
                        telephoneNumber = Integer.parseInt(parts[4].trim());
                        emailAddress = parts[5].trim();
                        salary = Double.parseDouble(parts[6].trim());
                        yearsExperience = Integer.parseInt(parts[7].trim());
                        directedMovies = Integer.parseInt(parts[8].trim());

                        directors.add(new Director(id,name,age,nationality,telephoneNumber,emailAddress,salary,yearsExperience,directedMovies));
                        
                    }else{
                        System.out.println("Incomplete data to create the director object.");
                    }
                    
                }catch(Exception e){
                    System.out.println("Error creating the director object " + e.getMessage());
                }
                
            }
            
        }catch(IOException e){
            System.out.println("Error reading the director file " + e.getMessage());
        }
        
        return directors;
        
    }
    
    // READ ACTOR
    
    public static ArrayList<Actor> readActors(String filePath, ArrayList<AudiovisualContent> audiovisualContent ){
        
        ArrayList<Actor> actors = new ArrayList<>();
        
        String line = "";
        String id = "";
        String name = "";
        int age = 0;
        String nationality = "";
        int telephoneNumber = 0;
        String emailAddress = "";
        double salary = 0;
        int yearsExperience = 0;
        String agency = "";
        int actedMovies = 0;
        boolean isVoiceActor = false;
        String idAudiovisualContent = "";
        
        Actor tempActor;
        
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            
            reader.readLine();
            
            while((line = reader.readLine())!= null){
                
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
                        agency = parts[8].trim();
                        actedMovies =Integer.parseInt(parts[9].trim());
                        isVoiceActor = Boolean.parseBoolean(parts[10].trim());
                        idAudiovisualContent = parts[11].trim();
                        
                        tempActor = new Actor(id,name,age,nationality,telephoneNumber,emailAddress,salary,yearsExperience,agency,actedMovies,isVoiceActor);
                        actors.add(tempActor);
                        
                        for(AudiovisualContent a: audiovisualContent){
                            if(idAudiovisualContent.equals(a.getId())){
                                a.addCast(tempActor);
                            }
                        }
                        
                    }else{
                        System.out.println("");
                    }
                    
                }catch(Exception e){
                    System.out.println("Error creating the actor object " + e.getMessage());
                }
                
            }
            
        }catch(IOException e){
            System.out.println("Error reading the actors file " + e.getMessage());
        }
        
        return actors ;
    }
    
    
    // READ ANIMATORS
    
    public static ArrayList<Animator> readAnimator(String filePath, ArrayList<AnimatedMovies> animatedMovie, ArrayList<AnimatedSeries> animatedSeries){
        
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
        Animator tempAnimator;
        
        // TEMPORAL CLASES
        
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
                            
                            tempAnimator = new Animator(id,name,age,nationality,telephoneNumber,emailAddress,salary,yearsExperience,animationStyle,animatedMovies);
                            animators.add(tempAnimator);
                            
                            for(AnimatedSeries s: animatedSeries){
                                if(idSerie.equals(s.getId())){
                                    s.addAnimator(tempAnimator);
                                    break;
                                }
                            }
                            
                            for(AnimatedMovies m: animatedMovie ){
                                if(idMovie.equals(m.getId())){
                                    m.addAnimator(tempAnimator);
                                    break;
                                }
                            }
                            
                        }
                        
                        
                    }catch(Exception e){
                        System.out.println("Incomplete data to cretae the object.");
                    }
                
            }
            reader.close();
        }catch(IOException e){
            System.err.println("Error reading the animators file: " + e.getMessage());
        }
        return animators;
    }
    
    // PRODUCTION COMPANY
    
    public static ArrayList<ProductionCompany> readProductionCompany(String filePath){
        
        ArrayList<ProductionCompany> productionCompanies = new ArrayList<>();
        
        String line = "";
        String id = "";
        String name = "";
        String country = "";
        String foundationDate = "";
        
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            
            reader.readLine();
            
            while((line = reader.readLine())!=null){
                
                String[] parts = line.split(",");
                
                try{
                
                    if(parts.length >= 4){
                        
                        id = parts[0].trim();
                        name = parts[1].trim();
                        country = parts[2].trim();
                        foundationDate = parts[4].trim();
                        
                        productionCompanies.add(new ProductionCompany(id,name,country,foundationDate));
                        
                    }else{
                        System.out.println("Incomplete data to create the production companies object.");
                    }
                }catch(Exception e){
                    System.out.println("Error creating the object: " + e.getMessage());
                }
            }
            reader.close();
        }catch(IOException e){
            System.out.println("Error reading the production company file: " + e.getMessage());
        }
        return productionCompanies;
    }
    
    // ANIMATED MOVIES
    
    // LIVE ACTION MOVIES
    
    // STOP MOTION MOVIES
    
    // STOP MOTION SERIES
    
    // LIVE ACTION SERIES
    
    // ANIMATED SERIES
    
    // READ DOCUMENTARY
    
    public static ArrayList<Documentary> readDocumentary(String filePath, ArrayList<Director> directors, ArrayList<Scene> scenes){
        
        ArrayList<Documentary> documentary = new ArrayList<>();
        
        String line = "";
        String id = "";
        String title = "";
        String synopsis = "";
        String releaseDate = "";
        String genre = "";
        String idDirector = "";
        double rating = 0;
        String originalLanguage = "";
        String type = "";
        String topic  = "";
        int scene = 0;
        String idMainScene = "";
        
        Documentary tempDocumentary = null;
        Director tempDirector;
        Scene tempScene;
        
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            
            reader.readLine();
            
            while((line = reader.readLine())!=null){
                
                String[] parts = line.split(",");
                
                try{
                   
                    if(parts.length>=12){
                        
                        id = parts[0].trim();
                        title = parts[1].trim();
                        synopsis = parts[2].trim();
                        releaseDate = parts[3].trim();
                        genre = parts[4].trim();
                        idDirector = parts[5].trim();
                        rating = Integer.parseInt(parts[6].trim());
                        originalLanguage = parts[7].trim();
                        type = parts[8].trim();
                        topic = parts[9].trim();
                        scene = Integer.parseInt(parts[10].trim());
                        idMainScene = parts[11].trim();
                        
                        // tempDocumentary = new Documentary(id,title,synopsis,releaseDate,genre,rating,originalLanguage,type,topic,scene);
                        documentary.add(tempDocumentary);
                        
                        tempDirector = null;
                        tempScene = null;
                    
                        for(Director d: directors){
                            if(idDirector.equals(d.getId())){
                                tempDirector = d;
                                tempDocumentary.setDirector(tempDirector);
                                break;
                            }
                        }
                        
                        for(Scene s: scenes){
                            if(idMainScene.equals(s.getId())){
                                tempScene = s;
                                tempDocumentary.setMainScene(idMainScene, rating, idDirector);
                            }
                        }
                        
                        if(tempDirector == null){
                            System.out.println("The director asociated with the documentary was not found.");
                        }
                        
                        if(tempScene == null){
                            System.out.println("The scene asociated with the documentary was not found.");
                        }
                       
                    }
                    else{
                        System.out.println("Incomplete data of the object.");
                    }
                }catch(Exception e){
                    System.out.println("Error creatin the object: " + e.getMessage());
                }
            }
            reader.close();
        }catch(IOException e){
            System.out.println("Error reading the file: " + e.getMessage());
        }
        return documentary;
    
    }
    
    // SCENE
    
    public static ArrayList<Scene> readScene(String filepath){
        
        ArrayList<Scene> scenes = new ArrayList<>();
        
        String line = "";
        String id = "";
        double duration = 0;
        String description = "";
        
        try(BufferedReader reader = new BufferedReader(new FileReader(filepath))){
            
            reader.readLine();
            
            String[] parts = line.split(",");
            
            try{
                
                if(parts.length >= 3){
                    
                    id = parts[0].trim();
                    duration = Double.parseDouble(parts[1].trim());
                    description = parts[2].trim();
                    
                    scenes.add(new Scene(id,duration,description));
                }
                else{
                    System.out.println("Incomplete date to create the scene object.");
                }

            }catch(Exception e){
                System.out.println("Error creating the scene object " + e.getMessage());
            }
            
        }catch(IOException e){
            System.out.println("Error reading the scene file " + e.getMessage());
        }
        
        return scenes;
        
    }
    
}
