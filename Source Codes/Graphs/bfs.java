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
static void bfs(int s, ArrayList<ArrayList<Integer>> list, boolean vis[])
{
	LinkedList<Integer> queue=new LinkedList<>();
	vis[s]=true;
    queue.add(s);
    
    while(queue.size()!=0){
        int sy=queue.poll();
        System.out.print(sy+" ");
        
        for(int i=0;i<list.get(s).size();i++){
            if(!vis[list.get(s).get(i)]){
                vis[i]=true;
                queue.add(list.get(s).get(i));
            }
        }
      s++;
    }
    
}
}
















