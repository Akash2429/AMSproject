package com.MobiAttorney.MobiAttorneyManagement.Service;

import com.MobiAttorney.MobiAttorneyManagement.Entities.MobireyAdminstrator;
import com.MobiAttorney.MobiAttorneyManagement.Repository.MobireyAdministratorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MobireyAdminstratorService {

    @Autowired
    private MobireyAdministratorRepository mobireyAdministratorRepository;

    public List<MobireyAdminstrator> getAllAdministrator(){
        return mobireyAdministratorRepository.findAll();
    }

    public MobireyAdminstrator getAdminById(Long id) {
        return mobireyAdministratorRepository.findById(id).orElse(null);
    }

    public MobireyAdminstrator createAdmin(MobireyAdminstrator mobireyAdminstrator) {
        return mobireyAdministratorRepository.save(mobireyAdminstrator);
    }

    public MobireyAdminstrator updateAdmin(Long id, MobireyAdminstrator mobireyAdminstrator) {
        MobireyAdminstrator existingAdmin = mobireyAdministratorRepository.findById(id).orElse(null);
        if (existingAdmin != null) {
            mobireyAdminstrator.setId(id);
            return mobireyAdministratorRepository.save(mobireyAdminstrator);
        }
        return null;
    }

    public void deleteAdmin(Long id) {
        mobireyAdministratorRepository.deleteById(id);
    }
}
