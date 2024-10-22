package com.betrybe.agrix.repository;

import com.betrybe.agrix.model.Farm;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for Farm entity.
 */
public interface FarmRepository extends JpaRepository<Farm, Long> {
}
