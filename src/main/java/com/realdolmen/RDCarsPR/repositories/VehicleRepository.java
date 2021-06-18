package com.realdolmen.RDCarsPR.repositories;

import com.realdolmen.RDCarsPR.models.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer>{

}
