/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author adepu
 */
public class Person {
    
    private int ID;
    private String personName;
    private int age;
    private String gender;
    private int phoneNumber;
    private String isPatient;
    private House house;
    private EncounterHistory encounteDirectory;
    
    
    public Person(int ID, String personName, int age, String gender, int phoneNumber, String isPatient, House house){
        this.ID = ID;
        this.personName = personName;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.isPatient = isPatient;
        this.house = house;
        this.encounteDirectory = new EncounterHistory();
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getIsPatient() {
        return isPatient;
    }

    public void setIsPatient(String isPatient) {
        this.isPatient = isPatient;
    }
    public EncounterHistory getEncounteDirectory() {
        return encounteDirectory;
    }

    public void setEncounteDirectory(EncounterHistory encounteDirectory) {
        this.encounteDirectory = encounteDirectory;
    }
    
    public void addEncounter(Encounter encounter){
       
        encounteDirectory.addEncounter(encounter);
    }
    
    
}
