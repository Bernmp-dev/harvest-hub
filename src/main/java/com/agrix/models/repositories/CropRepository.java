package com.agrix.models.repositories;

import com.agrix.models.entities.Crop;
import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/** Crop Repository. */
public interface CropRepository extends JpaRepository<Crop, Long> {
  List<Crop> findByHarvestDateBetween(LocalDate start, LocalDate end);

  Crop findFirstByOrderByIdDesc();
}