
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author Latoofi
 */
public class Graph {

    public int V;
    public String filename;
    public int[][] Adj;
    private static Scanner input;

    // constructor 
    public Graph(int V, String filename) {
        this.V = V;
        this.filename = filename;
        Adj = new int[V][5];

        //initalize
        for (int i = 0; i < V; ++i) {
            for (int j = 0; j < 5; j++) {
                Adj[i][j] = 0;
            }
        }
    }
    public void addEdge() throws IOException {

        int counter = 0;
        input = new Scanner(Paths.get(filename));

        while (input.hasNext()) // take one line
        {

            String s = input.nextLine();  // take string

            String tempArray[] = s.split(" "); //split string and insert it in array
            ShirtArray(tempArray);

            for (int j = 0; j < tempArray.length - 1; j++) {

                Adj[counter][j] = convert(tempArray[j]);
            }
            ++counter;
        }
           //Print Graph
        for (int i = 0; i < Adj.length; ++i) {
            for (int j = 0; j < 5; j++) {
                System.out.print(Adj[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public void ShirtArray(String[] array) {
        for (int i = 0; i < array.length - 1; ++i) {
            array[i] = array[i + 1];
        }

    }

    public static int convert(String A) {
        String s = "";
        for (int i = 10; i < A.length(); i++) {
            s = s.concat(Character.toString(A.charAt(i)));
        }

        int C = Integer.parseInt(s);
        return C;
    }

    //Algorithm 1 + time
    public long dijkstra(Graph g, int source) {
        int[] dist = new int[g.V];
        int[] prev = new int[g.V];
        boolean visited[] = new boolean[g.V];
        LinkedQueue<Integer> solution = new LinkedQueue<>();
        LinkedQueue<Integer> q = new LinkedQueue<>();
         //Start Time 
        long startTime = System.currentTimeMillis();
        //Initualize 
        for (int i = 0; i < g.V; ++i) {
            dist[i] = Integer.MAX_VALUE;
            prev[i] = 0;
            q.enQueue(i + 1);
            visited[i] = true;  }
         //source =0
        dist[source - 1] = 0;

        while (!q.isEmpty()) {
            int u = ExtractMin(q, dist, visited);
           // q.print();
            solution.enQueue(u + 1);
            for (int k = 0; k < 5; k++) {
              if (u!=-1){
                int vertex = Adj[u][k];
                if (vertex == 0) { // there are no more adj in matrix
                    break; }
                Relax(u, vertex, dist, prev); }}}
        for (int i = 0; i < V; i++) { // print routing table for each router
            if((i+1)!= source){
            System.out.print((i+1)+"             ");
            int x= printRouter(source, i+1 , prev);
            if (x==1)
            {System.out.print("  Cost= "+dist[i]);}
            System.out.println("");}}
        long stopTime = System.currentTimeMillis();
        long algorithmTime = stopTime - startTime;
        return algorithmTime;}

    //Algorithm 2
    public long BellmanFord(Graph g, int source) {
        int[] dist = new int[g.V];
        int[] prev = new int[g.V];
        //Start Time 
        long startTime = System.currentTimeMillis();
        //Initualize 
        for (int i = 0; i < g.V; ++i) {
            dist[i] = Integer.MAX_VALUE;
            prev[i] = 0;
        }

        //source =0
        dist[source - 1] = 0;
          for (int z = 1; z< (g.V - 1); z++) {
            for (int u = 0; u < V ; u++) {
                for (int k = 0; k < 5; k++) {
                    int vertex = Adj[u][k];
                      if(dist[u]!=Integer.MAX_VALUE)
                    Relax(u, vertex, dist, prev);
                }
            }
        }
        for (int i = 0; i < V; i++) {
            if((i+1)!= source){
            System.out.print((i+1)+"             ");
             int x= printRouter(source, i+1 , prev);
            if (x==1)
            {System.out.print("  Cost= "+dist[i]);}
            System.out.println("");}
        }
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        return elapsedTime;
    }

    private int ExtractMin(LinkedQueue<Integer> q, int[] dist, boolean[] visited) {
        int minimum = Integer.MAX_VALUE;
        int index= -1;

        for (int i = 0; i < dist.length; i++) {

            if (dist[i] < minimum && visited[i] == true) {
                minimum = dist[i];
                index = i;
            }
        }
        if (minimum != Integer.MAX_VALUE) {
            visited[index] = false;
            //Delete from queue
            int counter = q.size();
            while (counter > 0) {
                int e = q.deQueue();
                if (e != (index+1)) {
                    q.enQueue(e);
                }
                --counter;
            }
            return index;
        } else {
            //Delete from queue the remining element that not have source..
                int e = q.deQueue();
             
            return -1;
        }
       
    }

    private void Relax(int u, int vertex, int[] dist, int[] prev) {
        int weight = (dist[u]) + (Math.abs((u + 1) - vertex));

        if (vertex == 0) {
            return;
        } else if (dist[vertex - 1] > weight) {
            //switch
            dist[vertex - 1] = weight;
            prev[vertex - 1] = u + 1;

        }
    }

   private void printPath(int source, int destination, int[] prev, int[] dist) {
       
        Stack<Integer> path = new Stack<>();
        int previous = prev[destination - 1];
        if (prev[destination - 1] != source) {
            while (previous != source) {
                if (previous == 0) {
                    System.out.println("There is no path");
                    return ;
                }
                path.push(previous);
                previous = prev[previous - 1];
                
            }

            if (path.isEmpty()) {
                System.out.println("There is no path!");
            } else {
                System.out.println("The path between " + source + " and " + destination + " is");
                System.out.print("241.12.31." + source + " -> ");
                while (!path.isEmpty()) {
                    System.out.print("241.12.31." + path.pop() + " -> ");
                }
                System.out.print("241.12.31." + destination);
            }
        } else {
            System.out.println("241.12.31." + destination + " is directly reachable from " + "241.12.31." + source);
            System.out.println("with weigth = " + (dist[destination - 1]));
        }

    }

  
    private int printRouter(int source, int destination, int[] prev) {
       int gateWay ; 
       int tempDist;
       int tempSource;

        Stack<Integer> path = new Stack<>();
        int previous = prev[destination - 1];
        if (prev[destination - 1] != source) {
            path.push(destination);
            while (previous != source) {
                if (previous == 0) {
                    System.out.print("There is no path");
                    return 0;
                }
                path.push(previous);
                previous = prev[previous - 1];
                
            }

            if (path.isEmpty()) {
                System.out.print("There is no path!");
                return 0;
            } else { 
                gateWay=path.pop();
                if(!path.isEmpty()){
                tempDist=path.pop();
                System.out.printf("241.12.31.%d(241.12.31.%d,241.12.31.%d) ",source,tempDist,gateWay);
                        tempSource=tempDist;} 
                else {
                     System.out.printf("241.12.31.%d(241.12.31.%d,-) ",source,gateWay);                
                return 1;
                }  
                  while (!path.isEmpty()) {
                gateWay=path.pop();
                if(!path.isEmpty()){
                tempDist=path.pop();
                System.out.printf("241.12.31.%d(241.12.31.%d,241.12.31.%d) ",tempSource,tempDist,gateWay);
                        tempSource=tempDist;} 
                else {
                     System.out.printf("241.12.31.%d(241.12.31.%d,-) ",tempSource,gateWay);                
                return 1;
                }  
                  }

          
            }
        } else { // Direct connection
                      System.out.printf("241.12.31.%d(241.12.31.%d,-) ",source,destination);
        }
        return 1;
    }
 
}
