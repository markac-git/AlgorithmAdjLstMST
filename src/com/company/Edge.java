package com.company;

class Edge {
    private Vertex src;
    private Vertex dest;
    private Integer weight;

    public Edge(Vertex src, Vertex dest, Integer weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
        src.addEdge(this);
    }

    public Vertex getSrc() {
        return src;
    }

    public Vertex getDest() {
        return dest;
    }

    public Integer getWeight() {
        return weight;
    }

}