package com.betrybe.agrix.service;

import com.betrybe.agrix.model.Crop;
import com.betrybe.agrix.repository.CropRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The type Crop service.
 */
@Service
public class CropService {

  private CropRepository cropRepository;

  /**
   * Instantiates a new Crop service.
   *
   * @param cropRepository the crop repository
   */
  @Autowired
  public CropService(CropRepository cropRepository) {
    this.cropRepository = cropRepository;
  }

  /**
   * Save crop.
   *
   * @param crop the crop
   * @return the saved crop
   */
  public Crop saveCrop(Crop crop) {
    return cropRepository.save(crop);
  }
}