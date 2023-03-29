package com.example.application.data.repository;

import com.example.application.data.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Temidayo F.
 */

public interface StatusRepository extends JpaRepository<Status, Long> {

}
