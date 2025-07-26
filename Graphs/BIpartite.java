import java.util.*;

public class BIpartite {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;

        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        // 0 - vertex
        graph[0].add(new Edge(0, 1, 1));
        // graph[0].add(new Edge(0, 2, 1));
        // 1 - vertex
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));
        // 2 - vertex
        // graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));
        // 3 - vertex
        graph[3].add(new Edge(3, 1, 1));
        // graph[3].add(new Edge(3, 4, 1));
        // graph[3].add(new Edge(3, 5, 1));
        // 4 - vertex
        graph[4].add(new Edge(4, 2, 1));
        // graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));
        // 5 - vertex
        // graph[4].add(new Edge(5, 3, 1));
        // graph[4].add(new Edge(5, 4, 1));
        graph[4].add(new Edge(5, 6, 1));
        // 6 - vertex
        graph[4].add(new Edge(6, 5, 1));
    }

    public static boolean isBipartite(ArrayList<Edge>[] graph) {
        int cal[] = new int[graph.length];
        for (int i = 0; i < cal.length; i++) {
            cal[i] = -1;
        }
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < graph.length; i++) {
            if (cal[i] == -1) {
                q.add(i);
                cal[i] = 0;
                while (!q.isEmpty()) {
                    int curr = q.remove();
                    for (int j = 0; j < graph[curr].size(); j++) {
                        Edge e = graph[curr].get(j);
                        if (cal[e.dest] == -1) {
                            int nextCol = cal[curr] == 0 ? 1 : 0;
                            cal[e.dest] = nextCol;
                            q.add(e.dest);
                        } else if (cal[e.dest] == cal[curr]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int V = 7;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        System.out.println(isBipartite(graph));
    }
}