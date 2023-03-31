package com.MobiAttorney.MobiAttorneyManagement.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Visa")
public class Visa {

    @Id
    private Long id;
    private String VisaNo;
    private String country;
    private String type;

    public Visa() {
    }

    public Visa(Long id, String visaNo, String country, String type) {
        this.id = id;
        VisaNo = visaNo;
        this.country = country;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVisaNo() {
        return VisaNo;
    }

    public void setVisaNo(String visaNo) {
        VisaNo = visaNo;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
