package com.MobiAttorney.MobiAttorneyManagement.Repository;

import com.MobiAttorney.MobiAttorneyManagement.Entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
