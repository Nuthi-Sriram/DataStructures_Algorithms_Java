
/** Java program for linked-list implementation of queue */
import java.util.Scanner;

class QNode {
	int data;
	QNode next;

	public QNode(int data) {
		this.data = data;
		this.next = null;
	}
}

public class QueueUsingList {
	QNode front, rear;

	public QueueUsingList() {
		front = rear = null;
	}

	void enqueue(int data) {

		QNode temp = new QNode(data);

		if (this.rear == null) {
			this.front = this.rear = temp;
			return;
		}

		rear.next = temp;
		rear = temp;
		System.out.println(rear.data + " Has been enqueued");
	}

	int dequeue() {

		if (front == null)
			return -1;

		QNode temp = front;
		front = front.next;

		if (this.front == null)
			this.rear = null;
		return temp.data;
	}

	void display() {
		QNode t = front;
		while (t != rear) {
			System.out.println(t.data);
			t = t.next;
		}
		System.out.println(t.data);
	}

	public static void main(String[] args) {
		QueueUsingList s = new QueueUsingList();
		int option;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter one of the values to perform a queue function");
			System.out.println("1)Enqueue-Inorder to push the element into an array");
			System.out.println("2)Dequeue-Inorder to pop the element from an array");
			System.out.println("3)In order to display all the elements present in the queue");

			System.out.println("Press anyother key in order to terminate the program");
			option = sc.nextInt();
			switch (option) {
			case 1: {
				System.out.println("Enter the value which you want to push");
				int e = sc.nextInt();
				s.enqueue(e);
			}
				break;

			case 2: {
				int x = s.dequeue();
				System.out.println(x + " Has been dequeued");
			}
				break;

			case 3: {
				s.display();
			}
				break;

			}
		}

		while (option >= 1 && option <= 3);
		sc.close();
	}

}
