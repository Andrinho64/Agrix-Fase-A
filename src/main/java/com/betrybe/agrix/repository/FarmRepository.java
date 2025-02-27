package com.betrybe.agrix.repository;

import com.betrybe.agrix.model.Farm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Interface de repositório - Fazenda.
 */
@Repository
public interface FarmRepository extends JpaRepository<Farm, Long> {
}
