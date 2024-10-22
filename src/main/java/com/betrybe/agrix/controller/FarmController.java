package com.betrybe.agrix.controller;

import com.betrybe.agrix.model.Farm;
import com.betrybe.agrix.repository.FarmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Controller class for Farm entity.
 */
@RestController
@RequestMapping("/farms")
public class FarmController {

  @Autowired
  private FarmRepository farmRepository;

  @PostMapping
  public ResponseEntity<Farm> createFarm(@RequestBody Farm farm) {
    Farm savedFarm = farmRepository.save(farm);
    return new ResponseEntity<>(savedFarm, HttpStatus.CREATED);
  }
}
