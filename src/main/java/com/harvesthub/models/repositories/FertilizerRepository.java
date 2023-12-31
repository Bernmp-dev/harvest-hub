package com.harvesthub.models.repositories;

import com.harvesthub.models.entities.Fertilizer;
import org.springframework.data.jpa.repository.JpaRepository;

/** Farm Repository. */
public interface FertilizerRepository extends JpaRepository<Fertilizer, Long> {
}