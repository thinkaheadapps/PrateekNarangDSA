package Graph;

import java.util.LinkedList;
import java.util.List;

class Edge {
    int u;
    int v;
    int wt;
    Edge(int u, int v, int w) {
        this.u = u;
        this.v = v;
        this.wt = w;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "u=" + u +
                ", v=" + v +
                ", wt=" + wt +
                '}';
    }
}

public class GraphUsingEdge {

    /*
    N = 4, E = 4
    */

    int V;
    List<Edge> l;

    GraphUsingEdge(int V) {
        this.V = V;
        l = new LinkedList<>();
    }

    void addEdge(int u, int v,int wt) {
        l.add(new Edge(u,v,wt));
        //System.out.println(edge.toString());
        //l.add(new Edge(v,u,wt));
    }

    //void display()

    public static void main(String[] args) {
        GraphUsingEdge g = new GraphUsingEdge(4);
        g.addEdge(0,1,10);
        g.addEdge(0,2,20);
        g.addEdge(1,2,30);
        g.addEdge(2,0,40);
        g.addEdge(2,30,50);
        g.addEdge(3,3,60);

        //g.display();
        System.out.println();

    }


}
