package com.MobiAttorney.MobiAttorneyManagement.Entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="Employee")
public class Employee {

    @Id
    private Long Id;
    private String firstName;
    private String lastName;
    private String email;

    private String passport_No;
    private Date passportIssueDate;
    private Date passportExpiredDate;

    public Employee() {
    }

    public Employee(Long id, String firstName, String lastName, String email, String passport_No, Date passportIssueDate, Date passportExpiredDate) {
        Id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.passport_No = passport_No;
        this.passportIssueDate = passportIssueDate;
        this.passportExpiredDate = passportExpiredDate;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassport_No() {
        return passport_No;
    }

    public void setPassport_No(String passport_No) {
        this.passport_No = passport_No;
    }

    public Date getPassportIssueDate() {
        return passportIssueDate;
    }

    public void setPassportIssueDate(Date passportIssueDate) {
        this.passportIssueDate = passportIssueDate;
    }

    public Date getPassportExpiredDate() {
        return passportExpiredDate;
    }

    public void setPassportExpiredDate(Date passportExpiredDate) {
        this.passportExpiredDate = passportExpiredDate;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="employer_ID")
    private Employer employer;

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }
}
