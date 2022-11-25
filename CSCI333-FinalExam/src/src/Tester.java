import java.util.ArrayList;
import java.util.List;

public class Tester {

	public static void main(String[] args) {
		Node n1 = new Node("sas", 44);
		Node n2 = new Node("saw", 32);
		Node n3 = new Node("sad", 31);
		Node n4 = new Node("sav", 90);
		
		Edge e1 = new Edge(n1, n2);
		e1.setLanes(54);
		e1.setSpeed(43);
		e1.setCongestion(3.3f);
		e1.setLength(43);
		
		Edge e2 = new Edge(n3, n4);
		e1.setLanes(103);
		e1.setSpeed(21);
		e1.setCongestion(3.5f);
		e1.setLength(74);
		
		List<Node> nodeList = new ArrayList<Node>();
		nodeList.add(n1);
		nodeList.add(n2);
		nodeList.add(n3);
		nodeList.add(n4);
		
		List<Edge> edgeList = new ArrayList<Edge>();
		edgeList.add(e1);
		edgeList.add(e2);
		
		Graph g = new Graph(nodeList, edgeList);
		boolean isRushHour = true;
//		g.doDijkstra(n1, isRushHour);
		g.doDijkstra(n2, isRushHour);
//		g.doDijkstra(n3, isRushHour);
//		g.doDijkstra(n4, isRushHour);
		g.printEdges(isRushHour);
		g.printNodes();
		
	}
}
