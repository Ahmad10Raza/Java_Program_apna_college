import java.util.*;
public class Graph_02 {
    public  static class Graph_Implementation{
        private   LinkedList<Integer> adjacency[];
        public Graph_Implementation(int v){
            adjacency=new LinkedList[v];
            for(int i=0;i<v;i++){
                adjacency[i]=new LinkedList<Integer>();
            }
        }
    
    public void InsertEdge(int s ,int d){
        adjacency[s].add(d);
        adjacency[d].add(s);
    }
}
public static void main(String[] args) {
    Scanner IND=new Scanner(System.in);
    System.out.println("Enter the Vertex & Edge : ");
    int v=IND.nextInt();
    int e=IND.nextInt();
    Graph_Implementation g=new Graph_Implementation(v);
    System.out.println("Enter Edges");
    for(int i=0;i<e;i++){
        int s=IND.nextInt();
        int d=IND.nextInt();
        g.InsertEdge(s, d);
    }
IND.close();

}
}