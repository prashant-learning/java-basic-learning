package com.learn.java.basic.day36;

public class Address {

    private String apartmentName;
    private String roadName;
    private String locality;
    private String district;
    private String state;
    private int pincode;

    public Address() {
    }

    public Address(String apartmentName, String roadName, String locality, String district, String state, int pincode) {
        this.apartmentName = apartmentName;
        this.roadName = roadName;
        this.locality = locality;
        this.district = district;
        this.state = state;
        this.pincode = pincode;
    }

    public String getApartmentName() {
        return apartmentName;
    }

    public void setApartmentName(String apartmentName) {
        this.apartmentName = apartmentName;
    }

    public String getRoadName() {
        return roadName;
    }

    public void setRoadName(String roadName) {
        this.roadName = roadName;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
}
