package graph;

import java.util.List;

//This makes use of linkedlist for creating adjacency list where as last one used 
public class Graph {
	List<Vertex> vertices;
	boolean directed=false;
	
	public Graph(){
		
	}
	
	private class Vertex{
		List<Edge> edges;
		String name;
	}
	
	private class Edge{
		String sourceName;
		String destName;
		int weight;
	}
	
}
