
import java.io.IOException;
import java.security.SecureRandom;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author Latoofi
 */
public class Test 
{
     public static Formatter output1,output50,output2,output100,output3,output150,output200,output4,output250,output5,outputTest;
    public static void main(String[] args) throws IOException 
   {
        
           //Open five files
           openFile();
           
         //  writeFile(15,outputTest);
           //closeFile(outputTest);
           
           writeFile(50,output1);
           closeFile(output1);
           
           writeFile(50,output50);
           closeFile(output50);

           writeFile(100,output2);
           closeFile(output2);
           
           writeFile(100,output100);
           closeFile(output100);

           writeFile(150,output3);
           closeFile(output3);
           
            writeFile(150,output150);
           closeFile(output150);

           writeFile(200,output4);
           closeFile(output4);
           
           writeFile(200,output200);
           closeFile(output200);

           writeFile(250,output5);
           closeFile(output5);
           
           writeFile(250,output250);
           closeFile(output250);
        
         ////////////////////////////////////////////////////////////
         long Dijkstra=0;
         long BallFord=0;
         long TotalDijkstra=0;
         long TotalBallFord=0;
         
         ////////////////////////First Test/////////////////////////
           Graph g1=new Graph(50,"LAN1");
           g1.addEdge();
           Dijkstra=DijkstraTestCase(g1);
           BallFord=BellmanFordTestCase(g1);
           if(Dijkstra<=BallFord)
               System.out.println("Dijkstra Algorithm is faster than Bellman-Ford");
           else
               System.out.println("Bellman-Ford Algorithm is faster than Dijkstra");
         TotalDijkstra=TotalDijkstra+Dijkstra;
         TotalBallFord=TotalBallFord+BallFord;
         
         ////////////////////////Second Test/////////////////////////
         Graph g2=new Graph(50,"LAN50");
           g2.addEdge();
           Dijkstra=DijkstraTestCase(g2);
           BallFord=BellmanFordTestCase(g2);
           if(Dijkstra<=BallFord)
               System.out.println("Dijkstra Algorithm is faster than Bellman-Ford");
           else
               System.out.println("Bellman-Ford Algorithm is faster than Dijkstra");
         TotalDijkstra=TotalDijkstra+Dijkstra;
         TotalBallFord=TotalBallFord+BallFord;
         
         ////////////////////////Third Test/////////////////////////
         Graph g3=new Graph(100,"LAN2");
           g3.addEdge();
           Dijkstra=DijkstraTestCase(g3);
           BallFord=BellmanFordTestCase(g3);
           if(Dijkstra<=BallFord)
               System.out.println("Dijkstra Algorithm is faster than Bellman-Ford");
           else
               System.out.println("Bellman-Ford Algorithm is faster than Dijkstra");
         TotalDijkstra=TotalDijkstra+Dijkstra;
         TotalBallFord=TotalBallFord+BallFord;
         
          ////////////////////////Fourth Test/////////////////////////
         Graph g4=new Graph(100,"LAN100");
           g4.addEdge();
           Dijkstra=DijkstraTestCase(g4);
           BallFord=BellmanFordTestCase(g4);
           if(Dijkstra<=BallFord)
               System.out.println("Dijkstra Algorithm is faster than Bellman-Ford");
           else
               System.out.println("Bellman-Ford Algorithm is faster than Dijkstra");
         TotalDijkstra=TotalDijkstra+Dijkstra;
         TotalBallFord=TotalBallFord+BallFord;
         
           ////////////////////////Fifth Test/////////////////////////
         Graph g5=new Graph(150,"LAN3");
           g5.addEdge();
           Dijkstra=DijkstraTestCase(g5);
           BallFord=BellmanFordTestCase(g5);
           if(Dijkstra<=BallFord)
               System.out.println("Dijkstra Algorithm is faster than Bellman-Ford");
           else
               System.out.println("Bellman-Ford Algorithm is faster than Dijkstra");
         TotalDijkstra=TotalDijkstra+Dijkstra;
         TotalBallFord=TotalBallFord+BallFord;
          
             ////////////////////////sixth Test/////////////////////////
         Graph g6=new Graph(150,"LAN150");
           g6.addEdge();
           Dijkstra=DijkstraTestCase(g6);
           BallFord=BellmanFordTestCase(g6);
           if(Dijkstra<=BallFord)
               System.out.println("Dijkstra Algorithm is faster than Bellman-Ford");
           else
               System.out.println("Bellman-Ford Algorithm is faster than Dijkstra");
         TotalDijkstra=TotalDijkstra+Dijkstra;
         TotalBallFord=TotalBallFord+BallFord;
         
              ////////////////////////seventh Test/////////////////////////
         Graph g7=new Graph(200,"LAN4");
           g7.addEdge();
           Dijkstra=DijkstraTestCase(g7);
           BallFord=BellmanFordTestCase(g7);
           if(Dijkstra<=BallFord)
               System.out.println("Dijkstra Algorithm is faster than Bellman-Ford");
           else
               System.out.println("Bellman-Ford Algorithm is faster than Dijkstra");
         TotalDijkstra=TotalDijkstra+Dijkstra;
         TotalBallFord=TotalBallFord+BallFord;
         
          ////////////////////////eightth Test/////////////////////////
         Graph g8=new Graph(200,"LAN200");
           g8.addEdge();
           Dijkstra=DijkstraTestCase(g8);
           BallFord=BellmanFordTestCase(g8);
           if(Dijkstra<=BallFord)
               System.out.println("Dijkstra Algorithm is faster than Bellman-Ford");
           else
               System.out.println("Bellman-Ford Algorithm is faster than Dijkstra");
         TotalDijkstra=TotalDijkstra+Dijkstra;
         TotalBallFord=TotalBallFord+BallFord;
         
             ////////////////////////ninth Test/////////////////////////
         Graph g9=new Graph(250,"LAN5");
           g9.addEdge();
           Dijkstra=DijkstraTestCase(g9);
           BallFord=BellmanFordTestCase(g9);
           if(Dijkstra<=BallFord)
               System.out.println("Dijkstra Algorithm is faster than Bellman-Ford");
           else
               System.out.println("Bellman-Ford Algorithm is faster than Dijkstra");
         TotalDijkstra=TotalDijkstra+Dijkstra;
         TotalBallFord=TotalBallFord+BallFord;

            ////////////////////////tenth Test/////////////////////////
         Graph g10=new Graph(250,"LAN250");
           g10.addEdge();
           Dijkstra=DijkstraTestCase(g10);
           BallFord=BellmanFordTestCase(g10);
           if(Dijkstra<=BallFord)
               System.out.println("Dijkstra Algorithm is faster than Bellman-Ford");
           else
               System.out.println("Bellman-Ford Algorithm is faster than Dijkstra");
         TotalDijkstra=TotalDijkstra+Dijkstra;
         TotalBallFord=TotalBallFord+BallFord;
     
         
         //////Last Result/////////////////
         TotalDijkstra=TotalDijkstra/10;
         TotalBallFord=TotalBallFord/10;
         System.out.println("");
         System.out.println("The Final Result is: ");
         if(TotalDijkstra<=TotalBallFord)
               System.out.print("Dijkstra Algorithm is faster than Bellman-Ford and total = "+TotalDijkstra+" ms");
           else
               System.out.print("Bellman-Ford Algorithm is faster than Dijkstra and total = "+TotalBallFord+" ms");
    }
    
    public static long DijkstraTestCase(Graph g){
        long Dtime=0;
        
    System.out.println("Test Case1 ");
    
           System.out.println("Solution Dijkstra Algorithm ");
             for (int i = 0; i < g.V ; i++) {
                 System.out.println("Routing Table of router ("+(i+1)+"): ");
                 System.out.println("Destenation:  source(destination,gateway) : ");
                 Dtime= g.dijkstra(g, i+1 ) + Dtime;
                System.out.println("");
        }
             long Daverege=Dtime/g.V;
             System.out.println("The Averege time of Dijkstra = "+Daverege+" ms");
             return Daverege;
    
    
    }
    public static long BellmanFordTestCase(Graph g)
    {
         long Btime=0;
        System.out.println("Solution Bellman-Ford Algorithm ");
             for (int i = 0; i < g.V ; i++) {
                 System.out.println("Routing Table of router ("+(i+1)+"): ");
                  System.out.println("Destenation:  source(destination,gateway) : ");
                 Btime= g.BellmanFord(g, i+1 )+Btime;
                  System.out.println("");
        }
             long Baverege=Btime/g.V;
             System.out.println("The Averege time of Bellman-Ford = "+Baverege+" ms");
             return Baverege;
    }

   
    public static void openFile()
    {
        try
        {
            outputTest=new Formatter("LAN0");
            output1 = new Formatter("LAN1");
            output50 = new Formatter("LAN50");
            output2 = new Formatter("LAN2");
            output100 = new Formatter("LAN100");
            output3 = new Formatter("LAN3");
            output150 = new Formatter("LAN150");
            output4 = new Formatter("LAN4");
            output200 = new Formatter("LAN200");
            output5 = new Formatter("LAN5");
            output250 = new Formatter("LAN250");
            
        }  
        catch(IOException ioException)
        {
            System.err.println("Error ");
            System.exit(1);
        }
            
    }
    

    
    public static int[] random5(int num,int i)
    {
            SecureRandom rand=new SecureRandom();
            int  a,b,c,d,e;
            int[]x = new int[5];
            a=1 + rand.nextInt(num);
             while(i==a)
             {
                      a=1 + rand.nextInt(num);
             }
            x[0]=a;
            b=1 + rand.nextInt(num);
            while(b==a||b==i)
            {
                b=1 + rand.nextInt(num);
            }
            x[1]=b;
             c=1 + rand.nextInt(num);
            while(c==a||c==i||c==b)
            {
                c=1 + rand.nextInt(num);
            }
            x[2]=c;
             d=1 + rand.nextInt(num);
            while(i==d||a==d||b==d||d==c)
            {
                d=1 + rand.nextInt(num);
            }
            x[3]=d;
             e=1 + rand.nextInt(num);
            while(i==e||a==e||b==e||e==c||e==d)
            {
                e=1 + rand.nextInt(num);
            }
            x[4]=e;

            return x;
     }
              
           public static void writeFile(int num,Formatter output ) throws IOException
    {
         Scanner input=new Scanner(System.in);
        SecureRandom rand=new SecureRandom();

      try{
      
            for (int i = 1; i <= num; i++) 
            {
                output.format("%s%d: ", "241.12.31.", i);
                int counter = 1 + rand.nextInt(5);
                int [] q = random5(num, i);
                for (int j = 0; j < counter; j++)
                {
                    output.format("%s%d ", "241.12.31.", q[j]);
                }
                
                if (i != num)
                  output.format("%n");
            }
      } catch(FormatterClosedException element)
            {
                System.err.println("Invaild");
                input.nextLine();
            }
      
    }

    public static void closeFile(Formatter output) {
        try {
            if (output != null) {
                output.close();
            }
        } catch (NoSuchElementException ioException) {
            System.err.println("");
        }
    }

}
