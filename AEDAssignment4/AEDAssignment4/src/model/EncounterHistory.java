/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adepu
 */
public class EncounterHistory {
    private List<Encounter> encounterHistory;
    
    EncounterHistory ()
    {
        encounterHistory = new ArrayList<>();
    }
    
    public void addEncounter(Encounter encounter)
    {
        encounterHistory.add(encounter);
    }

    public List<Encounter> getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(List<Encounter> encounterHistory) {
        this.encounterHistory = encounterHistory;
    }
    
    public void removeEncounter(int index){
        if (index>=0 && index<encounterHistory.size()){
            encounterHistory.remove(index);
        }
    }
    
}
