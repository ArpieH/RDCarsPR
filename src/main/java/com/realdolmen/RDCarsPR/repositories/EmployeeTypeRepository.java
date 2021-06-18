package com.realdolmen.RDCarsPR.repositories;

import com.realdolmen.RDCarsPR.models.EmployeeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeTypeRepository extends JpaRepository<EmployeeType, Integer> {

}