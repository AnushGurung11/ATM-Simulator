/*
This Class will contain the Person details with their Personal Information
 */


public class Person {
    //TODO Creating the instance variables
    //TODO Creating the getter and setter methods
    //TODO Create the constructor of the class

    private String name;
    private String accountDate;

    //Creating setter and getter methods
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAccountDate(String accountDate){
        this.accountDate = accountDate;
    }

    public String getAccountDate(){
        return this.accountDate;
    }

    //Creating the constructor
    public Person(String name, String accountDate){
        this.name = name;
        this.accountDate = accountDate;
    }

}
