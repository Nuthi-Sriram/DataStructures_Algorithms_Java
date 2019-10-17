/** Implementing a Circular queue */
import java.util.Scanner;

public class CircularQueue {
	private int maxSize;
	private int f, r, a[];

	public CircularQueue(int S) {
		maxSize = S;
		a = new int[S];
		f = r = -1;
	}

	int enqueue(int x) {

		if (f == (r + 1) % maxSize)
			return -1;
		else if (f == -1 || r == -1) {
			f++;
			r++;
			a[r] = x;
			return x;
		} else {
			r = (r + 1) % maxSize;
			a[r] = x;
			return x;

		}

	}

	int dequeue() {
		if (f == -1)
			return -1;
		else if (f == r) {
			int x = a[f];
			f = r = -1;
			return x;
		} else {
			int x = a[f];
			f = (f + 1) % maxSize;
			return x;
		}
	}

	int isEmpty() {
		if (f == -1 && r == -1)
			return 1;
		else
			return 0;
	}

	int size() {
		if (f == -1)
			return 0;
		else if (f <= r)
			return r - f + 1;
		else
			return r - f + 1 + maxSize;
	}

	int display() {
		if (f == -1 && r == -1)
			return -1;
		else {
			int i;
			for (i = f; i != r; i = (i + 1) % maxSize)
				System.out.println(a[i]);
			System.out.println(a[i]);

			return 0;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("Enter the size of the Circular queue");
		int S = sc.nextInt();
		CircularQueue obj = new CircularQueue(S);

		do {
			System.out.println("Enter an operation of your choice");

			System.out.println("Enter 1 to perform Enqueue");
			System.out.println("Enter 2 to perform Dequeue");
			System.out.println("Enter 3 to perform isEmpty");
			System.out.println("Enter 4 to perform size");
			System.out.println("Enter 5 to perform display");
			choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter the number to enqueue");
				int x = sc.nextInt();
				int check = obj.enqueue(x);
				if (check == x)
					System.out.println(x + "Has been enqueue");
				else
					System.out.println("Overflow");
			}
				break;
			case 2: {

				int x = obj.dequeue();
				if (x == -1)
					System.out.println("Underflow");
				else
					System.out.println(x + "Has been dequeued");
			}
				break;
			case 3: {

				int x = obj.isEmpty();
				if (x == 1)
					System.out.println("The queue is empty");
				else
					System.out.println("The queue is not empty");

			}
				break;
			case 4: {

				int x = obj.size();
				if (x == -1)
					System.out.println("The queue is empty" + x);
				else
					System.out.println(x);

			}
				break;
			case 5: {

				int x = obj.display();
				if (x == -1)
					System.out.println("The queue is empty" + x);

			}
				break;
			}
		} while (choice >= 1 && choice <= 5);

	}
}
