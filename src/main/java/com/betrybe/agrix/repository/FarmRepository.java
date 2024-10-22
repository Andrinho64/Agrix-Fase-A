package com.betrybe.agrix.repository;

import com.betrybe.agrix.model.Farm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for Farm entity.
 */
@Repository
public interface FarmRepository extends JpaRepository<Farm, Long> {
}
