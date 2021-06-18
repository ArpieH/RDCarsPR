package com.realdolmen.RDCarsPR.repositories;

import com.realdolmen.RDCarsPR.models.VehicleMaintenance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleMaintenanceRepository extends JpaRepository<VehicleMaintenance, Integer>{
	
	

}
