package staff;

public class Animator extends Person{
    private String animationStyle;
    private int animatedMovies;
    
    public Animator(){
        this.animationStyle = "";
        this.animatedMovies = 0;
    }
    public Animator(String id, String name, int age, String nationality, int telephoneNumber, String emailAddress, double salary, int yearsExperience, String animationStyle, int animatedMovies){
        super(id, name, age, nationality, telephoneNumber, emailAddress, salary, yearsExperience);
        this.animationStyle = animationStyle;
        this.animatedMovies = animatedMovies;
    }
    public final void setAnimationStyle(String animationStyle){
        this.animationStyle = animationStyle;
    }
    public final void setAnimatedMovies(int animatedMovies){
        this.animatedMovies = animatedMovies;
    }
    public String getAnimationStyle(){
        return this.animationStyle;
    }
    public int getAnimatedMovies(){
        return this.animatedMovies;
    }
    @Override
    public String toString(){
        String str = super.toString() + "\nAnimation style: " + this.animationStyle + "\nAnimated movies: " + this.animatedMovies;
        return str;
    }
    @Override
   public String showTitle(){
       String str = "\nAnimator: " + this.getName();
       return str;
    }
    @Override
    public double calculateSalary(){
        // Ejemplo: salario base + bono por película animada
        double bonusPerMovie = 400;
        return getSalary() + (animatedMovies * bonusPerMovie);
    }
    public String findAnimationStyle(String animationStyle){
        if (this.animationStyle.equalsIgnoreCase(animationStyle)) {
        return getName() + " works with the animation style: " + animationStyle;
    }   else{
        return getName() + " does not use the animation style: " + animationStyle;
    }
  }
}