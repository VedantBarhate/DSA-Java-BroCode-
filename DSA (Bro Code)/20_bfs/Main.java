
public class Main
{
    public static void main(String[] args)
    {
        Graph graph = new Graph(5);

        graph.addnode(new Node('A'));
        graph.addnode(new Node('B'));
        graph.addnode(new Node('C'));
        graph.addnode(new Node('D'));
        graph.addnode(new Node('E'));

        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.addEdge(4,0);
        graph.addEdge(4,2);

        graph.bfs(2);


    }    
}
