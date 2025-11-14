package staff;

import pooproyect.Validation;

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
        this.setId(id);
        this.setName(name);
        this.setAge(age);
        this.setNationality(nationality);
        this.setTelephoneNumber(telephoneNumber);
        this.setEmailAddress(emailAddress);
        this.setSalary(salary);
        this.setYearsExperience(yearsExperience);
    }
    public final void setId(String id){
        Validation.validateTextNumbers(id);
        this.id = id;
    }
    public final void setName(String name){
        Validation.validateText(name);
        this.name = name;
    }
    public final void setAge(int age){
        Validation.validatePositiveNumber(age);
        this.age = age;
    }
    public final void setNationality(String nationality){
        Validation.validateText(nationality);
        this.nationality = nationality;
    }
    public final void setTelephoneNumber(int telephoneNumber){
        Validation.validatePositiveNumber(telephoneNumber);
        this.telephoneNumber = telephoneNumber;
    }
    public final void setEmailAddress(String emailAddress){
        Validation.validateEmail(emailAddress);
        this.emailAddress = emailAddress;
    }
    public final void setSalary(double salary){
        Validation.validatePositiveDouble(salary);
        this.salary = salary;
    }
    public final void setYearsExperience(int yearsExperience){
        Validation.validatePositiveNumber(yearsExperience);
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
        String str = "Id: " + this.getId() + "\nName: " + this.getName() + "\nAge: " + this.getAge() + "\nNationality: " + this.getNationality() + 
                "\nTelephone Number: " + this.getTelephoneNumber() + "\nEmail Address: " + this.getEmailAddress() + "\nSalary: " + this.getSalary() +
                "\nYears of experience: " + this.getYearsExperience();
        return str;
    }
    public abstract String showTitle();
    public abstract double calculateSalary();
}