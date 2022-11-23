import java.util.List;

public class Graph {

	private List<Node> nodeList;
	private List<Edge> edgeList;
	
	public Graph(List<Node> nodeList, List<Edge> edgeList) {
		this.nodeList = nodeList;
		this.edgeList = edgeList;
	}
	
	public void initializeSingleSource() {
		for(Node v : nodeList) {
			v.setP(null);
		}
		
	}
	
	public void relax() {
		
	}
	
	public void doDijkstra(Node source, boolean isRushHour) {
		
	}
	
}
