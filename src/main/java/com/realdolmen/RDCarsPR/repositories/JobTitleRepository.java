package com.realdolmen.RDCarsPR.repositories;

import com.realdolmen.RDCarsPR.models.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobTitleRepository extends JpaRepository<JobTitle, Integer> {

}
