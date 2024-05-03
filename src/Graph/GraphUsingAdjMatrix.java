package Graph;

import java.util.Arrays;

public class GraphUsingAdjMatrix {

    int V;
    boolean adjMatrix[][];

    GraphUsingAdjMatrix(int V) {
        this.V = V;
        adjMatrix = new boolean[V][V];
    }

    //Undirected Graph
    void addEdge(int u, int v) {
        adjMatrix[u][v] = true;
        adjMatrix[v][u] = true;
    }


    @Override
    public String toString() {
        return "GraphUsingAdjMatrix{" +
                "V=" + V +
                ", adjMatrix=" + Arrays.deepToString(adjMatrix) +
                '}';
    }

    public static void main(String[] args) {
        GraphUsingAdjMatrix g = new GraphUsingAdjMatrix(4);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,2);
        g.addEdge(2,0);
        g.addEdge(2,3);
        g.addEdge(3,3);
        System.out.println(g);

    }
}
