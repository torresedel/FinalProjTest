package com.example.admin.finalprojtest.data;

import java.util.Date;

/**
 * Created by Admin on 10/10/2017.
 */

public class PersonalInfoClass {

    int ID;
    String fName;
    String lName;
    String phoneNum;
    int emergencyName;
    int emergencyPhoneNum;
    Date joinDate;
    String TechnologyBatch;

    public PersonalInfoClass(int ID, String fName, String lName, String phoneNum, int emergencyName, int emergencyPhoneNum, Date joinDate, String technologyBatch) {
        this.ID = ID;
        this.fName = fName;
        this.lName = lName;
        this.phoneNum = phoneNum;
        this.emergencyName = emergencyName;
        this.emergencyPhoneNum = emergencyPhoneNum;
        this.joinDate = joinDate;
        TechnologyBatch = technologyBatch;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getEmergencyName() {
        return emergencyName;
    }

    public void setEmergencyName(int emergencyName) {
        this.emergencyName = emergencyName;
    }

    public int getEmergencyPhoneNum() {
        return emergencyPhoneNum;
    }

    public void setEmergencyPhoneNum(int emergencyPhoneNum) {
        this.emergencyPhoneNum = emergencyPhoneNum;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public String getTechnologyBatch() {
        return TechnologyBatch;
    }

    public void setTechnologyBatch(String technologyBatch) {
        TechnologyBatch = technologyBatch;
    }
}
