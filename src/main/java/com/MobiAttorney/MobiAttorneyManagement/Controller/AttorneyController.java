package com.MobiAttorney.MobiAttorneyManagement.Controller;

import com.MobiAttorney.MobiAttorneyManagement.Entities.Attorney;
import com.MobiAttorney.MobiAttorneyManagement.Service.AttorneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Attorney")
public class AttorneyController {

    @Autowired
    private AttorneyService attorneyService;

    @GetMapping("")
    public List<Attorney> getAllAttorney(){
        return attorneyService.getAllAttorey();
    }
    @GetMapping("/{id}")
    public Attorney getAttorneybyId(@PathVariable Long id) {
        return attorneyService.getAllAttorneybyId(id);
    }

    @PostMapping("")
    public Attorney createAttorney(@RequestBody Attorney attorney) {
        return attorneyService.createAttoney(attorney);
    }


    @PutMapping("/{id}")
    public Attorney updateAttorney(@PathVariable Long id, @RequestBody Attorney attorney) {
        return attorneyService.updateAttorney(id, attorney);
    }

    @DeleteMapping("/{id}")
    public void deleteAttorney(@PathVariable Long id) {
        attorneyService.deleteAttorney(id);
    }

}
