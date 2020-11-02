package com.company;

public class Main {
	public static void main(String[] args) {
		AdjacencyGraph adjacencyGraph = new AdjacencyGraph();
		MST mst = new MST();

		//Instance variables created
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
		adjacencyGraph.addVertexToGraph(Maribo);//
		adjacencyGraph.addVertexToGraph(Vordingborg);
		adjacencyGraph.addVertexToGraph(Korsoer);//
		adjacencyGraph.addVertexToGraph(Koege);//
		adjacencyGraph.addVertexToGraph(Naestved);//
		adjacencyGraph.addVertexToGraph(Ringsted);//
		adjacencyGraph.addVertexToGraph(Roskilde);
		adjacencyGraph.addVertexToGraph(Slagelse);//
		adjacencyGraph.addVertexToGraph(Soroe);
		adjacencyGraph.addVertexToGraph(Jaegerspris);//
		adjacencyGraph.addVertexToGraph(Kalundborg);//
		adjacencyGraph.addVertexToGraph(Nakskov);
		adjacencyGraph.addVertexToGraph(Nykoebing_F);
		adjacencyGraph.addVertexToGraph(Eskildstrup);//
		adjacencyGraph.addVertexToGraph(Haslev);//
		adjacencyGraph.addVertexToGraph(Holbaek);//

		new Edge(Roskilde,Haslev,47);
		new Edge(Roskilde,Holbaek,32);
		new Edge(Roskilde,Jaegerspris,33);
		new Edge(Roskilde,Kalundborg,70);
		new Edge(Roskilde,Koege,25);
		new Edge(Roskilde,Naestved,57);
		new Edge(Roskilde,Ringsted,31);


		new Edge(Soroe,Haslev,34);
		new Edge(Soroe,Holbaek,34);
		new Edge(Soroe,Jaegerspris,63);
		new Edge(Soroe,Kalundborg,51);
		new Edge(Soroe,Naestved,32);
		new Edge(Soroe,Ringsted,15);
		new Edge(Soroe,Slagelse,14);

		new Edge(Nakskov,Maribo,27);

		new Edge(Nykoebing_F,Eskildstrup,13);
		new Edge(Nykoebing_F,Maribo,26);

		new Edge(Vordingborg,Eskildstrup,24);
		new Edge(Vordingborg,Haslev,40);
		new Edge(Vordingborg,Koege,60);
		new Edge(Vordingborg,Naestved,28);
		new Edge(Vordingborg,Ringsted,58);


		new Edge(Eskildstrup,Maribo,28);
		new Edge(Eskildstrup,Nykoebing_F,13);
		new Edge(Eskildstrup,Vordingborg,24);

		new Edge(Haslev,Korsoer,60);
		new Edge(Haslev,Koege,24);
		new Edge(Haslev,Naestved,25);
		new Edge(Haslev,Ringsted,19);
		new Edge(Haslev,Roskilde,47);
		new Edge(Haslev,Slagelse,48);
		new Edge(Haslev,Soroe,34);
		new Edge(Haslev,Vordingborg,40);

		new Edge(Holbaek,Jaegerspris,34);
		new Edge(Holbaek,Kalundborg,44);
		new Edge(Holbaek,Korsoer,66);
		new Edge(Holbaek,Ringsted,36);
		new Edge(Holbaek,Roskilde,32);
		new Edge(Holbaek,Slagelse,46);
		new Edge(Holbaek,Soroe,34);

		new Edge(Jaegerspris,Korsoer,95);
		new Edge(Jaegerspris,Koege,58);
		new Edge(Jaegerspris,Ringsted,56);
		new Edge(Jaegerspris,Roskilde,33);
		new Edge(Jaegerspris,Slagelse,74);
		new Edge(Jaegerspris,Soroe,63);

		new Edge(Kalundborg,Ringsted,62);
		new Edge(Kalundborg,Roskilde,70);
		new Edge(Kalundborg,Slagelse,39);
		new Edge(Kalundborg,Soroe,51);

		new Edge(Korsoer,Naestved,45);
		new Edge(Korsoer,Slagelse,20);

		new Edge(Koege,Naestved,45);
		new Edge(Koege,Ringsted,28);
		new Edge(Koege,Roskilde,25);
		new Edge(Koege,Vordingborg,60);

		new Edge(Maribo,Nakskov,27);
		new Edge(Maribo,Nykoebing_F,26);

		new Edge(Naestved,Roskilde,57);
		new Edge(Naestved,Ringsted,26);
		new Edge(Naestved,Slagelse,37);
		new Edge(Naestved,Soroe,32);
		new Edge(Naestved,Vordingborg,28);

		new Edge(Ringsted,Roskilde,31);
		new Edge(Ringsted,Soroe,15);
		new Edge(Ringsted,Vordingborg,58);

		new Edge(Slagelse,Soroe,14);

		adjacencyGraph.addVertexToGraph(Maribo);
		adjacencyGraph.addVertexToGraph(Vordingborg);
		adjacencyGraph.addVertexToGraph(Korsoer);
		adjacencyGraph.addVertexToGraph(Koege);
		adjacencyGraph.addVertexToGraph(Naestved);
		adjacencyGraph.addVertexToGraph(Ringsted);
		adjacencyGraph.addVertexToGraph(Roskilde);
		adjacencyGraph.addVertexToGraph(Slagelse);
		adjacencyGraph.addVertexToGraph(Soroe);
		adjacencyGraph.addVertexToGraph(Jaegerspris);
		adjacencyGraph.addVertexToGraph(Kalundborg);
		adjacencyGraph.addVertexToGraph(Nakskov);
		adjacencyGraph.addVertexToGraph(Nykoebing_F);
		adjacencyGraph.addVertexToGraph(Eskildstrup);
		adjacencyGraph.addVertexToGraph(Haslev);
		adjacencyGraph.addVertexToGraph(Holbaek);


		adjacencyGraph.printGraph();
		mst.primsMST(adjacencyGraph,0);


		/*TEST
		Vertex _0 = new Vertex("0");//
		Vertex _1 = new Vertex("1");//
		Vertex _2 = new Vertex("2");//
		Vertex _3 = new Vertex("3");//
		Vertex _4 = new Vertex("4");//
		Vertex _5 = new Vertex("5");
		Vertex _6 = new Vertex("6");//
		Vertex _7 = new Vertex("7");//
		Vertex _8 = new Vertex("8");//

		//Original
		new Edge(_0, _1, 4);
		new Edge(_0, _7, 8);

		new Edge(_1, _0, 4);
		new Edge(_1, _7, 11);
		new Edge(_1, _2, 8);

		new Edge(_2, _1, 8);
		new Edge(_2, _8, 2);
		new Edge(_2, _5, 4);
		new Edge(_2, _3, 7);

		new Edge(_3, _2, 7);
		new Edge(_3, _4, 9);
		new Edge(_3, _5, 14);

		new Edge(_4, _3, 9);
		new Edge(_4, _5, 10);

		new Edge(_5, _3, 14);
		new Edge(_5, _4, 10);
		new Edge(_5, _2, 4);
		new Edge(_5, _6, 2);

		new Edge(_6, _5, 2);
		new Edge(_6, _8, 6);
		new Edge(_6, _7, 1);

		new Edge(_7, _6, 1);
		new Edge(_7, _8, 8);
		new Edge(_7, _0, 8);
		new Edge(_7, _1, 11);

		new Edge(_8, _2, 2);
		new Edge(_8, _7, 8);
		new Edge(_8, _6, 6);

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
		*/
	}
}
