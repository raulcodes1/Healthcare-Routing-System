package com.healthcare.tests;

import com.healthcare.datastructures.Graph;

public class GraphTest {

    public static void main(String[] args) {

        Graph graph = new Graph();

        graph.addNode("X");
        graph.addNode("Y");

        graph.addEdge("X", "Y", 2);

        System.out.println("Graph test OK");
    }
}