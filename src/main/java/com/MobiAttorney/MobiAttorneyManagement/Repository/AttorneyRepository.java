package com.MobiAttorney.MobiAttorneyManagement.Repository;

import com.MobiAttorney.MobiAttorneyManagement.Entities.Attorney;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttorneyRepository extends JpaRepository<Attorney,Long> {
}
