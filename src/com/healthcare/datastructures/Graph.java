package com.healthcare.datastructures;

import java.util.*;

public class Graph {

    private Map<String, List<Edge>> adjacencyList = new HashMap<>();

    public void addNode(String node) {
        adjacencyList.putIfAbsent(node, new ArrayList<>());
    }

    public void addEdge(String from, String to, int weight) {
        adjacencyList.get(from).add(new Edge(to, weight));
    }

    public List<Edge> getNeighbors(String node) {
        return adjacencyList.getOrDefault(node, new ArrayList<>());
    }

    public Set<String> getNodes() {
        return adjacencyList.keySet();
    }
}