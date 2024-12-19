import GraphPackage.*;
import ADTPackage.*;

public class ShortestDistance {
    private static UndirectedGraph<String> graph;

    public static void main(String[] args) {
        graph = new UndirectedGraph<>();
        addVertices();
        addEdges();
        findAndDisplayShortestPath("Sandwich", "Falmouth");
        findAndDisplayShortestPath("Sandwich", "Chatham");
        findAndDisplayShortestPath("Falmouth", "Orleans");
    }

    public static void addVertices() {
        String[] cities = {
            "Sandwich",
            "Barnstable",
            "Falmouth",
            "Hyannis",
            "Chatham",
            "Orleans"
        };

        for (String city : cities) {
            graph.addVertex(city);
        }
    }

    public static void addEdges() {
        graph.addEdge("Sandwich", "Barnstable");
        graph.addEdge("Sandwich", "Falmouth");
        graph.addEdge("Barnstable", "Hyannis");
        graph.addEdge("Falmouth", "Hyannis");
        graph.addEdge("Falmouth", "Chatham");
        graph.addEdge("Chatham", "Orleans");
    }

    public static void findAndDisplayShortestPath(String source, String destination) {
        StackInterface<String> path = new LinkedStack<>(); // Create an empty stack to store the shortest path
        graph.getShortestPath(source, destination, path);
        System.out.println("The shortest path from " + source + " to " + destination + " is:");
        displayPath(path);
    }
    
    public static void displayPath(StackInterface<String> stack) {
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println();
    }
}
