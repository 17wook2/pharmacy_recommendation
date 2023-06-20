package dev.be.pharmacy_recommendation.pharmacy.repository;

import dev.be.pharmacy_recommendation.pharmacy.entity.Pharmacy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PharmacyRepository extends JpaRepository<Pharmacy, Long> {
}
