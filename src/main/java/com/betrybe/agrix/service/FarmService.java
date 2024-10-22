package com.betrybe.agrix.service;

import com.betrybe.agrix.model.Farm;
import com.betrybe.agrix.repository.FarmRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Service class for Farm entity.
 */
@Service
public class FarmService {

  @Autowired
    private FarmRepository farmRepository;

  // Método para obter todas as fazendas
  public List<Farm> getAllFarms() {
    return farmRepository.findAll();
  }

  // Método para obter uma fazenda por ID
  public Optional<Farm> getFarmById(Long id) {
    return farmRepository.findById(id);
  }

  // Método para salvar uma nova fazenda
  public Farm saveFarm(Farm farm) {
    return farmRepository.save(farm);
  }
}
