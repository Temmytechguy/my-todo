package com.example.application.data.repository;

import com.example.application.data.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Temidayo F.
 */

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
