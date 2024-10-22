package com.betrybe.agrix.service;

import com.betrybe.agrix.model.Farm;
import com.betrybe.agrix.repository.FarmRepository;
import com.betrybe.agrix.service.interfaces.FarmServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The type Farm service.
 */
@Service
public class FarmService implements FarmServiceInterface {

  private FarmRepository farmRepository;

  /**
   * Instantiates a new Farm service.
   *
   * @param farmRepository the farm repository
   */

  @Autowired
  public FarmService(FarmRepository farmRepository) {
    this.farmRepository = farmRepository;
  }

  @Override
  public Farm setFarmRepository(Farm farm) {
    return farmRepository.save(farm);
  }

}
