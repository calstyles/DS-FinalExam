import java.util.Scanner;

public class Tester {
	
	
	
	public static void main(String[] args) {
		Graph graph = JSONHelper.createGraphFromJSON();
		Visualizer vis = new Visualizer(graph);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Testing Code Here...");
		System.out.println("Insert an origin node name: ");
		String input1 = scan.next();
		Node n1 = null;
		System.out.println("Insert a destination node name: ");
		String input2 = scan.next();
		Node n2 = null;
		System.out.println("Is it rush hour? true or false");
		boolean input3 = scan.nextBoolean();
		
		for(Node node : graph.nodes) {
			if(input1.equals(node.name)) {
				n1 = node;
			}
			
			if(input2.equals(node.name)) {
				n2 = node;
			}
		}
		
		graph.printDirections(n1, n2, input3);
		// Display Graph to the screen 

		System.out.println("Nodes:");
		graph.printNodes();
		System.out.println("Edges (NOT Rush Hour):");
		graph.printEdges(false);
		System.out.println("Edges (Rush Hour):");
		graph.printEdges(true);
		
		
		System.out.println("Outputting Graph to JavaScript file (open dijkstra.html in your web browser");
		vis.save("output.js");
		
	}

}
