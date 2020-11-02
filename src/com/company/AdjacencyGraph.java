package com.company;
import java.util.*;

//ADJACENCY CLASS
public class AdjacencyGraph {
    private ArrayList<Vertex> graph;

    //Constructor
    public AdjacencyGraph() {
        this.graph = new ArrayList<Vertex>();
    }

    public void addVertexToGraph(Vertex v) {
        if (!graph.contains(v))
            graph.add(v);
    }

    public ArrayList<Vertex> getGraph() {
        return graph;
    }


    public void addEdgeToGraph(Vertex src, Vertex dest, Integer dist) {
        if (!(graph.contains(src) && graph.contains(dest))) {
            System.out.println("Vertex not found!");
            return;
        }
        new Edge(src, dest, dist);
    }

    public void printGraph() {
        System.out.println("Graph contains following: ");
        for (Vertex v : graph) {
            System.out.println("Vertex: " + v.getId());
            for (Edge e : v.getOutEdges()) {
                System.out.println("To: " + e.getDest().getId() + ", " + "Weight: " + e.getWeight());
            }
            System.out.println("");
        }
    }
}









