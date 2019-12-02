import java.util.Scanner;

class graph {
		Scanner sc=new Scanner(System.in);
	int a[][] = new int[10][10];
	int n1;
	int visited[] = new int[10];

	public graph(int n) {
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

	void dfs(int node) {
		visited[node] = 1;
		System.out.println(node);
		for (int j = 0; j < n1; j++) {
			if ((visited[j] != 1) && a[node][j] == 1) {
				dfs(j);
			}
		}
	}
	
}

public class dfsf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of vertices which you want to enter into the graph");
		int n=sc.nextInt();
		graph g=new graph(n);
		System.out.println("Enter the values into the adjacency matrix ");
		g.read();
		g.dfs(0);
		sc.close();
	}

}
