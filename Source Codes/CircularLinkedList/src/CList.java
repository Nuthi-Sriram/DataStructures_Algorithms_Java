/**Implement circular linked list*/

import java.util.Scanner;

class CNode {
	public int data;
	public CNode next;

	public CNode(int item) {
		data = item;
		next = null;
	}
}

public class CList {
	CNode tail;

	CList() {
		tail = null;
	}

	public boolean isEmpty() {
		return tail == null;
	}

	public void insertFront(int x) {
		CNode temp = new CNode(x);
		if (tail == null) {
			tail = temp;
			temp.next = tail;
		} else {
			temp.next = tail.next;
			tail.next = temp;

		}
	}

	public void insertLast(int x) {
		CNode temp = new CNode(x);
		if (tail == null) {
			tail = temp;
			temp.next = tail;
		} else {
			temp.next = tail.next;
			tail.next = temp;
			tail = temp;
		}
	}

	public int deleteFront() {
		if (tail == null)
			return -1;
		else if (tail.next == null && tail.next == tail) {
			int x = tail.data;
			tail = null;
			return x;

		}

		else {
			int x = tail.next.data;
			tail.next = tail.next.next;
			return x;
		}

	}

	public int deleteLast() {
		CNode t = tail.next;
		if (t == null)
			return -1;
		else if (t.next == null) {
			int x = tail.data;
			tail = null;
			return x;
		} else {
			int x = tail.data;
			while (t.next != tail) {
				t = t.next;
			}
			t.next = tail.next;
			tail = t;
			return x;
		}
	}

	public void display() {
		CNode t = tail.next;
		do {
			System.out.print(t.data + " ");
			t = t.next;
		} while (t != tail.next);
	}

	public int count() {
		CNode t = tail.next;
		int c = 0;
		do {
			t = t.next;
			c++;
		} while (t != tail.next);

		return c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CList obj = new CList();
		int choice;

		do {
			System.out.println("Enter an operation of your choice");

			System.out.println("Enter 1 to perform insertFront");
			System.out.println("Enter 2 to perform insertLast");
			System.out.println("Enter 3 to perform deleteFront");
			System.out.println("Enter 4 to perform deleteLast");
			System.out.println("Enter 5 to check if it is isEmpty");
			System.out.println("Enter 6 to perform display");
			System.out.println("Enter 7 to count the number of Nodes");

			choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter the number to insertFront");
				int x = sc.nextInt();
				obj.insertFront(x);
			}
				break;
			case 2: {

				System.out.println("Enter the number to insertLast");
				int x = sc.nextInt();
				obj.insertLast(x);
			}
				break;
			case 3: {

				int x = obj.deleteFront();
				if (x == -1)
					System.out.println("The Linked List is empty");
				else
					System.out.println(x + "Has been removed from the List");

			}
				break;
			case 4: {

				int x = obj.deleteLast();
				if (x == -1)
					System.out.println("The Linked List is empty");
				else
					System.out.println(x + "Has been removed from the List");

			}
				break;
			case 5: {

				boolean x = obj.isEmpty();
				if (x == false)
					System.out.println("The Linked List is not empty");
				else
					System.out.println("The Linked List is empty " + x);

			}
				break;
			case 6: {

				obj.display();

			}
				break;
			case 7: {

				int c = obj.count();
				System.out.println("The number of nodes is " + c);

			}
				break;
			}
		} while (choice >= 1 && choice <= 7);
	}

}