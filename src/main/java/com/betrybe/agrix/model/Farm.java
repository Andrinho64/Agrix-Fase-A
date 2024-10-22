package com.betrybe.agrix.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity class for Farm.
 */
@Entity
@Table(name = "farms")
public class Farm {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

  @Column(nullable = false)
    private String name;

  @Column(nullable = false)
    private double size;

  // Construtores, getters e setters
  public Farm() {}

  public Farm(String name, double size) {
    this.name = name;
    this.size = size;
  }

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

  public double getSize() {
    return size;
  }

  public void setSize(double size) {
    this.size = size;
  }
}