package graph;

import java.util.ArrayList;

//This is very basic implementation of graph

public class SimpleGraph {
	private int vCount;// no of vertices
	private int eCount;// no of edges
	private ArrayList[] adjacents;// It is array of arrayLists
	
	public SimpleGraph(int vCount){
		this.vCount=vCount;
		this.eCount=0;
		
		adjacents= new ArrayList[vCount];
		
		for(int i=0;i<vCount;i++)
			adjacents[i]= new ArrayList<>();
	}
	
	public int getVertexCount(){
		return vCount;
	}
	public int getEdgeCount(){
		return eCount;
	}
	
	public void addEdge(int src, int dest){
		adjacents[src].add(dest);
		//adjacents[dest].add(src);//This is required if it is bi directional graph
		eCount++;
	}
	
	public ArrayList getAdjacents(int src){
		return adjacents[src];
	}
}
