package com.example.admin.finalprojtest;

/**
 * Created by Admin on 10/10/2017.
 */

public class HousingInfoClass {

    int ID;
    String name;
    String address;
    int numBedroom;
    int numBathroom;
    int buildingManagerPhone;
    int gateCode;
    int lockCode;
    int lat;
    int lng;

    public HousingInfoClass(String name, String address, int numBedroom, int numBathroom, int buildingManagerPhone, int gateCode, int lockCode, int lat, int lng) {
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.numBedroom = numBedroom;
        this.numBathroom = numBathroom;
        this.buildingManagerPhone = buildingManagerPhone;
        this.gateCode = gateCode;
        this.lockCode = lockCode;
        this.lat = lat;
        this.lng = lng;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getNumBedroom() {
        return numBedroom;
    }

    public int getNumBathroom() {
        return numBathroom;
    }

    public int getBuildingManagerPhone() {
        return buildingManagerPhone;
    }

    public int getGateCode() {
        return gateCode;
    }

    public int getLockCode() {
        return lockCode;
    }

    public int getLat() {
        return lat;
    }

    public int getLng() {
        return lng;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumBedroom(int numBedroom) {
        this.numBedroom = numBedroom;
    }

    public void setNumBathroom(int numBathroom) {
        this.numBathroom = numBathroom;
    }

    public void setBuildingManagerPhone(int buildingManagerPhone) {
        this.buildingManagerPhone = buildingManagerPhone;
    }

    public void setGateCode(int gateCode) {
        this.gateCode = gateCode;
    }

    public void setLockCode(int lockCode) {
        this.lockCode = lockCode;
    }

    public void setLat(int lat) {
        this.lat = lat;
    }

    public void setLng(int lng) {
        this.lng = lng;
    }
}
