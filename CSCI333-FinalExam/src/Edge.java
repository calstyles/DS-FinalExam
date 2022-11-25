
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
//			System.out.println(length * congestion);
//			System.out.println(speed * lanes);
			return ((double) length * congestion)/((double) speed * lanes);
		}else {
			return (double) length/((double) speed * lanes);
		}
	}
	
	public Integer getLanes() {
		return lanes;
	}
	
	public void setLanes(Integer lanes) {
		this.lanes = lanes;
	}
	
	public Integer getSpeed() {
		return speed;
	}
	
	public void setSpeed(Integer speed) {
		this.speed = speed;
	}
	
	public float getCongestion() {
		return congestion;
	}
	
	public void setCongestion(float congestion) {
		this.congestion = congestion;
	}
	
	public Integer getLength() {
		return length;
	}
	
	public void setLength(Integer length) {
		this.length = length;
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
		return " Edge Start: " + source.getName() + 
				"\n Edge End: " + target.getName() + 
				"\n Edge Weight: " + getWeight(isRushHour) + 
				"\n";
	}
	
}
