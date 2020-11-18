package com.company;

public class Main {
	public static void main(String[] args) {
		//instantiating
		AdjacencyGraph adjGraph = new AdjacencyGraph();
		MST mst = new MST();

		//Instance variables are created pointing at the object created by the constructor
        Vertex Maribo  = new Vertex("Maribo");//
        Vertex Vordingborg = new Vertex("Vordingborg");//
        Vertex Korsoer = new Vertex("Korsør");//
        Vertex Koege = new Vertex("Køge");//
        Vertex Naestved = new Vertex("Næstved");//
        Vertex Ringsted = new Vertex("Ringsted");
        Vertex Roskilde = new Vertex("Roskilde");//
        Vertex Slagelse = new Vertex("Slagelse");//
		Vertex Soroe  = new Vertex("Sorø");//
		Vertex Jaegerspris = new Vertex("Jægerspris");//
		Vertex Kalundborg = new Vertex("Kalundborg");//
		Vertex Nakskov = new Vertex("Nakskov");//
		Vertex Nykoebing_F = new Vertex("Nykøbing Falster");//
		Vertex Eskildstrup = new Vertex("Eskildstrup");//
		Vertex Haslev = new Vertex("Haslev");
		Vertex Holbaek = new Vertex("Holbæk");


		//added to graph
		adjGraph.addVertexToGraph(Maribo);//
		adjGraph.addVertexToGraph(Vordingborg);
		adjGraph.addVertexToGraph(Korsoer);//
		adjGraph.addVertexToGraph(Koege);//
		adjGraph.addVertexToGraph(Naestved);//
		adjGraph.addVertexToGraph(Ringsted);//
		adjGraph.addVertexToGraph(Roskilde);
		adjGraph.addVertexToGraph(Slagelse);//
		adjGraph.addVertexToGraph(Soroe);
		adjGraph.addVertexToGraph(Jaegerspris);//
		adjGraph.addVertexToGraph(Kalundborg);//
		adjGraph.addVertexToGraph(Nakskov);
		adjGraph.addVertexToGraph(Nykoebing_F);
		adjGraph.addVertexToGraph(Eskildstrup);//
		adjGraph.addVertexToGraph(Haslev);//
		adjGraph.addVertexToGraph(Holbaek);//


		/*Calls upon utility method that creates an edge in both directions -
		As the graph is undirected*/
		eUtil(Eskildstrup,Maribo,28);
		eUtil(Eskildstrup,Nykoebing_F,13);
		eUtil(Eskildstrup,Vordingborg,24);
		eUtil(Haslev,Korsoer,60);
		eUtil(Haslev,Koege,24);
		eUtil(Haslev,Naestved,25);
		eUtil(Haslev,Ringsted,19);
		eUtil(Haslev,Roskilde,47);
		eUtil(Haslev,Slagelse,48);
		eUtil(Haslev,Soroe,34);
		eUtil(Haslev,Vordingborg,40);
		eUtil(Holbaek,Jaegerspris,34);
		eUtil(Holbaek,Kalundborg,44);
		eUtil(Holbaek,Korsoer,66);
		eUtil(Holbaek,Ringsted,36);
		eUtil(Holbaek,Roskilde,32);
		eUtil(Holbaek,Slagelse,46);
		eUtil(Holbaek,Soroe,34);
		eUtil(Jaegerspris,Korsoer,95);
		eUtil(Jaegerspris,Koege,58);
		eUtil(Jaegerspris,Ringsted,56);
		eUtil(Jaegerspris,Roskilde,33);
		eUtil(Jaegerspris,Slagelse,74);
		eUtil(Jaegerspris,Soroe,63);
		eUtil(Kalundborg,Ringsted,62);
		eUtil(Kalundborg,Roskilde,70);
		eUtil(Kalundborg,Slagelse,39);
		eUtil(Kalundborg,Soroe,51);
		eUtil(Korsoer,Naestved,45);
		eUtil(Korsoer,Slagelse,20);
		eUtil(Koege,Naestved,45);
		eUtil(Koege,Ringsted,28);
		eUtil(Koege,Roskilde,25);
		eUtil(Koege,Vordingborg,60);
		eUtil(Maribo,Nakskov,27);
		eUtil(Maribo,Nykoebing_F,26);
		eUtil(Naestved,Roskilde,57);
		eUtil(Naestved,Ringsted,26);
		eUtil(Naestved,Slagelse,37);
		eUtil(Naestved,Soroe,32);
		eUtil(Naestved,Vordingborg,28);
		eUtil(Ringsted,Roskilde,31);
		eUtil(Ringsted,Soroe,15);
		eUtil(Ringsted,Vordingborg,58);
		eUtil(Slagelse,Soroe,14);

		adjGraph.printGraph(); //printing existing graph
		mst.primsMST(adjGraph,0); //running Prim's algorithm
	}
	//Utility method for creating edges in both directions as the graph is undirected
	private static void eUtil(Vertex src, Vertex dest, Integer weight) {
		new Edge(src,dest,weight);
		new Edge(dest,src,weight);
	}
}
