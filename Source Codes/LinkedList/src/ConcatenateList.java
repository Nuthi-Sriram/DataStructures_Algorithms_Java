
/**To concatenate two Linked List*/

import java.util.Scanner;

public class ConcatenateList {

	public void concatenate(SList L1, SList L2) {
		L1.tail.next = L2.head;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SList L1 = new SList();
		SList L2 = new SList();
		ConcatenateList obj = new ConcatenateList();
		System.out.println("Enter number of numbers which you want to enter into the list");
		int n = sc.nextInt();
		System.out.println("Start entering the values into L1");
		while (n != 0) {
			System.out.println("Enter the number to insertLast");
			int x = sc.nextInt();
			L1.insertLast(x);
			n--;
		}
		System.out.println("Enter number of numbers which you want to enter into the list");
		n = sc.nextInt();
		System.out.println("Start entering the values into L2");
		while (n != 0) {

			System.out.println("Enter the number to insertLast");
			int y = sc.nextInt();
			L2.insertLast(y);
			n--;
		}
		obj.concatenate(L1, L2);
		System.out.println("The concatenated list is ");
		L1.display();
		sc.close();
	}

}
