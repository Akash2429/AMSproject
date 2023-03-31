package com.MobiAttorney.MobiAttorneyManagement.Controller;

import com.MobiAttorney.MobiAttorneyManagement.Entities.Visa;
import com.MobiAttorney.MobiAttorneyManagement.Service.VisaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Visa")
public class VisaController {

    @Autowired
    private VisaService visaService;

    @GetMapping("")
    public List<Visa> getAllVisa(){
        return visaService.getAllVisa();
    }

    @GetMapping("/{id}")
    public Visa getVisaById(@PathVariable Long id) {
        return visaService.getVisaById(id);
    }

    @PostMapping("")
    public Visa createVisa(@RequestBody Visa visa)
    {
        return visaService.createVisa(visa);
    }

    @PutMapping("/{id}")
    public Visa updateVisa(@PathVariable Long id, @RequestBody Visa visa) {
        return visaService.updateVisa(id, visa);
    }

    @DeleteMapping("/{id}")
    public void deleteVisa(@PathVariable Long id) {

        visaService.deleteVisa(id);
    }
}
