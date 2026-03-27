package com.campusride.backend.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.campusride.backend.entity.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

    List<Vehicle> findByStatus(String status);

    Optional<Vehicle> findByEmailAndStatus(String email, String status);

    // ✅ ADD THIS
    List<Vehicle> findByEmail(String email);
}