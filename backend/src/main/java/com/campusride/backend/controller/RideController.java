package com.campusride.backend.controller;

import com.campusride.backend.entity.Ride;
import com.campusride.backend.service.RideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/rides")
@CrossOrigin(origins = "*")
public class RideController {

    @Autowired
    private RideService rideService;

    @PostMapping("/create")
    public ResponseEntity<?> createRide(@RequestBody Ride ride) {

        Ride savedRide = rideService.createRide(ride);

        return ResponseEntity.ok(savedRide);
    }
}