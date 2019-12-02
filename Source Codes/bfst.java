import java.util.Iterator;
import java.util.Scanner;
import java.util.LinkedList;

class graphs {
		Scanner sc=new Scanner(System.in);
	int a[][] = new int[10][10];
	int n1;
	int visited[] = new int[10];

	public graphs(int n) {
		 n1 = n;
		for (int i = 0; i < n; i++)
			visited[i] = 0;
	}

	void read() {
		for (int i = 0; i < n1; i++) {
			for (int j = 0; j < n1; j++) {
				a[i][j] = sc.nextInt();
			}
		}
	}

	 void bfs(int s) 
	    { 
	       
	  
	        LinkedList<Integer> queue = new LinkedList<Integer>(); 
	  
	        // Mark the current node as visited and enqueue it 
	        visited[s]=1; 
	        queue.add(s); 
	  
	        while (queue.size() != 0) 
	        { int x=0;
	            // Dequeue a vertex from queue and print it 
	            s = queue.poll(); 
	            System.out.println(s+" "); 
	  
	            for(int j=0;j<n1;j++){
	            	if((visited[j]!=1)&&a[x][j]==1){
	            		visited[j]=1;
	            		System.out.println(j);
	            		queue.add(j);
	            		x=j;
	            	}
	            }
	            
	        } 
	    } 
	
}

public class bfst {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of vertices which you want to enter into the graph");
		int n=sc.nextInt();
		graphs g=new graphs(n);
		System.out.println("Enter the values into the adjacency matrix ");
		g.read();
		g.bfs(0);
		sc.close();
	}

}
