package com.realdolmen.RDCarsPR.repositories;

import com.realdolmen.RDCarsPR.models.Location;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {

}
