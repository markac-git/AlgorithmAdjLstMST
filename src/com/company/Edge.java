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

    public void setSrc(Vertex src) {
        this.src = src;
    }

    public Vertex getDest() {
        return dest;
    }

    public void setDest(Vertex dest) {
        this.dest = dest;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}