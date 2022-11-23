import java.util.LinkedList;

public class Node {

	private Integer id;
	private String name;
	private float d;
	private Node p;
	public LinkedList<Edge> adjList;
	
	public Node(String name) {
		id = 0;
		this.name = name;
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
	
}
