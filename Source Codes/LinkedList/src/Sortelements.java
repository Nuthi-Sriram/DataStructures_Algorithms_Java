
/**Sort the elements in a linked list*/

import java.util.Scanner;

public class Sortelements {

	public void sort(SList L1) {
		LNode current = L1.head;
		LNode index;
		int temp;
		if (L1.head == null)
			System.out.println("Empty list");
		while (current != null) {
			index = current.next;
			while (index != null) {
				if (current.info > index.info) {
					temp = current.info;
					current.info = index.info;
					index.info = temp;
				}
				index = index.next;
			}
			current = current.next;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		SList L1 = new SList();
		Sortelements obj = new Sortelements();
		System.out.println("Enter the number of elements you want to enter into the list");
		int n = sc.nextInt();
		System.out.println("Start entering the values into the linked list");
		while (n != 0) {
			System.out.println("Enter the element to insert last");
			int x = sc.nextInt();
			L1.insertLast(x);
			n--;
		}
		obj.sort(L1);
		L1.display();
		sc.close();
	}
}
