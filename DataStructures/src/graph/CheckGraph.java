package graph;

public class CheckGraph {

	public static void main(String[] args) {
		SimpleGraph g= new SimpleGraph(4);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(0, 3);
		g.addEdge(3, 2);
		g.addEdge(1, 2);
		System.out.println(g.getAdjacents(2));
	}

}
