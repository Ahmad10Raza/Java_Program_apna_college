// Java code to demonstrate Graph representation
// using ArrayList in Java

import java.util.*;

class Graph_adjacency_list {

	// A utility function to add an edge in an
	// undirected graph
	static void addEdge(ArrayList<ArrayList<Integer> > adj,int u, int v)
	{
		adj.get(u).add(v);
		adj.get(v).add(u);
	}

	// A utility function to print the adjacency list
	// representation of graph
	static void printGraph(ArrayList<ArrayList<Integer> > adj)
	{
		for (int i = 0; i < adj.size(); i++) {
			System.out.println("\nAdjacency list of vertex"+ i);
			System.out.print("head");
			for (int j = 0; j < adj.get(i).size(); j++) {
				System.out.print(" -> "+ adj.get(i).get(j));
			}
			System.out.println();
		}
	}

	// Driver Code
	public static void main(String[] args)
	{
		int V=5;
		// Scanner IND=new Scanner(System.in);
		// System.out.print("Enter the Number of Vertex & Edges :");
		// int V=IND.nextInt();
		// int E=IND.nextInt();
		ArrayList<ArrayList<Integer> > adj= new ArrayList<ArrayList<Integer> >(V);

		// for (int i = 0; i < V; i++){
		// 	adj.add(new ArrayList<Integer>());
		// 	System.out.print("Enter Source And destination :");
		// 	for(int j=0;j<E;j++){
		// 		int s=IND.nextInt();
		// 		int d=IND.nextInt();
		// 		addEdge(adj, s, d);

		// 	}
		for (int i = 0; i < V; i++){
		 	adj.add(new ArrayList<Integer>());

		// Adding edges one by one
		addEdge(adj, 0, 1);
		addEdge(adj, 0, 4);
		addEdge(adj, 1, 2);
		addEdge(adj, 1, 3);
		addEdge(adj, 1, 4);
		addEdge(adj, 2, 3);
		addEdge(adj, 3, 4);
		}
		printGraph(adj);
    
	}
}
