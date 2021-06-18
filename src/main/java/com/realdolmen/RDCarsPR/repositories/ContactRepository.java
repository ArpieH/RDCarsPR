package com.realdolmen.RDCarsPR.repositories;

import com.realdolmen.RDCarsPR.models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
