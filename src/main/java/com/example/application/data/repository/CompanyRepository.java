package com.example.application.data.repository;

import com.example.application.data.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Temidayo F.
 */

public interface CompanyRepository extends JpaRepository<Company, Long> {

}

