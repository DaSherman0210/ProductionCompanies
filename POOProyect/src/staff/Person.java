package staff;

public abstract class Person {
    private String id;
    private String name;
    private int age;
    private String nationality;
    private int telephoneNumber;
    private String emailAddress;
    private double salary;
    private int yearsExperience;
    
    public Person(){
        this.id = "";
        this.name = "";
        this.age = 0;
        this.nationality = "";
        this.telephoneNumber = 0;
        this.emailAddress = "";
        this.salary = 0;
        this.yearsExperience = 0;
    }
    public Person(String id, String name, int age, String nationality, int telephoneNumber, String emailAddress, double salary, int yearsExperience){
        this.id = id;
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.telephoneNumber = telephoneNumber;
        this.emailAddress = emailAddress;
        this.salary = salary;
        this.yearsExperience = yearsExperience;
    }
    public final void setId(String id){
        this.id = id;
    }
    public final void setName(String name){
        this.name = name;
    }
    public final void setAge(int age){
        this.age = age;
    }
    public final void setNationality(String nationality){
        this.nationality = nationality;
    }
    public final void setTelephoneNumber(int telephoneNumber){
        this.telephoneNumber = telephoneNumber;
    }
    public final void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }
    public final void setSalary(double salary){
        this.salary = salary;
    }
    public final void setYearsExperience(int yearsExperience){
        this.yearsExperience = yearsExperience;
    }
    public String getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getNationality(){
        return this.nationality;
    }
    public int getTelephoneNumber(){
        return this.telephoneNumber;
    }
    public String getEmailAddress(){
        return this.emailAddress;
    }
    public double getSalary(){
        return this.salary;
    }
    public int getYearsExperience(){
        return this.yearsExperience;
    }
    @Override
    public String toString(){
        String str = "Id: " + this.id + "\nName: " + this.name + "\nAge: " + this.age + "\nNationality: " + this.nationality + 
                "\nTelephone Number: " + this.telephoneNumber + "\nEmail Address: " + this.emailAddress + "\nSalary: " + this.salary +
                "\nYears of experience: " + this.yearsExperience;
        return str;
    }
    public abstract String showTitle();
    public abstract double calculateSalary();
}