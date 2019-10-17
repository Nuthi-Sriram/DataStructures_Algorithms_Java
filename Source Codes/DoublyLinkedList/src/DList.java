/**Implementing a doubly linked list*/

import java.util.Scanner;

class Dnode {
	public int data;
	public Dnode next, prev;

	public Dnode(int data) {
		this.data = data;
		next = prev = null;
	}
}

public class DList {
	public Dnode head, tail;

	public DList() {
		head = tail = null;
	}

	void insertFront(int x) {
		Dnode temp = new Dnode(x);
		if (head == null) {
			head = tail = temp;
		} else {
			temp.next = head;
			head.prev = temp;
			head = temp;

		}
	}

	void insertRear(int x) {
		Dnode temp = new Dnode(x);
		if (tail == null)
			head = tail = temp;
		else {
			temp.prev = tail;
			tail.next = temp;
			tail = temp;
		}
	}

	int deleteFront() {
		if (head == null)
			return -1;
		else if (head == tail) {
			int x = head.data;
			head = tail = null;
			return x;
		} else {
			int x = head.data;
			head = head.next;
			head.prev = null;
			return x;
		}

	}

	int deleteLast() {
		if (tail == null)
			return -1;
		else if (head == tail) {
			int x = tail.data;
			head = tail = null;
			return x;
		} else {
			int x = tail.data;
			tail = tail.prev;
			tail.next = null;
			return x;
		}
	}

	public boolean isEmpty() {
		return head == null;
	}

	void display() {
		Dnode t = head;
		while (t != null) {
			System.out.println(t.data);
			t = t.next;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DList obj = new DList();
		int choice;

		do {
			System.out.println("Enter an operation of your choice");

			System.out.println("Enter 1 to perform insertFront");
			System.out.println("Enter 2 to perform insertLast");
			System.out.println("Enter 3 to perform deleteFront");
			System.out.println("Enter 4 to perform deleteLast");
			System.out.println("Enter 5 to check if it is isEmpty");
			System.out.println("Enter 6 to perform display");

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
				obj.insertRear(x);
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
				if (x== false)
					System.out.println("The Linked List is not empty");
				else
					System.out.println("The Linked List is empty " + x);

			}
				break;
			case 6: {

				obj.display();

			}
				break;
			}
		} while (choice >= 1 && choice <= 6);

	}

}