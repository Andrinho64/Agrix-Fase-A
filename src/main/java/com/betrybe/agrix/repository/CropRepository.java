package com.betrybe.agrix.repository;

import com.betrybe.agrix.model.Crop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for Crop entity.
 */
@Repository
public interface CropRepository extends JpaRepository<Crop, Long> {
}