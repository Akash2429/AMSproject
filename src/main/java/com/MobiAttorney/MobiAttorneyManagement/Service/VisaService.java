package com.MobiAttorney.MobiAttorneyManagement.Service;


import com.MobiAttorney.MobiAttorneyManagement.Entities.Visa;
import com.MobiAttorney.MobiAttorneyManagement.Repository.VisaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisaService {
    @Autowired
    private VisaRepository visaRepository;


    public List<Visa> getAllVisa(){
        return visaRepository.findAll();
    }

    public Visa getVisaById(Long id) {
        return visaRepository.findById(id).orElse(null);
    }

    public Visa createVisa(Visa visa) {
        return visaRepository.save(visa);
    }

    public Visa updateVisa(Long id, Visa visa) {
        Visa existingVisa = visaRepository.findById(id).orElse(null);
        if (existingVisa != null) {
            visa.setId(id);
            return visaRepository.save(visa);
        }
        return null;
    }

    public void deleteVisa(Long id) {
        visaRepository.deleteById(id);
    }
}
