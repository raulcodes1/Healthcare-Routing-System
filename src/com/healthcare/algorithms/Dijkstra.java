package com.healthcare.algorithms;

import com.healthcare.datastructures.*;

import java.util.*;

public class Dijkstra {

    public Map<String, Integer> shortestPath(Graph graph, String start) {

        Map<String, Integer> distances = new HashMap<>();
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(n -> n.distance));

        for (String node : graph.getNodes()) {
            distances.put(node, Integer.MAX_VALUE);
        }

        distances.put(start, 0);
        pq.add(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node current = pq.poll();

            for (Edge edge : graph.getNeighbors(current.name)) {

                int newDist = current.distance + edge.weight;

                if (newDist < distances.get(edge.to)) {
                    distances.put(edge.to, newDist);
                    pq.add(new Node(edge.to, newDist));
                }
            }
        }

        return distances;
    }
}