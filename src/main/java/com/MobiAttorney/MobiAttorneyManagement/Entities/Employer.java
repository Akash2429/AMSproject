package com.MobiAttorney.MobiAttorneyManagement.Entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Employer")
public class Employer {
    @Id
    private Long id;
    private String name;
    private String address;
    private String contactmail;
    private String contactphone;


    public Employer() {
    }

    public Employer(Long id, String name, String address, String contactmail, String contactphone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.contactmail = contactmail;
        this.contactphone = contactphone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactmail() {
        return contactmail;
    }

    public void setContactmail(String contactmail) {
        this.contactmail = contactmail;
    }

    public String getContactphone() {
        return contactphone;
    }

    public void setContactphone(String contactphone) {
        this.contactphone = contactphone;
    }

    /*
    @OneToMany(mappedBy = "employer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Employee> employees = new ArrayList<>();



    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="attorney_ID")
    private Attorney attorney;

 */

    @ManyToOne
    @JoinColumn(name="attorney_ID")
    private Attorney attorney;

    public Attorney getAttorney() {
        return attorney;
    }

    public void setAttorney(Attorney attorney) {
        this.attorney = attorney;
    }


    @OneToMany(cascade =CascadeType.ALL,mappedBy = "employer",fetch = FetchType.LAZY)
    private List<Employee> employee;

    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }
}
