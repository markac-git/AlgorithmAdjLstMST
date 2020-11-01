package com.company;

public class Main {
    public static void main(String[] args) {
        AdjacencyGraph adjacencyGraph = new AdjacencyGraph();
        MST mst = new MST();

        Vertex _0 = new Vertex("0");
        Vertex _1 = new Vertex("1");
        Vertex _2 = new Vertex("2");
        Vertex _3 = new Vertex("3");
        Vertex _4 = new Vertex("4");
        Vertex _5 = new Vertex("5");
        Vertex _6 = new Vertex("6");
        Vertex _7 = new Vertex("7");
        Vertex _8 = new Vertex("8");

        //Original
        /*
        new Edge(_0,_1,4);
        new Edge(_0,_7,8);

        new Edge(_1,_0,4);
        new Edge(_1,_7,11);
        new Edge(_1,_2,8);

        new Edge(_2,_1,8);
        new Edge(_2,_8,2);
        new Edge(_2,_5,4);
        new Edge(_2,_3,7);

        new Edge(_3,_2,7);
        new Edge(_3,_4,9);
        new Edge(_3,_5,14);

        new Edge(_4,_3,9);
        new Edge(_4,_5,10);

        new Edge(_5,_3,14);
        new Edge(_5,_4,10);
        new Edge(_5,_2,4);
        new Edge(_5,_6,2);

        new Edge(_6,_5,2);
        new Edge(_6,_8,6);
        new Edge(_6,_7,1);

        new Edge(_7,_6,1);
        new Edge(_7,_8,8);
        new Edge(_7,_0,8);
        new Edge(_7,_1,11);

        new Edge(_8,_2,2);
        new Edge(_8,_7,8);
        new Edge(_8,_6,6);
         */
		/*
        //Custom#2
		new Edge(_0,_1,3);
		new Edge(_0,_7,9);

		new Edge(_1,_0,3);
		new Edge(_1,_7,4);
		new Edge(_1,_2,11);

		new Edge(_2,_1,11);
		new Edge(_2,_8,5);
		new Edge(_2,_5,8);
		new Edge(_2,_3,1);

		new Edge(_3,_2,1);
		new Edge(_3,_4,9);
		new Edge(_3,_5,2);

		new Edge(_4,_3,9);
		new Edge(_4,_5,10);

		new Edge(_5,_3,2);
		new Edge(_5,_4,10);
		new Edge(_5,_2,8);
		new Edge(_5,_6,4);

		new Edge(_6,_5,4);
		new Edge(_6,_8,3);
		new Edge(_6,_7,1);

		new Edge(_7,_6,1);
		new Edge(_7,_8,10);
		new Edge(_7,_0,9);
		new Edge(_7,_1,4);

		new Edge(_8,_2,5);
		new Edge(_8,_7,10);
		new Edge(_8,_6,3);*/

		//Youtube
		new Edge(_0,_1,4);
		new Edge(_0,_7,8);

		new Edge(_1,_0,4);
		new Edge(_1,_7,11);
		new Edge(_1,_2,8);

		new Edge(_2,_1,8);
		new Edge(_2,_8,2);
		new Edge(_2,_5,4);
		new Edge(_2,_3,7);

		new Edge(_3,_2,7);
		new Edge(_3,_4,9);
		new Edge(_3,_5,14);

		new Edge(_4,_3,9);
		new Edge(_4,_5,10);

		new Edge(_5,_3,14);
		new Edge(_5,_4,10);
		new Edge(_5,_2,4);
		new Edge(_5,_6,2);

		new Edge(_6,_5,2);
		new Edge(_6,_8,6);
		new Edge(_6,_7,1);

		new Edge(_7,_6,1);
		new Edge(_7,_8,9);
		new Edge(_7,_0,8);
		new Edge(_7,_1,11);

		new Edge(_8,_2,5);
		new Edge(_8,_7,10);
		new Edge(_8,_6,3);



		adjacencyGraph.addVertexToGraph(_0);
        adjacencyGraph.addVertexToGraph(_1);
        adjacencyGraph.addVertexToGraph(_2);
        adjacencyGraph.addVertexToGraph(_3);
        adjacencyGraph.addVertexToGraph(_4);
        adjacencyGraph.addVertexToGraph(_5);
        adjacencyGraph.addVertexToGraph(_6);
        adjacencyGraph.addVertexToGraph(_7);
        adjacencyGraph.addVertexToGraph(_8);

        //adjacencyGraph.printGraph();
        mst.primsMST(adjacencyGraph,0);
    }
}
