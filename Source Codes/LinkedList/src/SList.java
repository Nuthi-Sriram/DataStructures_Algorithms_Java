/**Implementation of Singly linked list*/

import java.util.Scanner;

class LNode {
	public int info;
	public LNode next;

	public LNode(int item) {
		info = item;
		next = null;
	}
}

public class SList {
	public LNode head, tail;

	public SList() {
		head = tail = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void insertFront(int x) {
		LNode temp = new LNode(x);
		if (head == null)
			head = tail = temp;
		else {
			temp.next = head;
			head = temp;
		}
	}

	public void insertLast(int x) {
		LNode temp = new LNode(x);
		if (head == null)
			head = tail = temp;
		else {
			tail.next = temp;
			tail = temp;
		}
	}

	public int deleteFront() {
		if (head == null)
			return -1;
		else if (head == tail) {
			int x = head.info;
			head = tail = null;
			return x;						
		}

		else {
			int x = head.info;
			head = head.next;
			return x;
		}

	}

	public int deleteLast() {
		if (head == null)
			return -1;
		else if (head == tail) {
			int x = tail.info;
			head = tail = null;
			return x;
		} else {
			LNode t = head;
			int x = tail.info;
			while (t.next.info != x) {
				t = t.next;
			}
			t.next = null;
			return x;
		}
	}

	public void display() {
		LNode t = head;
		while (t.next != null) {
			System.out.println(t.info);
			t = t.next;
		}
		System.out.println(t.info);

	}

	public int count() {
		LNode t = head;
		int c = 0;
		while (t != null) {
			t = t.next;
			c++;
		}
		return c;
	}

	public void insertAfter(int x, int y) {
		if (head == null)
			System.out.println("The linked list is empty");
		else {
			LNode temp = new LNode(y);
			LNode t = head;
			while (t != null && t.info != x) {
				t = t.next;
			}
			if (t == null)
				System.out.println("Element not found in order to be able to insert after");
			else {
				temp.next = t.next;
				t.next = temp;
			}
		}
	}

	public void insertBefore(int x, int y) {
		if (head == null)
			System.out.println("The Linked List is empty nothing to insert before");
		else {
			LNode temp = new LNode(y);
			LNode t = head;
			while (t != null && t.next.info != x) {
				t = t.next;
			}
			if (t == null)
				System.out.println("The entered element in not present in the List to perform an insertBefore");
			else {
				temp.next = t.next;
				t.next = temp;
			}

		}
	}

	public int deleteAfter(int x) {
		if (head == null)
			return -1;
		if (x == tail.info)
			return -2;
		else {
			LNode t = head;
			while (t != null && t.info != x)
				t = t.next;
			if (t == null)
				return -3;
			else {
				x = t.next.info;
				t.next = t.next.next;
				if (t.next == null) {
					tail = t;
					return x;
				}
				return x;
			}

		}
	}

	public int deleteBefore(int x) {
		if (head == null)
			return -1;
		if (x == head.info)
			return -2;
		else {
			LNode t = head;
			LNode t1 = null;
			while (t != null && t.next.info != x) {
				t1 = t;
				t = t.next;

			}
			if (t == null)
				return -3;
			else {
				if (t.next == head) {
					int y = deleteFront();
					return y;
				} else {
					int y = t.info;
					t1.next = t.next;
					return y;
				}

			}

		}
	}

	public int findNode(int x) {
		if (head == null)
			return -1;
		else {
			LNode t = head;
			int c = 1;
			while (t != null && t.info != x) {
				c++;
				t = t.next;

			}
			if (t == null)
				return -2;
			else {
				return c;
			}
		}
	}

	public int deleteNode(int x) {
		if (head == null)
			return -1;
		else {
			LNode t = head;
			if (head.info == x) {
				int y = head.info;
				head = head.next;
				return y;
			}
			while (t != null && t.next.info != x) {
				t = t.next;
			}
			if (t == null)
				return -2;
			else {
				int y = t.next.info;
				t.next = t.next.next;
				return y;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SList obj = new SList();
		int choice;

		do {
			System.out.println("Enter an operation of your choice");

			System.out.println("Enter 1 to perform insertFront");
			System.out.println("Enter 2 to perform insertLast");
			System.out.println("Enter 3 to perform deleteFront");
			System.out.println("Enter 4 to perform deleteLast");
			System.out.println("Enter 5 to check if it is isEmpty");
			System.out.println("Enter 6 to perform display");
			System.out.println("Enter 7 to count the number of nodes present in the Linked List");
			System.out.println("Enter 8 to perform Insertafter an element");
			System.out.println("Enter 9 to perform Insertbefore an element");
			System.out.println("Enter 10 to perform DeleteAfter an element");
			System.out.println("Enter 11 to perform DeleteBefore an element");
			System.out.println("Enter 12 to search for a particular node");
			System.out.println("Enter 13 to delete a particular node");

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
				if (x == true)
					System.out.println("The Linked List is Empty " + x);
				else
					System.out.println("The Linked List is not empty");

			}
				break;
			case 6: {

				obj.display();

			}
				break;
			case 7: {

				int x = obj.count();
				if (x == 0)
					System.out.println("The Linked List is empty " + x);
				else
					System.out.println(x + " Nodes are present in the Linked List");

			}
				break;

			case 8: {
				System.out.println("Enter the number you want to insert after");
				int x = sc.nextInt();
				System.out.println("Enter the number you want to insert");
				int y = sc.nextInt();
				obj.insertAfter(x, y);

			}
				break;
			case 9: {
				System.out.println("Enter the number you want to insert Before");
				int x = sc.nextInt();
				System.out.println("Enter the number you want to insert");
				int y = sc.nextInt();
				obj.insertBefore(x, y);

			}
				break;
			case 10: {
				System.out.println("Enter the number you want to Delete after");
				int x = sc.nextInt();
				x = obj.deleteAfter(x);
				if (x == -1)
					System.out.println("The Linked List is empty");
				else if (x == -2)
					System.out.println("Deletion not possible since already at the tail");
				else if (x == -3)
					System.out.println("Couldn't find the element");

				else
					System.out.println(x + "Has been removed from the List");

			}
				break;
			case 11: {
				System.out.println("Enter the number you want to Delete before");
				int x = sc.nextInt();
				x = obj.deleteBefore(x);
				if (x == -1)
					System.out.println("The Linked List is empty");
				else if (x == -2)
					System.out.println("Deletion not possible since already at the head");
				else if (x == -3)
					System.out.println("Couldn't find the element");

				else
					System.out.println(x + "Has been removed from the List");

			}
				break;
			case 12: {
				System.out.println("Enter the node data which you want to search for");
				int x = sc.nextInt();
				x = obj.findNode(x);
				if (x == -1)
					System.out.println("The Linked List is empty");
				else if (x == -2)
					System.out.println("Node not present in the Linked List");

				else
					System.out.println("The Node is present at " + x + " position");

			}
				break;
			case 13: {
				System.out.println("Enter the node data which you want to delete");
				int x = sc.nextInt();
				x = obj.deleteNode(x);
				if (x == -1)
					System.out.println("The Linked List is empty");
				else if (x == -2)
					System.out.println("Node not present in the Linked List");

				else
					System.out.println(x + " has been deleted from the List");

			}
				break;
			}
		} while (choice >= 1 && choice <= 13);
		sc.close();
	}

}