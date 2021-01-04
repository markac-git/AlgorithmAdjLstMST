package com.company;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class MST {

    private void init(AdjacencyGraph g, PriorityQueue priorityQueue, int src ) {
        final int Infinity = Integer.MAX_VALUE;
        final Vertex root = g.getGraph().get(src);

        //for all vertices in graph
        for (Vertex v : g.getGraph()){
            v.setDistance(Infinity);
            v.setVisited(false);
            v.setParent(null);
        }
        root.setDistance(0);

        priorityQueue.offer(root); //adding root note //log(V)
    }

    void primsMST(AdjacencyGraph g, int src){
        final int A = g.getGraph().size();
        ArrayList<Vertex> MSTOrder = new ArrayList<Vertex>(); //keeps track of MST
        /*The class Vertex implements Comparable and contains
        a compareTo method (distance) which enables the que to
        sort the type. Highest priority = smallest distance = head of queue */

        //sorting vertices on the distances (regarding: Vertex, l: 55-60)
        PriorityQueue<Vertex> priorityQueue = new PriorityQueue<Vertex>();

        init(g,priorityQueue,src);

        while (!priorityQueue.isEmpty() || MSTOrder.size()<A) { //O(V)

            /*TEST
            for(Vertex x:priorityQueue) {
                System.out.println(x.getId() + " : " + x.getDistance()+ "  :  "+x.isVisited());
            }*/
            Vertex v0 = priorityQueue.poll(); //removing vertex with smallest distance value from PQ //O(log(V))

            assert v0 != null;
            if (v0.isVisited())
                continue; //Skipping to next iteration of while-loop


            //for every outedge of v0
            for (Edge outEdge : v0.getOutEdges()) {
                Vertex v1 = outEdge.getDest(); //get adjacent vertex
                v0.setVisited(true);

                if (!v1.isVisited() && outEdge.getWeight() < v1.getDistance()) {
                    v1.setDistance(outEdge.getWeight());
                    v1.setParent(outEdge.getSrc());//v0
                    priorityQueue.offer(v1); //ElogV say every edge is attached to this vertex
                }
            }


//            //updates PQ
//            priorityQueue.clear();
//            for (Vertex v : g.getGraph())
//                priorityQueue.offer(v); //O(V^2*Log(V))



            if (!MSTOrder.contains(v0))
                MSTOrder.add(v0); //adding v0 to MST
        }
       printMST(MSTOrder);
    }

    private void printMST(ArrayList<Vertex> MSTOrder) {
        int sum=0;
        System.out.println("Minimum Spanning Tree");
        for (Vertex v : MSTOrder){
            if (v.getParent()!=null) {
                String parent = v.getParent().getId();
                String dest = v.getId();
                int cost = v.getDistance();
                System.out.println("From: " + parent + " To: " + dest + " Km. " + cost);
            }
            sum+=v.getDistance();
        }
        System.out.println("\nTotal of Km.: "+sum);
        System.out.println("Price: "+sum*1000000+" kr.");
    }
}
