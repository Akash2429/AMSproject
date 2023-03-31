package com.MobiAttorney.MobiAttorneyManagement.Service;

import com.MobiAttorney.MobiAttorneyManagement.Entities.Employer;
import com.MobiAttorney.MobiAttorneyManagement.Repository.EmployerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class EmployerService {

    @Autowired
    private EmployerRepository employerRepository;


    public List<Employer> getAllEmployer(){
        return employerRepository.findAll();
    }
    public Employer getEmployerById(Long id) {
        return employerRepository.findById(id).orElse(null);
    }

    public Employer createEmployer(Employer employer) {
        return employerRepository.save(employer);
    }

    public Employer updateEmployer(Long id, Employer employer) {
        Employer existingEmployee = employerRepository.findById(id).orElse(null);
        if (existingEmployee != null) {
            employer.setId(id);
            return employerRepository.save(employer);
        }
        return null;
    }

    public void deleteEmployer(Long id) {
        employerRepository.deleteById(id);
    }
}
