package com.campusride.backend.controller;

import com.campusride.backend.entity.Vehicle;
import com.campusride.backend.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
@CrossOrigin(origins = "*")
public class AdminController {

    @Autowired
    private VehicleService vehicleService;

    // Get all pending vehicles
    @GetMapping("/vehicles/pending")
    public List<Vehicle> getPendingVehicles() {
        return vehicleService.getPendingVehicles();
    }

    // Approve vehicle
    @PutMapping("/vehicle/{id}/approve")
    public Vehicle approveVehicle(@PathVariable Long id) {
        return vehicleService.approveVehicle(id);
    }

    // Reject vehicle
    @PutMapping("/vehicle/{id}/reject")
    public Vehicle rejectVehicle(@PathVariable Long id) {
        return vehicleService.rejectVehicle(id);
    }
}