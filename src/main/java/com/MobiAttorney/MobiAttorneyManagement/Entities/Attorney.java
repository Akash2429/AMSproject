package com.MobiAttorney.MobiAttorneyManagement.Entities;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;
import org.springframework.data.util.Lazy;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Attorney")
public class Attorney {

    @Id
    private Long Id;
    private String name;
    private String email;
    private String phone;
    private String address;

    public Attorney() {
    }

    public Attorney(Long id, String name, String email, String phone, String address) {
        Id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

/*
    @OneToMany(mappedBy = "attorney", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Employer> employer = new ArrayList<>();
*/

    @OneToMany(cascade = CascadeType.ALL,fetch =FetchType.LAZY)
    private List<Employer> employer;

    public List<Employer> getEmployer() {
        return employer;
    }

    public void setEmployer(List<Employer> employer) {
        this.employer = employer;
    }
}
