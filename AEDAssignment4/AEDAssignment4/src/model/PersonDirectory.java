/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author adepu
 */
public class PersonDirectory {
    private List<Person> personDirectory;
    
    public PersonDirectory(){
        personDirectory = new ArrayList<Person>();
    }

    public List<Person> getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(List<Person> personDirectory) {
        this.personDirectory = personDirectory;
    }
    
    public void addPerson(Person person){
        personDirectory.add(person);
    }
    
    public Person getPerson(int patientId) {
        for (Person person : personDirectory) {
            if(patientId == person.getID())
                return person;
        }
        return null;
    }
    
    
    public void removePatient(int patientId){
       
        Iterator<Person> iterator = personDirectory.iterator();
        while(iterator.hasNext()){
            
            Person person = iterator.next();
            if(person.getID()== patientId){
                iterator.remove();
            }
        
    }
    
    
    
    }
    
    public boolean isPatientExist(int patientId) {
        

        Iterator<Person> iterator = personDirectory.iterator();
        while(iterator.hasNext()){
            
            Person patient = iterator.next();
            if(patient.getID()== patientId)
                return false;
        }
        
        return true;
    }
}
