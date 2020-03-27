//A optimised implementation of bfs using an Arraylist and queue
// Program to implement bfs using ArrayList 

package practice;

//Depth first search implementation using ArrayList
import java.util.*;
public class Graphbfs{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    ArrayList<ArrayList<Integer>> list =new ArrayList<>();
    int nov=sc.nextInt();
    int edg=sc.nextInt();
    for(int i=0;i<nov;i++){
        list.add(i,new ArrayList<Integer>());
    }
    for(int i=0;i<edg;i++){
        int u=sc.nextInt();
        int v=sc.nextInt();
        list.get(u).add(v);
        list.get(v).add(u);
    }
    boolean vis[]=new boolean[nov];
     bfs(0,list,vis);
    
    



}
static void bfs(int src, ArrayList<ArrayList<Integer>> list, boolean vis[])
{
    Queue<Integer> q = new LinkedList<>();
        vis[src] = true;            // Intially mark source vertex as visited(true)
        q.add(src);                 // Push the source vertex to queue
        while(q.size() != 0)        // Till queue is not empty
        {
            src = q.poll();         
            System.out.print(src + " ");    // Print the front of queue
            Iterator<Integer> it = list.get(src).iterator();
            while (it.hasNext())    // Traverse through all the connected components of front
            {
                int n = it.next();
                if (!vis[n])        // If they are not visited, mark them visited and add to queue
                {
                    vis[n] = true;
                    q.add(n);
                }
            }
        }
}
}
















