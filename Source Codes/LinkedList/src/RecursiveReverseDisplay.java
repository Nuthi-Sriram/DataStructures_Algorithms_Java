
/**Reverse the linked list(Reverse Display) using recursive functions*/

import java.util.Scanner;

public class RecursiveReverseDisplay {

	public void printReverse(LNode head) {
		if (head == null)
			return;
		printReverse(head.next);

		System.out.print(head.info + " ");
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		SList L1 = new SList();
		RecursiveReverseDisplay obj = new RecursiveReverseDisplay();
		System.out.println("Enter the number of elements you want to enter into the list");
		int n = sc.nextInt();
		System.out.println("Start entering the values into the linked list");
		while (n != 0) {
			System.out.println("Enter the element to insert last");
			int x = sc.nextInt();
			L1.insertLast(x);
			n--;
		}
		obj.printReverse(L1.head);
		sc.close();
	}

}
