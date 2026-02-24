package com.campusride.backend.service;

import com.campusride.backend.entity.Ride;
import com.campusride.backend.entity.Vehicle;
import com.campusride.backend.repository.RideRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RideService {

    @Autowired
    private RideRepository rideRepository;

    @Autowired
    private VehicleService vehicleService;

    public Ride createRide(Ride ride) {

        // Check approved vehicle
        Vehicle vehicle = vehicleService
                .getApprovedVehicleByEmail(ride.getDriverEmail());

        // Attach verified vehicle number
        ride.setVehicleNumber(vehicle.getVehicleNumber());

        return rideRepository.save(ride);
    }
}