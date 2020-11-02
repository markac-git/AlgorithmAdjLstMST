package com.company;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class MST {

    void primsMST(AdjacencyGraph g, int src){
        final int A = g.getGraph().size();
        final int Infinity = Integer.MAX_VALUE;
        final Vertex root = g.getGraph().get(src);

        ArrayList<Vertex> visited = new ArrayList<Vertex>();
        ArrayList<Vertex> MSTOrder = new ArrayList<Vertex>();
        ArrayList<Vertex> PARENT = new ArrayList<Vertex>();

        for (Vertex v : g.getGraph()){
            v.setDistance(Infinity);
            v.setVisited(false);
            v.setParent(null);
        }

        root.setDistance(0);

        PriorityQueue<Vertex> priorityQueue = new PriorityQueue<Vertex>();

        for (Vertex v : g.getGraph()){
            priorityQueue.offer(v);
        }

        int mst=0;

        while (!priorityQueue.isEmpty() && MSTOrder.size()<A) {

            /*TEST
            for(Vertex x:priorityQueue) {
                System.out.println(x.getId() + " : " + x.getDistance()+ "  :  "+x.isVisited());
            }*/

            Vertex v0 = priorityQueue.poll();


            assert v0 != null;
            if (v0.isVisited())
                continue;


            for (Edge outEdge : v0.getOutEdges()) {
                Vertex v1 = outEdge.getDest();
                v0.setVisited(true);

                if (!v1.isVisited() && outEdge.getWeight() < v1.getDistance()) {
                    v1.setDistance(outEdge.getWeight());
                    v1.setParent(outEdge.getSrc());
                    priorityQueue.offer(v1);
                }

                priorityQueue.clear();
                for (Vertex v : g.getGraph())
                    priorityQueue.offer(v);
            }
            mst += v0.getDistance();
            if (!MSTOrder.contains(v0))
                MSTOrder.add(v0);

        }

        int sum=0;
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
        System.out.println("Price: "+sum*1000000);

    }
}
