//import java.util.LinkedList;

public class Node implements Comparable<Node>{

	private Integer id;
	private String name;
	private float d;
	private Node p;
//	public LinkedList<Edge> adjList;
	
	public Node(String name, Integer id) {
		this.name = name;
		this.id = id;
		d = 0;
		p = null;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getD() {
		return d;
	}
	public void setD(float d) {
		this.d = d;
	}
	public Node getP() {
		return p;
	}
	public void setP(Node p) {
		this.p = p;
	}

	public String toString() {
		return " Node Name: " + name + "\n " + 
			   "Node Distance: " + d + "\n " +
			   "Node Parent: " + p + "\n ";
	}
	
	@Override
	public int compareTo(Node o) {
		if (this.d == o.d) {
			return 0;
		} else if (this.d > o.d) {
			return 1;
		}
		return -1;
	}
	
}
