package com.healthcare.api;

import com.healthcare.services.RoutingService;

public class RoutingController {

    private RoutingService routingService;

    public RoutingController(RoutingService routingService) {
        this.routingService = routingService;
    }

    public void getRoute(String patientLocation) {
        String hospital = routingService.findNearestHospital(patientLocation);
        System.out.println("En yakın hastane: " + hospital);
    }
}