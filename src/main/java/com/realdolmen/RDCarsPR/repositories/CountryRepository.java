package com.realdolmen.RDCarsPR.repositories;

import com.realdolmen.RDCarsPR.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
