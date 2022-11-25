import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Graph {

	private List<Node> nodeList;
	private List<Edge> edgeList;
	
	public Graph(List<Node> nodeList, List<Edge> edgeList) {
		this.nodeList = nodeList;
		this.edgeList = edgeList;
	}
	
	private void initializeSingleSource(int s) {
		for(Node v : nodeList) {
			v.setD(Integer.MAX_VALUE);
			v.setP(null);
		}
		nodeList.get(s).setD(0);
	}
	
	private void relax(Node u, Node v, boolean isRushHour) {
		Edge e = new Edge(u, v);
		double w = e.getWeight(isRushHour);
		if(u.getD() == Integer.MAX_VALUE) {
			return;
		}
		if(v.getD() > (u.getD() + w)) {
			v.setD((float) (u.getD() + w));
			v.setP(u);
		}
	}
	
	public void doDijkstra(Node source, boolean isRushHour) {
		int s = nodeList.indexOf(source);
		initializeSingleSource(s);
		Queue<Node> pq = new PriorityQueue<>();
        pq.addAll(nodeList);
        while(pq.size() != 0) {
        	Node u = pq.remove();
        	for(int v = 0; v < nodeList.size(); v++) {
        		relax(u, nodeList.get(v), isRushHour);
        	}
        }
	}
	
	public void printEdges(boolean isRushHour) {
		for(int i = 0; i < edgeList.size(); i++) {
			System.out.println(edgeList.get(i).toString(isRushHour));
		}
	}
	
	public void printNodes() {
		for(int i = 0; i < nodeList.size(); i++) {
			System.out.println(nodeList.get(i).toString());
		}
	}
}
