import java.util.LinkedList;

public class Node implements Comparable<Node>{

	private Integer id;
	private String name;
	private float d;
	private Node p;
	public LinkedList<Edge> adjList;
	
	public Node(Integer id) {
		name = null;
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

	@Override
	public int compareTo(Node o) {
		if (this.id == o.id) {
			return 0;
		} else if (this.id > o.id) {
			return 1;
		}
		return -1;
	}
	
}
