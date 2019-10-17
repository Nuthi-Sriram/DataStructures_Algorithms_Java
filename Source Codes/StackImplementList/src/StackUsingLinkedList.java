
/**Java program to Implement a stack  using singly linked list */

import java.util.Scanner;

class Node {

	public int data;
	public Node link;
}

public class StackUsingLinkedList {

	Node top;

	StackUsingLinkedList() {
		top = null;
	}

	public void push(int x) {

		Node temp = new Node();

		temp.data = x;

		temp.link = top;

		top = temp;
	}

	public boolean isEmpty() {
		return top == null;
	}

	public int peek() {

		if (!isEmpty()) {
			return top.data;
		} else {
			System.out.println("Stack is empty");
			return -1;
		}
	}

	public void pop() {

		if (top == null) {
			System.out.print("\nStack Underflow");
		}

		top = top.link;
	}

	public void display() {
		if (top == null) {
			System.out.printf("\nStack Underflow");
		} else {
			Node temp = top;
			while (temp != null) {

				System.out.printf("%d->", temp.data);

				temp = temp.link;
			}
		}
	}

	public static void main(String[] args) {
		StackUsingLinkedList s = new StackUsingLinkedList();
		int option;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter one of the values to perform a stack function");
			System.out.println("1)Push-Inorder to push the element into an array");
			System.out.println("2)pop-Inorder to pop the element from an array");
			System.out.println("3)top-Inorder to see the top most element of an array");
			System.out.println("4)isEmpty-Inorder to Inorder to check whether an array is empty or not");
			System.out.println("5)Display-Inorder to see everyelement of an array");

			System.out.println("Press anyother key in order to terminate the program");
			option = sc.nextInt();
			switch (option) {
			case 1: {
				System.out.println("Enter the value which you want to push");
				int e = sc.nextInt();
				s.push(e);
			}
				break;

			case 2: {
				s.pop();
			}
				break;

			case 3: {
				int x = s.peek();
				System.out.println("The topmost element of an array is " + x);
			}
				break;
			case 4: {
				boolean x = s.isEmpty();
				if (x == true)
					System.out.println("The given stack is empty");
				else
					System.out.println("The given stack is not empty");

			}
				break;
			case 5: {
				System.out.println("The elements of the stack are");
				s.display();

			}
				break;

			}
		}

		while (option >= 1 && option <= 5);
		sc.close();

	}
}
