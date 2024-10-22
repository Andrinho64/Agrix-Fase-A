package com.betrybe.agrix.controller;

import com.betrybe.agrix.model.Farm;
import com.betrybe.agrix.service.FarmService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
  private FarmService farmService;

  /**
 * Rota para obter todas as fazendas.
 */
  @GetMapping
    public ResponseEntity<List<Farm>> getAllFarms() {
    List<Farm> farms = farmService.getAllFarms();
    return ResponseEntity.ok(farms);
  }

  /**
 * Rota para obter uma fazenda por ID.
 */
  @GetMapping("/{id}")
    public ResponseEntity<Object> getFarmById(@PathVariable Long id) {
    Optional<Farm> farm = farmService.getFarmById(id);
    if (farm.isPresent()) {
      return ResponseEntity.ok(farm.get());
    } else {
      return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body("{ \"message\": \"Fazenda não encontrada!\" }");
    }
  }

  /**
 * Rota para criar uma nova fazenda.
 */
  @PostMapping
    public ResponseEntity<Farm> createFarm(@RequestBody Farm farm) {
    Farm savedFarm = farmService.saveFarm(farm);
    return ResponseEntity.status(HttpStatus.CREATED).body(savedFarm);
  }
}
