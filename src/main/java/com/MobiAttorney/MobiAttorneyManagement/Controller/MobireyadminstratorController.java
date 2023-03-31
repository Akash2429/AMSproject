package com.MobiAttorney.MobiAttorneyManagement.Controller;
import com.MobiAttorney.MobiAttorneyManagement.Entities.MobireyAdminstrator;
import org.springframework.web.bind.annotation.*;
import com.MobiAttorney.MobiAttorneyManagement.Repository.MobireyAdministratorRepository;
import com.MobiAttorney.MobiAttorneyManagement.Service.MobireyAdminstratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/MobiAdmin")
public class MobireyadminstratorController {

    @Autowired
    private MobireyAdminstratorService mobireyAdminstratorService;

    @GetMapping("")
    public List<MobireyAdminstrator> getAllAdministrator(){

        return mobireyAdminstratorService.getAllAdministrator();
    }

    @GetMapping("/{id}")
    public MobireyAdminstrator getEmployeeById(@PathVariable Long id) {
        return mobireyAdminstratorService.getAdminById(id);
    }
    @PostMapping("")
    public MobireyAdminstrator createAdmin(@RequestBody MobireyAdminstrator mobireyAdminstrator) {
        return mobireyAdminstratorService.createAdmin(mobireyAdminstrator);
    }

    @PutMapping("/{id}")
    public MobireyAdminstrator updateAdmin(@PathVariable Long id, @RequestBody MobireyAdminstrator mobireyAdminstrator) {
        return mobireyAdminstratorService.updateAdmin(id, mobireyAdminstrator);
    }

    @DeleteMapping("/{id}")
    public void deleteAdmin(@PathVariable Long id) {
        mobireyAdminstratorService.deleteAdmin(id);
    }

}
