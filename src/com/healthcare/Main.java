package com.healthcare;

import com.healthcare.datastructures.*;
import com.healthcare.services.*;

public class Main {

    public static void main(String[] args) {

        Graph graph = new Graph();

        // nodes (hastaneler + noktalar)
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");

        // yollar
        graph.addEdge("A", "B", 5);
        graph.addEdge("A", "C", 10);
        graph.addEdge("B", "C", 3);

        RoutingService routingService = new RoutingService(graph);

        String result = routingService.findNearestHospital("A");

        System.out.println("En yakın hastane: " + result);
    }
}