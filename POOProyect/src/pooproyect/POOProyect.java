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
        int option = 0;
        int selector = 0;
        String idAnimator = "";
        String idAnimatedSeries = "";
        Scanner scanner = new Scanner(System.in); 
        
        // AnimatedSeries attributes
        
        String id = "";
        String title = "";
        String synopsis = "";
        String releaseDate = "";
        String genre = "";
        String idDirector = "";
        double rating = 0;
        String originalLanguage = "";
        int seasons = 0;
        int chapters = 0;
        double averageChapterDuration = 0;
        String renderEngine = "";
        String dimension = "";
        
        try{
 
            
            //Director
            ArrayList<Director> directors = Utilities.readDirector("./directors.txt");

            //AnimatedMovie
            ArrayList<AnimatedMovies> animatedMovies = Utilities.readAnimatedMovies("./AnimatedMovies.txt", directors);
            
            //AnimatedSeries
            ArrayList<AnimatedSeries> animatedSeries = Utilities.readAnimatedSeries("./AnimatedSeries.txt", directors);

            //Animatos
            ArrayList<Animator> animators = Utilities.readAnimator("./animators.txt", animatedMovies, animatedSeries);
            
            while(!stop){
                
                // Printing the Menu
                Utilities.printMenu();
                System.out.println("Please choose an option: ");
                option = scanner.nextInt();
                scanner.nextLine();
                
                switch(option){
                    
                    case 1:
                        // Printing directors information
                        System.out.println("\n DIRECTORS INFORMATION");
                        for(Director d: directors){
                            System.out.println("-----------------------");
                            System.out.println(d.toString());
                            System.out.println("-----------------------");
                        }
                        break;
                    
                    case 2:
                        // Printing Animated Series Information
                        System.out.println("\n ANIMATED SERIES INFORMATION");
                        for(AnimatedSeries a: animatedSeries){
                            System.out.println("-----------------------");
                            System.out.println(a.toString());
                            System.out.println("-----------------------");
                        }
                        break;
                        
                    case 3:
                        // Creating a new Animated Series
                        
                        try{
                            Director tempDirector = null;
                        
                            System.out.println("Please type the Animated Series Id");
                            idAnimatedSeries = scanner.nextLine();

                            Validation.validateExistingId(idAnimatedSeries, animatedSeries);

                            System.out.println("Please type the title");
                            title = scanner.nextLine();

                            System.out.println("Please type the synopsis");
                            synopsis = scanner.nextLine();

                            System.out.println("Please type the releaseDate");
                            releaseDate = scanner.nextLine();

                            System.out.println("Please type the genre");
                            genre = scanner.nextLine();

                            System.out.println("Please type the idDirector");
                            idDirector = scanner.nextLine();

                            for(Director d: directors){
                                if(idDirector.equals(d.getId())){
                                    tempDirector = d;
                                }
                            }

                            System.out.println("Please type the rating");
                            rating = scanner.nextDouble();
                            scanner.nextLine();

                            System.out.println("Please type the originalLanguage");
                            originalLanguage = scanner.nextLine();

                            System.out.println("Please type the seasons");
                            seasons = scanner.nextInt();
                            scanner.nextLine();

                            System.out.println("Please type the chapters");
                            chapters = scanner.nextInt();
                            scanner.nextLine();

                            System.out.println("Please type the average chapter duration (min)");
                            averageChapterDuration = scanner.nextDouble();
                            scanner.nextLine();

                            System.out.println("Please type the render engine used");
                            renderEngine = scanner.nextLine();

                            System.out.println("Please type the dimension of the Serie.");
                            dimension = scanner.nextLine();

                            animatedSeries.add(new AnimatedSeries(idAnimatedSeries,title,synopsis,releaseDate,genre,tempDirector,rating,originalLanguage,seasons,chapters,averageChapterDuration,renderEngine,dimension));
                            break;
                        }catch(Exception e){
                            System.out.println("Error: " + e.getMessage());
                            break;
                        }

                    
                    case 4:
                        // Modifing an existing Animated Series

                        try{
                            Animator tempAnimator = null;

                            AnimatedSeries tempAniSeries = null; 
                            System.out.println("Please type the id of the Animated Series to modify.");
                            idAnimatedSeries = scanner.nextLine();

                            for(AnimatedSeries a: animatedSeries){
                                if(idAnimatedSeries.equals(a.getId())){
                                    tempAniSeries = a;
                                    break;
                                }
                            }

                            if(tempAniSeries != null){
                                selector = 0; // Reiniciar selector
                                while(selector != 14){ // Cambiar la condición para salir cuando sea 14

                                    System.out.println("Type what you want to modify of the animated series. ");
                                    Utilities.printChangeAnimatedSeries();
                                    selector = scanner.nextInt();
                                    scanner.nextLine();

                                    switch(selector){

                                        case 1:

                                            // Changing the title
                                            System.out.println("Please type the new title: ");
                                            title = scanner.nextLine();
                                            tempAniSeries.setTitle(title);
                                            break;

                                        case 2:

                                            // Changing the Synopsis
                                            System.out.println("Please type the new synopsis: ");
                                            synopsis = scanner.nextLine();
                                            tempAniSeries.setSynopsis(synopsis);
                                            break;

                                        case 3:

                                            // Changing the release date
                                            System.out.println("Please type the new release date");
                                            releaseDate = scanner.nextLine();
                                            tempAniSeries.setReleaseDate(releaseDate);
                                            break;

                                        case 4:

                                            // Changing the genre
                                            System.out.println("Please type the new genre");
                                            genre = scanner.nextLine();
                                            tempAniSeries.setGenre(genre);
                                            break;

                                        case 5:

                                            // Changing the director
                                            System.out.println("Please type the new id Director ");
                                            idDirector = scanner.nextLine();

                                            for(Director d: directors){
                                                if(idDirector.equals(d.getId())){
                                                    tempAniSeries.setDirector(d);
                                                }
                                            }

                                            break;

                                        case 6:

                                            // Changing the rating
                                            System.out.println("Please type the new rating ");
                                            rating = scanner.nextDouble();
                                            scanner.nextLine();
                                            tempAniSeries.setRating(rating);
                                            break;

                                        case 7:

                                            // Changing the original Language
                                            System.out.println("Please type the new original language");
                                            originalLanguage = scanner.nextLine();
                                            tempAniSeries.setOriginalLanguage(originalLanguage);
                                            break;

                                        case 8:

                                            // Changing the number of seasons
                                            System.out.println("Please type the new number of seasons");
                                            seasons = scanner.nextInt();
                                            scanner.nextLine();
                                            tempAniSeries.setSeasons(seasons);
                                            break;

                                        case 9:

                                            // Changing the number of chapters
                                            System.out.println("Please type the new number of chapters");
                                            chapters = scanner.nextInt();
                                            scanner.nextLine();
                                            tempAniSeries.setChapters(chapters);
                                            break;

                                        case 10:

                                            // Changing the average chapter duration
                                            System.out.println("Please type the new average chapterDuration (min)");
                                            averageChapterDuration = scanner.nextDouble();
                                            scanner.nextLine();
                                            tempAniSeries.setAverageChapterDuration(averageChapterDuration);
                                            break;

                                        case 11:

                                            // Changing the render engine
                                            System.out.println("Please type the new render engine ");
                                            renderEngine = scanner.nextLine();
                                            tempAniSeries.setRenderEngine(renderEngine);
                                            break;

                                        case 12:

                                            // Changing the dimension
                                            System.out.println("Please type the new dimension");
                                            dimension = scanner.nextLine();
                                            tempAniSeries.setDimension(dimension);
                                            break;

                                        case 13:

                                            // Adding an existed animator
                                            boolean found = false;
                                            System.out.println("Please type the id of the animator to add");
                                            idAnimator = scanner.nextLine();

                                            for(Animator a: animators){
                                                if(idAnimator.equals(a.getId())){
                                                    tempAnimator = a;
                                                    tempAniSeries.addAnimator(tempAnimator); // Cambié esto - agregar a la serie, no a la lista de animators
                                                    found = true;
                                                    System.out.println("Animator added successfully!");
                                                    break;
                                                }
                                            }

                                            if(!found){
                                                System.out.println("The typed animator id was not found. ");
                                            }
                                            break; // ¡FALTABA ESTE BREAK!

                                        case 14:
                                            // Salir al menú anterior
                                            System.out.println("Returning to main menu...");
                                            break;

                                        default:
                                            System.out.println("Invalid option. Please try again.");
                                            break;
                                    }
                                }

                            } else {
                                System.out.println("The Animated Series id was not found.");
                            } 
                        } catch(Exception e){
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;
                    
                    case 5:
                        
                        // Creating the report file
                        Utilities.createReport("./systemReport.txt", directors, animatedSeries);
                        break;
                        
                    case 6:
                        
                        // Exit
                        
                        stop = true;
                        break;
                
                }
                
            }
            
        }catch(IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }catch(InputMismatchException e){
            System.out.println("Wrong data type. Please type again. ");
        }
        
        
    }
    
}