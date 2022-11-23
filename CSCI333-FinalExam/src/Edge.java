
public class Edge {

	public Integer lanes;
	public Integer speed;
	public float congestion;
	public Integer length;
	public Node source;
	public Node target;
	
	public Edge() {
		lanes = 0;
		speed = 0;
		congestion = 0;
		length = 0;
		source = null;
		target = null;
	}
	
	public double getWeight(boolean isRushHour) {
		if(isRushHour) {
			return (length * congestion)/(speed * lanes);
		}else {
			return length/(speed * lanes);
		}
	}
	
	@Override
	public String toString() {
		return "";
	}
	
}
