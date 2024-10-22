package com.betrybe.agrix.controller.dto;

import com.betrybe.agrix.model.Crop;
import com.betrybe.agrix.model.Farm;

/**
 * The type Created crop.
 */
public record CreatedCrop(String name, Double plantedArea) {

  /**
   * To entity crop.
   *
   * @param farm the farm
   * @return the crop
   */
  public Crop toEntity(Farm farm) {
    return new Crop(name, plantedArea, farm);
  }
}