package com.betrybe.agrix.controller.dto;

/**
 * The type Crop DTO.
 */
public class CropDTO {

  private Long id;
  private String name;
  private double plantedArea;
  private Long farmId;

  /**
   * Instantiates a new Crop DTO.
   *
   * @param id the id
   * @param name the name
   * @param plantedArea the planted area
   * @param farmId the farm id
   */
  public CropDTO(Long id, String name, double plantedArea, Long farmId) {
    this.id = id;
    this.name = name;
    this.plantedArea = plantedArea;
    this.farmId = farmId;
  }

  // Getters and setters
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPlantedArea() {
    return plantedArea;
  }

  public void setPlantedArea(double plantedArea) {
    this.plantedArea = plantedArea;
  }

  public Long getFarmId() {
    return farmId;
  }

  public void setFarmId(Long farmId) {
    this.farmId = farmId;
  }
}