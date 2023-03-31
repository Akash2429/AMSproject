package com.MobiAttorney.MobiAttorneyManagement.Service;

import com.MobiAttorney.MobiAttorneyManagement.Entities.Attorney;
import com.MobiAttorney.MobiAttorneyManagement.Repository.AttorneyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttorneyService {

    @Autowired
    private AttorneyRepository attorneyRepository;

    public List<Attorney> getAllAttorey(){
        return attorneyRepository.findAll();
    }

    public Attorney getAllAttorneybyId(Long id){
        return attorneyRepository.findById(id).orElse(null);
    }

    public Attorney createAttoney(Attorney attorney) {
        return attorneyRepository.save(attorney);
    }


    public Attorney updateAttorney(Long id, Attorney attorney) {
        Attorney existingAttorney = attorneyRepository.findById(id).orElse(null);
        if (existingAttorney != null) {
            attorney.setId(id);
            return attorneyRepository.save(attorney);
        }
        return null;
    }

    public void deleteAttorney(Long id) {
        attorneyRepository.deleteById(id);
    }

}
