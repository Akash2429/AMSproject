package com.MobiAttorney.MobiAttorneyManagement.Service;


import com.MobiAttorney.MobiAttorneyManagement.Entities.Employee;
import com.MobiAttorney.MobiAttorneyManagement.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(Long id, Employee employee) {
        Employee existingEmployee = employeeRepository.findById(id).orElse(null);
        if (existingEmployee != null) {
            employee.setId(id);
            return employeeRepository.save(employee);
        }
        return null;
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

}
