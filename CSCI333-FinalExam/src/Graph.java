import java.util.List;

public class Graph {

	private List<Node> nodeList;
	private List<Edge> edgeList;
	
	public Graph(List<Node> nodeList, List<Edge> edgeList) {
		this.nodeList = nodeList;
		this.edgeList = edgeList;
	}
	
	public void initializeSingleSource(int s) {
		for(Node v : nodeList) {
			v.setD(Integer.MAX_VALUE);
			v.setP(null);
		}
		nodeList.get(s).setD(0);
	}
	
	public void relax() {
		
	}
	
	public void doDijkstra(Node source, boolean isRushHour) {
		
	}
	
}
