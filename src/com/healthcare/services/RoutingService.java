package com.healthcare.services;

import com.healthcare.algorithms.Dijkstra;
import com.healthcare.datastructures.Graph;

import java.util.Map;

public class RoutingService {

    private Graph graph;
    private Dijkstra dijkstra;

    public RoutingService(Graph graph) {
        this.graph = graph;
        this.dijkstra = new Dijkstra();
    }

    public String findNearestHospital(String patientLocation) {

        Map<String, Integer> distances =
                dijkstra.shortestPath(graph, patientLocation);

        String bestHospital = null;
        int minDistance = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> entry : distances.entrySet()) {
            if (entry.getValue() < minDistance) {
                minDistance = entry.getValue();
                bestHospital = entry.getKey();
            }
        }

        return bestHospital;
    }
}