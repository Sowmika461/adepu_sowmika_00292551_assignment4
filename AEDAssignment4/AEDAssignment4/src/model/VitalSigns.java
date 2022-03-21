/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author adepu
 */
public class VitalSigns {
    int systolic_bp;
    int diastolic_bp;
    int sugar;
    
    public VitalSigns(int systolic_bp, int diastolic_bp, int sugar){
        this.systolic_bp = systolic_bp;
        this.diastolic_bp = diastolic_bp;
        this.sugar = sugar;
    }

    public int getSystolic_bp() {
        return systolic_bp;
    }

    public void setSystolic_bp(int systolic_bp) {
        this.systolic_bp = systolic_bp;
    }

    public int getDiastolic_bp() {
        return diastolic_bp;
    }

    public void setDiastolic_bp(int diastolic_bp) {
        this.diastolic_bp = diastolic_bp;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int pulse) {
        this.sugar = pulse;
    }
    
}
