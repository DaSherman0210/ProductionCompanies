package pooproyect;

import java.util.Scanner;
import content.*;
import staff.*;
import interfaces.*;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class POOProyect {
    
    public static void main(String[] args) {
        
        
        boolean stop = false;
        Scanner scanner = new Scanner(System.in);  
        
        try{
            
            //ARRAY LIST
            
            //Director
            ArrayList<Director> directors = Utilities.readDirector("./directors.txt");
            
            //Actor
            // ArrayList<Actor> actors = Utilities.readActors("./actors.txt", audiovisualContent);
            
//            //AnimatedMovies
//            ArrayList<AnimatedMovies> animatedMovies = Utilities.readAnimatedMovies("./animatedMovies.txt", directors);
//            
//            //AnimatedSeries
//            ArrayList<AnimatedSeries> animatedSeries = Utilities.readAnimatedSeries("./animatedSeries.txt", directors);
//            
//            //Animator
//            ArrayList<Animator> animators = Utilities.readAnimator("./animators.txt", animatedMovies, animatedSeries);
//            
//            //ProductionCompany
//            ArrayList<ProductionCompany> productionCompanies= Utilities.readProductionCompany("./productionCompany.txt");
//            
//            //LiveActionMovies
//            ArrayList<LiveActionMovies> liveActionMovies = Utilities.readLiveActionMovies("./liveActionMOvies.txt", directors);
//            
//            //StopMotionMovies
//            ArrayList<StopMotionMovies> stopMotionMovies = Utilities.readStopMotionMovies("./stopMoyionMovies.txt", directors);
//            
//            //StopMotionSeries
//            ArrayList<StopMotionSeries> stopMotionSeries = Utilities.readStopMotionSeries("./stopMotionSeries.txt", directors);
//            
//            //LiveActionSeries
//            ArrayList<LiveActionSeries> liveActionSeries = Utilities.readLiveActionSeries("./liveActionSeries.txt", directors);
//            
//            //Scene
//            ArrayList<Scene> scenes = Utilities.readScene("./scenes.txt");
//            
//            //Documentary
//            ArrayList<Documentary> documentaries =Utilities.readDocumentary("./documentary.txt", directors, scenes);
//            
            System.out.println(directors);
            
        }catch(IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }catch(InputMismatchException e){
            System.out.println("Wrong data type. Please type again. ");
        }
        
        
    }
    
}