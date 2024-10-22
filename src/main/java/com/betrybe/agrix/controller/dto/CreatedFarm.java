package com.betrybe.agrix.controller.dto;

import com.betrybe.agrix.model.Farm;

/**
 * The type Created farm.
 */
public record CreatedFarm(String name, Double size) {

  /**
   * To entity farm.
   *
   * @return the farm
   */
  public Farm toEntity() {
    return new Farm(name, size);
  }
}
