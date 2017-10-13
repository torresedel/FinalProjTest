package com.example.admin.finalprojtest;

import java.util.Date;

/**
 * Created by Admin on 10/12/2017.
 */

public class FinanceInfoClass {

    private float totalHours;
    private float holidayHours;
    private float pto;
    private float overtimeHours;
    private float hourlyRate;
    private float overtimeRate;
    private float federalTax;
    private float stateTax;
    private float socialSecurityTax;
    private float medicareTax;
    private float medicalInsurance;
    private float visionInsurance;
    private float dentalInsurance;
    private float shortTermDisabilityInsurance;
    private float longTermDisabilityInsurance;
    private float lifeInsurance;
    private Date from;
    private Date to;
    private Date payDate;

    FinanceInfoClass(float totalHours, float holidayHours, float pto,
                     float overtimeHours,
                     float hourlyRate, float overtimeRate,
                     float federalTax, float stateTax, float socialSecurityTax, float medicareTax,
                     float medicalInsurance, float visionInsurance, float dentalInsurance,
                     float shortTermDisabilityInsurance, float longTermDisabilityInsurance, float lifeInsurance,
                     Date from, Date to, Date payDate) {

        this.totalHours = totalHours;
        this.holidayHours = holidayHours;
        this.pto = pto;
        this.overtimeHours = overtimeHours;
        this.hourlyRate = hourlyRate;
        this.overtimeRate = overtimeRate;
        this.federalTax = federalTax;
        this.stateTax = stateTax;
        this.socialSecurityTax = socialSecurityTax;
        this.medicareTax = medicareTax;
        this.medicalInsurance = medicalInsurance;
        this.visionInsurance = visionInsurance;
        this.dentalInsurance = dentalInsurance;
        this.shortTermDisabilityInsurance = shortTermDisabilityInsurance;
        this.longTermDisabilityInsurance = longTermDisabilityInsurance;
        this.lifeInsurance = lifeInsurance;
        this.from = from;
        this.to = to;
        this.payDate = payDate;
    }

    public float getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(float totalHours) {
        this.totalHours = totalHours;
    }

    public float getHolidayHours() {
        return holidayHours;
    }

    public void setHolidayHours(float holidayHours) {
        this.holidayHours = holidayHours;
    }

    public float getPto() {
        return pto;
    }

    public void setPto(float pto) {
        this.pto = pto;
    }

    public float getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(float overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public float getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(float hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public float getOvertimeRate() {
        return overtimeRate;
    }

    public void setOvertimeRate(float overtimeRate) {
        this.overtimeRate = overtimeRate;
    }

    public float getFederalTax() {
        return federalTax;
    }

    public void setFederalTax(float federalTax) {
        this.federalTax = federalTax;
    }

    public float getStateTax() {
        return stateTax;
    }

    public void setStateTax(float stateTax) {
        this.stateTax = stateTax;
    }

    public float getSocialSecurityTax() {
        return socialSecurityTax;
    }

    public void setSocialSecurityTax(float socialSecurityTax) {
        this.socialSecurityTax = socialSecurityTax;
    }

    public float getMedicareTax() {
        return medicareTax;
    }

    public void setMedicareTax(float medicareTax) {
        this.medicareTax = medicareTax;
    }

    public float getMedicalInsurance() {
        return medicalInsurance;
    }

    public void setMedicalInsurance(float medicalInsurance) {
        this.medicalInsurance = medicalInsurance;
    }

    public float getVisionInsurance() {
        return visionInsurance;
    }

    public void setVisionInsurance(float visionInsurance) {
        this.visionInsurance = visionInsurance;
    }

    public float getDentalInsurance() {
        return dentalInsurance;
    }

    public void setDentalInsurance(float dentalInsurance) {
        this.dentalInsurance = dentalInsurance;
    }

    public float getShortTermDisabilityInsurance() {
        return shortTermDisabilityInsurance;
    }

    public void setShortTermDisabilityInsurance(float shortTermDisabilityInsurance) {
        this.shortTermDisabilityInsurance = shortTermDisabilityInsurance;
    }

    public float getLongTermDisabilityInsurance() {
        return longTermDisabilityInsurance;
    }

    public void setLongTermDisabilityInsurance(float longTermDisabilityInsurance) {
        this.longTermDisabilityInsurance = longTermDisabilityInsurance;
    }

    public float getLifeInsurance() {
        return lifeInsurance;
    }

    public void setLifeInsurance(float lifeInsurance) {
        this.lifeInsurance = lifeInsurance;
    }

    public Date getFrom() {
        return from;
    }

    public void setFrom(Date from) {
        this.from = from;
    }

    public Date getTo() {
        return to;
    }

    public void setTo(Date to) {
        this.to = to;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }
}
