package com.MobiAttorney.MobiAttorneyManagement.Controller;


import com.MobiAttorney.MobiAttorneyManagement.Entities.Employer;
import com.MobiAttorney.MobiAttorneyManagement.Service.EmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Employer")
public class EmployerController {

    @Autowired
    private EmployerService employerService;

    @GetMapping("")
    public List<Employer> getAllEmployer(){
        return  employerService.getAllEmployer();
    }
    @GetMapping("/{id}")
    public Employer getEmployerById(@PathVariable Long id)
    {
        return employerService.getEmployerById(id);
    }

    @PostMapping("")
    public Employer createEmployee(@RequestBody Employer employer) {
        return employerService.createEmployer(employer);
    }

    @PutMapping("/{id}")
    public Employer updateEmployee(@PathVariable Long id, @RequestBody Employer employer) {
        return employerService.updateEmployer(id, employer);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employerService.deleteEmployer(id);
    }

}
