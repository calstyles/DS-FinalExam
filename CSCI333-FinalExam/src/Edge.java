
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
			return (length * congestion)/(speed * lanes);
		}else {
			return length/(speed * lanes);
		}
	}
	
	public String toString(boolean isRushHour) {
		return " Start: " + source + 
				"\n End:" + target + 
				"\n Weight: " + getWeight(isRushHour);
	}
	
}
