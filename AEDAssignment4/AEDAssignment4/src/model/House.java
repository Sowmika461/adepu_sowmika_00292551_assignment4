/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author adepu
 */
public class House {
    
    private int houseNumber;
    
    private String stateName;
    private int zipCode;
    private Community communityName;
    private City cityName;
    
    public House(int houseNumber,String stateName, int zipCode, Community communityName, City cityName){
        this.houseNumber = houseNumber;
        
        this.stateName = stateName;
        this.zipCode = zipCode;
        this.communityName = communityName;
        this.cityName = cityName;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public Community getCommunityName() {
        return communityName;
    }

    public void setCommunityName(Community communityName) {
        this.communityName = communityName;
    }

    public City getCityName() {
        return cityName;
    }

    public void setCityName(City cityName) {
        this.cityName = cityName;
    }
    
    
    
    
}
