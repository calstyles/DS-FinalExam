
public class Edge {

	public Integer lanes;
	public Integer speed;
	public float congestion;
	public Integer length;
	public Node source;
	public Node target;
	
	public Edge(Node source, Node target) {
		lanes = 0;
		speed = 0;
		congestion = 0;
		length = 0;
		this.source = source;
		this.target = target;
	}
	
	public double getWeight(boolean isRushHour) {
		if(isRushHour) {
			return ((double) length * congestion)/((double) speed * lanes);
		}else {
			return (double) length/((double) speed * lanes);
		}
	}
	
	public Node getSource() {
		return source;
	}
	
	public void setSource(Node source) {
		this.source = source;
	}
	
	public Node getTarget() {
		return target;
	}
	
	public void setTarget(Node target) {
		this.target = target;
	}
	
	public String toString(boolean isRushHour) {
		return " Start: " + source + 
				"\n End:" + target + 
				"\n Weight: " + getWeight(isRushHour);
	}
	
}
