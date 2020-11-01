package com.company;
import java.util.ArrayList;

class Vertex implements Comparable<Vertex>{
    private Integer distance;
    private Vertex parent;
    private ArrayList<Edge> outEdges;
    private String id;
    private boolean visited;
    AdjacencyGraph adjG;

    public Vertex(String id) {
        this.id = id;
        outEdges=new ArrayList<Edge>();
    }

    public Vertex getParent() {
        return parent;
    }

    public void setParent(Vertex parent) {
        this.parent = parent;
    }

    public void setOutEdges(ArrayList<Edge> outEdges) {
        this.outEdges = outEdges;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public ArrayList<Edge> getOutEdges() {
        return outEdges;
    }


    public void addEdge(Edge edge) {
        outEdges.add(edge);


    }

    public String getId() {
        return id;
    }

    @Override
    public int compareTo(Vertex o) {
        if (this.distance > o.distance)
            return 1;
        else if (this.distance < o.distance)
            return -1;
        return 0;
    }
}