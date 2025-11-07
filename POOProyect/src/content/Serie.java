
package content;

import staff.Director;

public abstract class Serie extends AudiovisualContent{
   private int seasons;
   private int chapters;
   private double averageChapterDuration;
   
public Serie(){
    this.seasons = 0;
    this.chapters = 0;
    this.averageChapterDuration = 0;
   }

public Serie(String id, String title, String synopsis, String releaseDate, String genre, Director director, Double rating, String originalLanguage, int seasons, int chapters, double averageChapterDuration){
    super(id, title, synopsis, releaseDate, genre, director, rating, originalLanguage);
    this.setSeasons(seasons);
    this.setChapters(chapters);
    this.setAverageChapterDuration(averageChapterDuration);
}
public final void setSeasons(int seasons){
    this.seasons = seasons;
}
public final void setChapters(int chapters){
    this.chapters = chapters;
}
public final void setAverageChapterDuration(double averageChapterDuration){
    this.averageChapterDuration = averageChapterDuration;
}
public int getSeasons(){
    return this.seasons;
}
public int getChapters(){
    return this.chapters;
}
public double getAverageChapterDuration(){
    return this.averageChapterDuration;
}

@Override
public String toString(){
    String str = super.toString() + "\nNumber of seasons: " + this.seasons + "\nNumber of chapters: " + this.chapters + 
                "\nAverage of chapter duration: " + this.averageChapterDuration;
    return str;
}

    @Override
    public double calculateTotalDuration() {
        double a = 0;
    return a;
    }

    @Override
    public double calculateProductionBadget() {
        double b = 0;
    return b;
    }

}
